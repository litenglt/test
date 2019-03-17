package com.powersi.pcloud.log.pojo;


import com.powersi.comm.bean.BaseBean;

/**
 * 业务日志表
 * @author 彭刚
 *
 */
public class LogBiz extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String log_time;
	private String log_time_str;//es新增
	private String server_uuid;//产生日志的服务器uuid
	private String app_name;//对应的业务系统表示名称
	private String biz_uuid;//业务识别号
	private double exec_time;//执行耗时（秒）
	private String func_id;//业务功能标识
	private String exec_flag;//执行成功标志0/1
	private String table_name;//表名
	private String log_detail;
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
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
	public String getBiz_uuid() {
		return biz_uuid;
	}
	public void setBiz_uuid(String biz_uuid) {
		this.biz_uuid = biz_uuid;
	}
	
	public double getExec_time() {
		return exec_time;
	}
	public void setExec_time(double exec_time) {
		this.exec_time = exec_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getFunc_id() {
		return func_id;
	}
	public void setFunc_id(String func_id) {
		this.func_id = func_id;
	}
	public String getExec_flag() {
		return exec_flag;
	}
	public void setExec_flag(String exec_flag) {
		this.exec_flag = exec_flag;
	}
	public String getLog_detail() {
		return log_detail;
	}
	public void setLog_detail(String log_detail) {
		this.log_detail = log_detail;
	}
	
}
