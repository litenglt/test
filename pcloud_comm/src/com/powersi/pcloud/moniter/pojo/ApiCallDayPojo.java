package com.powersi.pcloud.moniter.pojo;

import com.powersi.comm.bean.BaseBean;
/**
 * api访问量按日统计实体类
 * @author 黄尧
 *
 */
public class ApiCallDayPojo extends BaseBean{
	private static final long serialVersionUID = 1L;
	private long id;
	private String function_id;//功能id
	private String function_name;//功能id名称
	private String rq;//日期 "yyyyMMdd"
	private String hour;//'小时 hh'
	private String code;//医院编码或者账户代码
	private String name;//医院名称或者账户名称
	private long call_count;//访问次数
	private long call_succ_count;//成功访问次数
	private long call_fail_count;//失败访问次数
	private String table_name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFunction_id() {
		return function_id;
	}
	public void setFunction_id(String function_id) {
		this.function_id = function_id;
	}
	public String getRq() {
		return rq;
	}
	public void setRq(String rq) {
		this.rq = rq;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public long getCall_count() {
		return call_count;
	}
	public void setCall_count(long call_count) {
		this.call_count = call_count;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCall_succ_count() {
		return call_succ_count;
	}
	public void setCall_succ_count(long call_succ_count) {
		this.call_succ_count = call_succ_count;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getFunction_name() {
		return function_name;
	}
	public void setFunction_name(String function_name) {
		this.function_name = function_name;
	}
	public long getCall_fail_count() {
		return call_fail_count;
	}
	public void setCall_fail_count(long call_fail_count) {
		this.call_fail_count = call_fail_count;
	}
}
