package com.powersi.pcloud.moniter.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * 基金监控存储实体类
 * 
 * @author liteng
 *
 */
public class MoniterBizCheckInfo extends BaseBean {

	private static final long serialVersionUID = 1L;
	private long id;
	private String assist_uuid; // 服务器assis_uuid
	private String data_time; // 数据采集时间
	private String host_ip; // 服务器ip
	private String norm_name; // 监控类型
	private String data_json; // 监控结果集

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public String getNorm_name() {
		return norm_name;
	}

	public void setNorm_name(String norm_name) {
		this.norm_name = norm_name;
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
