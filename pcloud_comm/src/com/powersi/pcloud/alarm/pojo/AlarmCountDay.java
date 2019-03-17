package com.powersi.pcloud.alarm.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * 告警日统计
 * @author 彭刚
 *
 */
public class AlarmCountDay extends BaseBean{
	 
	private static final long serialVersionUID = 1L;
	private String warn_day;// varchar(8) not null comment '统计日yyyymmdd',
	private String service_code;// varchar(32) not null comment '监控的服务：MYSQL,REDIS,TOMCAT为OS表示监控操作系统',
	private int c_count;//int not null default 0 comment '单日告警次数',
	public String getWarn_day() {
		return warn_day;
	}
	public void setWarn_day(String warn_day) {
		this.warn_day = warn_day;
	}
	public String getService_code() {
		return service_code;
	}
	public void setService_code(String service_code) {
		this.service_code = service_code;
	}
	public int getC_count() {
		return c_count;
	}
	public void setC_count(int c_count) {
		this.c_count = c_count;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
