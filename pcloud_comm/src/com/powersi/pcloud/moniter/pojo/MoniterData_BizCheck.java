package com.powersi.pcloud.moniter.pojo;

/**
 * 基金监控实体类
 * @author 李腾
 *
 */
public class MoniterData_BizCheck extends MoniterData {

	private static final long serialVersionUID = 1L;

	public MoniterData_BizCheck() {
		super("BIZCHECK");

	}

	private String host_ip;// 监控数据库服务器ip
	private String data_type; // 数据所属指标类型
	private String data_json;// 各个指标json结果集

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

	public String getData_json() {
		return data_json;
	}

	public void setData_json(String data_json) {
		this.data_json = data_json;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
