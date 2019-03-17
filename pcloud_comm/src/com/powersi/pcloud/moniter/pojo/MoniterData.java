package com.powersi.pcloud.moniter.pojo;

import java.util.Date;

import com.powersi.comm.bean.BaseBean;

/**
 * 监控数据的基础类
 * @author 李志钢
 *
 */
public class MoniterData extends BaseBean {
	private static final long serialVersionUID = 1L;
	
	private Date moniterTime; //监控数据的采集时间
	private String assistUUID; //监控数据所在assist的uuid，即谁采集的
	private String moniterType; //监控类别标识， CPU    MEM     REDIS    MYSQL...，该变量由本类的子类赋值
	private String data_time;//监控数据的采集时间的字符串类型
	public String getData_time() {
		return data_time;
	}

	public void setData_time(String data_time) {
		this.data_time = data_time;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public MoniterData(String type){
		this.setMoniterType(type);
	}
	
	public Date getMoniterTime() {
		return moniterTime;
	}
	public void setMoniterTime(Date moniterTime) {
		this.moniterTime = moniterTime;
	}
	public String getAssistUUID() {
		return assistUUID;
	}
	public void setAssistUUID(String assistUUID) {
		this.assistUUID = assistUUID;
	}
	public String getMoniterType() {
		return moniterType;
	}
	public void setMoniterType(String moniterType) {
		this.moniterType = moniterType;
	}
	
}
