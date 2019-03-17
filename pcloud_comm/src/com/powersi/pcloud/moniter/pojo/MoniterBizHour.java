package com.powersi.pcloud.moniter.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * 业务小时监控数据表
 * @author 彭刚
 *
 */
public class MoniterBizHour extends BaseBean{

	private static final long serialVersionUID = 1L;
	private long id;
	private String biz_type;//业务类型标识
	private String biz_type_name;//业务类型标识名称
	private String zone_code;//业务数据产生地区的编码
	private String zone_name;//业务数据产生地区的名称
	private String yybm;//医院编码
	private String yymc;//医院名称
	private String data_time;//数据采集时间 yyyymmddhh 字符串
	private double biz_value;//业务数据
	private String table_name;//动态创建的表名
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBiz_type() {
		return biz_type;
	}
	public void setBiz_type(String biz_type) {
		this.biz_type = biz_type;
	}
	 
	public String getData_time() {
		return data_time;
	}
	public void setData_time(String data_time) {
		this.data_time = data_time;
	}
	public double getBiz_value() {
		return biz_value;
	}
	public void setBiz_value(double biz_value) {
		this.biz_value = biz_value;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getZone_code() {
		return zone_code;
	}
	public void setZone_code(String zone_code) {
		this.zone_code = zone_code;
	}
	public String getZone_name() {
		return zone_name;
	}
	public void setZone_name(String zone_name) {
		this.zone_name = zone_name;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getBiz_type_name() {
		return biz_type_name;
	}
	public void setBiz_type_name(String biz_type_name) {
		this.biz_type_name = biz_type_name;
	}
	public String getYybm() {
		return yybm;
	}
	public void setYybm(String yybm) {
		this.yybm = yybm;
	}
	public String getYymc() {
		return yymc;
	}
	public void setYymc(String yymc) {
		this.yymc = yymc;
	}
} 
