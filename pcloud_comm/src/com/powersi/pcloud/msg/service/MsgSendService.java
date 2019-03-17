package com.powersi.pcloud.msg.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.powersi.mq.Producer;
import com.powersi.pcloud.msg.pojo.BasMsg;

/**
 * 负责发送消息的服务
 * 在需要使用的工程中xml中进行bean的定义,成员也是如此
 * @author 李志钢
 *
 */
public class MsgSendService {
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	Producer producer;
	
	/**
	 * 向集群中指定列表名发送系统通知消息
	 * @param basMsg 系统通知消息
	 */
	public void send(BasMsg basMsg){
		//指定列表名
		String listName = "POWERSI_PCLOUD_WEB_MSG";
		producer.send(listName, basMsg);
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}
	
}
