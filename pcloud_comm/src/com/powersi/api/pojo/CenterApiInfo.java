package com.powersi.api.pojo;

import com.powersi.comm.bean.BaseBean;
/**
 * 系统对外暴露中心api信息
 * @author 黄尧
 *
 */
public class CenterApiInfo extends BaseBean {
	/**
	 * 缓存中存储中心api信息得key
	 */
	public static final String MEM_CENTER_API_INFO_KEY = "MAP_CENTER_API";
	private static final long serialVersionUID = 1L;
	private long id;//id
	private String function_id;//中心功能编号
	private String key_param;//关键参数值
	private String function_name;//功能名称
	private int score_time_60 = 0;//60分执行时长  ms
	private int score_time_80 = 0;//80分执行时长  ms
	private int score_time_100 = 0;//100分执行时长  ms
	private String valid_flag ="0";//有效标志 0否 1是 默认0,自动登记时为0
	private String calc_sign = "0";//参与全局打分计算标志 1表示参与，0表示不参与
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
	public String getKey_param() {
		return key_param;
	}
	public void setKey_param(String key_param) {
		this.key_param = key_param;
	}
	public String getFunction_name() {
		return function_name;
	}
	public void setFunction_name(String function_name) {
		this.function_name = function_name;
	}
	public int getScore_time_60() {
		return score_time_60;
	}
	public void setScore_time_60(int score_time_60) {
		this.score_time_60 = score_time_60;
	}
	public int getScore_time_80() {
		return score_time_80;
	}
	public void setScore_time_80(int score_time_80) {
		this.score_time_80 = score_time_80;
	}
	public int getScore_time_100() {
		return score_time_100;
	}
	public void setScore_time_100(int score_time_100) {
		this.score_time_100 = score_time_100;
	}
	public String getCalc_sign() {
		return calc_sign;
	}
	public void setCalc_sign(String calc_sign) {
		this.calc_sign = calc_sign;
	}
	public String getValid_flag() {
		return valid_flag;
	}
	public void setValid_flag(String valid_flag) {
		this.valid_flag = valid_flag;
	}
	
}
