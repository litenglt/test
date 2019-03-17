package com.powersi.pcloud.moniter.pojo;

/**
 * sql监控数据实体
 * @author 黄尧
 *
 */
public class MoniterData_Sql extends MoniterData {
	public MoniterData_Sql(){
		super("SQL");
	}
	private static final long serialVersionUID = 1L;
	private long id;
    private String app_name;//应用名称
    private String sql_key;//经过md5加密之后的sql
    private double exec_err_rate; //在一分钟内执行的sql的出错率(小数，如0.85)
    private int exec_total; //当天sql执行的总数
    private double exec_avg_time;   //当天sql执行的平均时间(s)
    private double fetch_avg_time;   //当天sql取数的平均时间(s)
    private int max_record_count; //当天最大记录数
    private String host_ip;
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	public String getSql_key() {
		return sql_key;
	}
	public void setSql_key(String sql_key) {
		this.sql_key = sql_key;
	}
	public double getExec_err_rate() {
		return exec_err_rate;
	}
	public void setExec_err_rate(double exec_err_rate) {
		this.exec_err_rate = exec_err_rate;
	}
	public int getExec_total() {
		return exec_total;
	}
	public void setExec_total(int exec_total) {
		this.exec_total = exec_total;
	}
	public double getExec_avg_time() {
		return exec_avg_time;
	}
	public void setExec_avg_time(double exec_avg_time) {
		this.exec_avg_time = exec_avg_time;
	}
	public double getFetch_avg_time() {
		return fetch_avg_time;
	}
	public void setFetch_avg_time(double fetch_avg_time) {
		this.fetch_avg_time = fetch_avg_time;
	}
	public int getMax_record_count() {
		return max_record_count;
	}
	public void setMax_record_count(int max_record_count) {
		this.max_record_count = max_record_count;
	}
	public String getHost_ip() {
		return host_ip;
	}
	public void setHost_ip(String host_ip) {
		this.host_ip = host_ip;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
