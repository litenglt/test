package com.powersi.pcloud.cache;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.powersi.mq.Consumer;
import com.powersi.mq.MQCallback;
/**
 * 缓存刷新消息接收的帮助类，由于存在多个需要进行刷新操作工程需要用到，所以定义在comm工程上面
 * 但此service并不是每个工程都需要用到，请采用xml的方式注入Bean到pcloud_cacherefresh.xml文件中
 * 在需要的工程中添加pcloud_cacherefresh.xml这个配置文件即可使用
 * @author 黄尧
 *
 */
public class CacheRefreshGatherHandler implements MQCallback{
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	/**
	 * 进行缓存刷新的MQ消息队列前缀名
	 */
	private static final String CACHEREFRESH = "CACHEREFRESH";
	
	private ProjectNameHandler projectNameHandler;

	Consumer consumer;
	
	
	/**
	 * 进行缓存刷新MQ的接收
	 */
	@PostConstruct
	public void gatherCacheRefreshMQ(){
		String projectName = projectNameHandler.getProjectNameHadle();
		//指定列表名
		String listName = CACHEREFRESH + "_" + projectName;
		consumer.createConsumer(listName, this);
	}

	@Override
	public void onMessageArrived(String msgName, Object msgParam) {
		if (msgParam == null) {//获取的数据为空,则return
			return;
		}
		projectNameHandler.refreshCache((String)msgParam);
	}

	public Consumer getConsumer() {
		return consumer;
	}


	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}

	public ProjectNameHandler getProjectNameHandler() {
		return projectNameHandler;
	}

	public void setProjectNameHandler(ProjectNameHandler projectNameHandler) {
		this.projectNameHandler = projectNameHandler;
	}
	
	
}
