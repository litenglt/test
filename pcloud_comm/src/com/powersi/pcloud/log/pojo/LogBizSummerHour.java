package com.powersi.pcloud.log.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * 按小时汇总业务监控表
 * @author 彭刚
 *
 */
public class LogBizSummerHour extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String s_day;//日期
	private String s_hour;//小时00-23
	private String app_name;//对应的业务系统标识名称
	private String func_id;//业务功能标识
	private long count_err;//执行失败的次数
	private long count_ok;//执行成功次数
	private float time_max;//最慢时间，单位秒
	private float time_avg;//平均访问时间，单位秒
	private long sum_count;//执行总次数
	private String func_desc;//功能描述
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
	public String getFunc_id() {
		return func_id;
	}
	public void setFunc_id(String func_id) {
		this.func_id = func_id;
	}
	public long getCount_err() {
		return count_err;
	}
	public void setCount_err(long count_err) {
		this.count_err = count_err;
	}
	public long getCount_ok() {
		return count_ok;
	}
	public void setCount_ok(long count_ok) {
		this.count_ok = count_ok;
	}
	public float getTime_max() {
		return time_max;
	}
	public void setTime_max(float time_max) {
		this.time_max = time_max;
	}
	public float getTime_avg() {
		return time_avg;
	}
	public void setTime_avg(float time_avg) {
		this.time_avg = time_avg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getSum_count() {
		return sum_count;
	}
	public void setSum_count(long sum_count) {
		this.sum_count = sum_count;
	}
	public String getFunc_desc() {
		return func_desc;
	}
	public void setFunc_desc(String func_desc) {
		this.func_desc = func_desc;
	}
}