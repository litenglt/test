package com.powersi.pcloud.alarm.pojo;

import java.util.Date;

import com.powersi.comm.bean.BaseBean;

public class AlarmStateList extends BaseBean{
	private static final long serialVersionUID = 1L;
	private String service_code;// varchar(32) NOT NULL COMMENT '服务名称，如：MYSQL, REDIS等，纯粹服务器的告警为OS',
	private String server_uuid;// varchar(64) NOT NULL COMMENT '产生告警的服务器uuid',
	private String service_key;// varchar(32) NOT NULL COMMENT '监控的指标，根据服务不同而不同，例如：MYSQL包括：IOPS, CONNECTION等',
	private Date alarm_time;// datetime NOT NULL COMMENT '最新的告警时间',
	private Date alarm_save_time;//最后保存告警时间
	public String getService_code() {
		return service_code;
	}
	public void setService_code(String service_code) {
		this.service_code = service_code;
	}
	public String getServer_uuid() {
		return server_uuid;
	}
	public void setServer_uuid(String server_uuid) {
		this.server_uuid = server_uuid;
	}
	public String getService_key() {
		return service_key;
	}
	public void setService_key(String service_key) {
		this.service_key = service_key;
	}
	public Date getAlarm_time() {
		return alarm_time;
	}
	public void setAlarm_time(Date alarm_time) {
		this.alarm_time = alarm_time;
	}
	
	public Date getAlarm_save_time() {
		return alarm_save_time;
	}
	public void setAlarm_save_time(Date alarm_save_time) {
		this.alarm_save_time = alarm_save_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
