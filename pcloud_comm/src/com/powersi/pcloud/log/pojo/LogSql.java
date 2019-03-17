package com.powersi.pcloud.log.pojo;


import com.powersi.comm.bean.BaseBean;
/**
 * sql日志对象 - es
 * @author 路杨
 *
 */
public class LogSql extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String id;//id=AV2B5b09iUaJFUrUPZux
	private String log_time;//日志记录时间,yyyy-MM-dd HH:mm:ss
	private String log_time_str;//日志记录时间字符串,yyyyMMddHHmmss
	private String server_uuid;//产生日志的服务器uuid
	private String app_name;//对应的业务系统标识名称
	private String log_outline;//日志概要，从长内容中截取的第一行或者前n个字节
	private String log_detail;//日志详情
	private String biz_uuid;//业务识别号
	private int exec_time;//执行耗时（毫秒）
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
	public String getLog_detail() {
		return log_detail;
	}
	public void setLog_detail(String log_detail) {
		this.log_detail = log_detail;
	}
	public String getBiz_uuid() {
		return biz_uuid;
	}
	public void setBiz_uuid(String biz_uuid) {
		this.biz_uuid = biz_uuid;
	}
	public int getExec_time() {
		return exec_time;
	}
	public void setExec_time(int exec_time) {
		this.exec_time = exec_time;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

}
