package com.powersi.pcloud.alarm.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * 对应alarm_service表
 * @author 李志钢
 *
 */
public class AlarmService extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String service_code;
	private String service_name;
	private String logo;
	
	
	public String getService_code() {
		return service_code;
	}
	public void setService_code(String service_code) {
		this.service_code = service_code;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
}
