package com.powersi.pcloud.moniter.pojo;

import java.util.List;

public class MoniterData_Oracle extends MoniterData {

	private static final long serialVersionUID = 1L;
	public MoniterData_Oracle() {
		super("ORACLE");
	}
	private String host_ip;//监控数据库服务器ip
    private String data_type; //指标类型
    public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private List<OracleParam> list;//各个指标情况
	public String getHost_ip() {
		return host_ip;
	}
	public void setHost_ip(String host_ip) {
		this.host_ip = host_ip;
	}
	public String getData_type() {
		return data_type;
	}
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}
	public List<OracleParam> getList() {
		return list;
	}
	public void setList(List<OracleParam> list) {
		this.list = list;
	}
    
}
