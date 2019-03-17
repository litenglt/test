package com.powersi.pcloud.alarm.pojo;

import java.util.Date;

import com.powersi.comm.bean.BaseBean;

/**
 * 告警记录pojo
 * @author 李志钢
 *
 */
public class AlarmList extends BaseBean {

	private static final long serialVersionUID = 1L;
	private long id;//
	private Date alarm_time;//           datetime not null comment '告警时间',
	private String service_code;//         varchar(32) not null comment '告警对象代码BIZ, REDIS...',
	private String key_code;//             varchar(32) not null comment '指标代码',
	private String assist_uuid;//          varchar(64) comment '所在服务器uuid',
	private String alarm_info;//           varchar(1024) not null comment '告警描叙，文字描叙',
	private String host_ip;//             服务器的ip地址
	private String key_name;//             指标名称
	private String service_name; //        告警对象名称
	private String logo; //        告警对象图标
	
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getKey_name() {
		return key_name;
	}
	public void setKey_name(String key_name) {
		this.key_name = key_name;
	}
	public String getHost_ip() {
		return host_ip;
	}
	public void setHost_ip(String host_ip) {
		this.host_ip = host_ip;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getAlarm_time() {
		return alarm_time;
	}
	public void setAlarm_time(Date alarm_time) {
		this.alarm_time = alarm_time;
	}
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
	public String getAssist_uuid() {
		return assist_uuid;
	}
	public void setAssist_uuid(String assist_uuid) {
		this.assist_uuid = assist_uuid;
	}
	public String getAlarm_info() {
		return alarm_info;
	}
	public void setAlarm_info(String alarm_info) {
		this.alarm_info = alarm_info;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
}
