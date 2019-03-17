package com.powersi.pcloud.msg.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.powersi.comm.utils.ToolUtil;
import com.powersi.mq.Producer;
import com.powersi.pcloud.dict.service.DictService;
import com.powersi.pcloud.utils.PcloudDateUtil;

/**
 * 通过消息队列负责推送消息的服务
 * 在需要使用的工程中xml中进行bean的定义,成员也是如此
 * 
 * @author lingang
 */
public class MsgPushService {

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 消息推送消息队列key
	 */
	public static String POWERSI_MSG_PUSH = "POWERSI_MSG_PUSH";
	
	Producer producer;
	
	@Autowired
	private DictService dictService;
	
	/**
	 * 消息推送,发送消息队列
	 * @param msg_title 推送消息标题
	 * @param msg_content 推送消息内容信息
	 */
	public void msgPush(String msg_title,String msg_content) {
		
		//字典配置是否开启消息推送 默认-0 不开启  1 开启
		int open_msg_push = dictService.getValue_int("MSG_PUSH_PARAM", "open_msg_push",0);
		if (open_msg_push == 0) {
			logger.info("平台进行消息推送，发送消息队列,但是未开启消息推送（字典：MSG_PUSH_PARAM - open_msg_push），"
					+ "发送失败,消息内容：\r\n {} \r\n{}",msg_title,msg_content);
			return;
		}
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("msg_title", msg_title);
		map.put("msg_time",PcloudDateUtil.timeDateToStr(new Date(), "yyyy-MM-dd HH:mm:ss"));
		map.put("msg_content", msg_content);
		
		//2019-01-31 lingang 由生成消息的地方指定推送的人员信息，多个标识 逗号分隔
		String msg_pushuser = dictService.getValue("MSG_PUSH_PARAM", "msg_pushuser");
		if (StringUtils.isBlank(msg_pushuser)) {
			logger.error("平台进行消息推送，发送消息队列,推送消息失败，没有维护推送的人员信息（字典：MSG_PUSH_PARAM - msg_pushuser），发送失败,消息内容：\r\n {} \r\n {}",msg_title,msg_content);
			return;
		}
		map.put("msg_pushuser", msg_pushuser);
		
		String msg_json = ToolUtil.obj2JsonStr(map);
		
		logger.info("平台进行消息推送，发送消息队列,消息内容：\r\n{}",msg_json);
		producer.send(POWERSI_MSG_PUSH, msg_json);
	}
	
	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}
	
}
