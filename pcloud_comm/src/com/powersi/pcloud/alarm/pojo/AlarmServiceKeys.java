package com.powersi.pcloud.alarm.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * 对应alarm_service_keys表
 * @author 李志钢
 *
 */
public class AlarmServiceKeys extends BaseBean {
	private static final long serialVersionUID = 1L;

	private String service_code;
	private String key_code;
	private String key_name;
	private String key_unit;
	public String getService_code() {
		return service_code;
	}
	public void setService_code(String service_code) {
		this.service_code = service_code;
	}
	public String getKey_code() {
		return key_code;
	}
	public void setKey_code(String key_code) {
		this.key_code = key_code;
	}
	public String getKey_name() {
		return key_name;
	}
	public void setKey_name(String key_name) {
		this.key_name = key_name;
	}
	public String getKey_unit() {
		return key_unit;
	}
	public void setKey_unit(String key_unit) {
		this.key_unit = key_unit;
	}
	
}
