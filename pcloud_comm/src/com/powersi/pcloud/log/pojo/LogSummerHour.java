package com.powersi.pcloud.log.pojo;

import com.powersi.comm.bean.BaseBean;

/**每小时日志汇总表
 * 统计每小时日志的数量
 * @author 彭刚
 *
 */
public class LogSummerHour extends BaseBean{

	private static final long serialVersionUID = 1L;
	private long id;
	private String s_day;//日期 yyyymmdd
	private String s_hour;//小时00-23
	private String app_name;//对应的业务系统标识名称
	private String module_name;//对应的模块名称
	private String log_type;//日志类别，大写: DEBUG, ERROR, INFO, WARM
	private long count;//数量
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getS_day() {
		return s_day;
	}
	public void setS_day(String s_day) {
		this.s_day = s_day;
	}
	public String getS_hour() {
		return s_hour;
	}
	public void setS_hour(String s_hour) {
		this.s_hour = s_hour;
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
	public String getLog_type() {
		return log_type;
	}
	public void setLog_type(String log_type) {
		this.log_type = log_type;
	}
	
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
