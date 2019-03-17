package com.powersi.pcloud.moniter.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * oracle数据类型采集实体类
 * @author 李腾
 *
 */

public class MoniterOracleHour extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	private String assist_uuid;
	private String data_time;
	private String host_ip;
	private String oper_user;
	private String data_type;
	private String sql_text;
	private int order;
	private double data_val;
	public String getAssist_uuid() {
		return assist_uuid;
	}
	public void setAssist_uuid(String assist_uuid) {
		this.assist_uuid = assist_uuid;
	}
	public String getData_time() {
		return data_time;
	}
	public void setData_time(String data_time) {
		this.data_time = data_time;
	}
	public String getHost_ip() {
		return host_ip;
	}
	public void setHost_ip(String host_ip) {
		this.host_ip = host_ip;
	}
	public String getOper_user() {
		return oper_user;
	}
	public void setOper_user(String oper_user) {
		this.oper_user = oper_user;
	}
	public String getData_type() {
		return data_type;
	}
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public double getData_val() {
		return data_val;
	}
	public void setData_val(double data_val) {
		this.data_val = data_val;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getSql_text() {
		return sql_text;
	}
	public void setSql_text(String sql_text) {
		this.sql_text = sql_text;
	}
	
}
