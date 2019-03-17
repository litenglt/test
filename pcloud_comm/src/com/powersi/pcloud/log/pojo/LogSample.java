package com.powersi.pcloud.log.pojo;

import com.powersi.comm.bean.BaseBean;


/**
 * 平台运行日志表 
 * 存储平台运行日志信息（es）
 * @author 路杨
 */
public class LogSample  extends BaseBean{
	private static final long serialVersionUID = 1L;
	private String id;//id=AV2B5b09iUaJFUrUPZux
	private String log_time;//日志记录时间，格式yyyy-MM-dd HH:mm:ss
	private String log_time_str;//日志记录时间的字符串，格式yyyyMMddHHmmss
	private String server_uuid;//服务器uuid
	private String app_name;//应用名
	private String module_name;//对应的模块名称
	private String log_outline;//日志概要
	private String log_detail;//日志详细记录
	private String log_type;////日志类别，大写: DEBUG, ERROR, INFO, WARN
	private String biz_uuid;//业务识别号
	private String host_ip;//服务器ip地址
	private String table_name;//动态表名
	
	public String getLog_outline() {
		return log_outline;
	}
	public void setLog_outline(String log_outline) {
		this.log_outline = log_outline;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLog_time() {
		return log_time;
	}
	public void setLog_time(String log_time) {
		this.log_time = log_time;
	}
	public String getLog_time_str() {
		return log_time_str;
	}
	public void setLog_time_str(String log_time_str) {
		this.log_time_str = log_time_str;
	}
	public String getServer_uuid() {
		return server_uuid;
	}
	public void setServer_uuid(String server_uuid) {
		this.server_uuid = server_uuid;
	}
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	
	public String getModule_name() {
		return module_name;
	}
	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}
	public String getLog_detail() {
		return log_detail;
	}
	public void setLog_detail(String log_detail) {
		this.log_detail = log_detail;
	}
	public String getLog_type() {
		return log_type;
	}
	public void setLog_type(String log_type) {
		this.log_type = log_type;
	}
	public String getBiz_uuid() {
		return biz_uuid;
	}
	public void setBiz_uuid(String biz_uuid) {
		this.biz_uuid = biz_uuid;
	}
	public String getHost_ip() {
		return host_ip;
	}
	public void setHost_ip(String host_ip) {
		this.host_ip = host_ip;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	
}
