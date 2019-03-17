package com.powersi.pcloud.bas_service;

import com.powersi.comm.bean.BaseBean;

/**
 * 服务信息表
 * @author 彭刚
 *
 */
public class BasService extends BaseBean{

	private static final long serialVersionUID = 1L;
	private int id;
	private String assist_uuid;//服务器uuid
	private String service_name;//服务名称，简拼or英语大写 CALC, DBSERVICE, MYSQL
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssist_uuid() {
		return assist_uuid;
	}
	public void setAssist_uuid(String assist_uuid) {
		this.assist_uuid = assist_uuid;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
