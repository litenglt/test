package com.powersi.comm.pojo;

import java.util.Date;

import com.powersi.comm.bean.BaseBean;

/**
 * 日志 父类
 * @author luoji_000
 *
 */
public class BasLog extends BaseBean{
	
	public static final String TYPE_LOGIN = "LOGN";
	public static final String TYPE_LOGIN_OUT = "LOGIN_OUT";

	public static final String TYPE_SAVE = "SAVE";
	public static final String TYPE_SELECT= "SELECT";
	public static final String TYPE_UPDATE = "UPDATE";
	public static final String TYPE_DELETE = "DELETE";
	
	public static final String LOG_LEVEL_DEBUG = "debug";
	public static final String LOG_LEVEL_LOG = "log";
	public static final String LOG_LEVEL_ERROR = "error";
	
	public static final String SUCCESS = "1";
	public static final String SUCCESS_NOT = "0";
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private Date oper_time = new Date();//操作时间
	private String oper_memo;//操作说明
	private String log_level;//日志级别
	private String user_code;//操作用户登录代码
	private String user_name;//用户名
	private String success_flag;//成功标志 1/0
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUser_code() {
		return user_code;
	}
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getOper_memo() {
		return oper_memo;
	}
	public void setOper_memo(String oper_memo) {
		this.oper_memo = oper_memo;
	}
	public String getSuccess_flag() {
		return success_flag;
	}
	public void setSuccess_flag(String success_flag) {
		this.success_flag = success_flag;
	}
	public String getLog_level() {
		return log_level;
	}
	public void setLog_level(String log_level) {
		this.log_level = log_level;
	}
	public Date getOper_time() {
		return oper_time;
	}
	public void setOper_time(Date oper_time) {
		this.oper_time = oper_time;
	}
	
}
