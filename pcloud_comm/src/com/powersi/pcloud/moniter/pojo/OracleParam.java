package com.powersi.pcloud.moniter.pojo;

import com.powersi.comm.bean.BaseBean;

public class OracleParam extends BaseBean{
	private static final long serialVersionUID = 1L;
	private String oper_user;
    private int order;
    private double data_val;
    private String sql_text;
    
	public String getOper_user() {
		return oper_user;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setOper_user(String oper_user) {
		this.oper_user = oper_user;
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
	public String getSql_text() {
		return sql_text;
	}
	public void setSql_text(String sql_text) {
		this.sql_text = sql_text;
	}
    
}
