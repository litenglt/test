package com.powersi.pcloud.alarm.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * 规则参数
 * @author 李志钢
 *
 */
public class AlarmRuleParam extends BaseBean {
	private static final long serialVersionUID = 1L;
	private int use_time; //监测的时间长度，单位分钟
	private String calc_type; //计算办法，1:平均值  2：最大值，3：最小值
	private String check_type;//检查办法：> >= = < <=
	private String check_value; //检查对比的值
	public int getUse_time() {
		return use_time;
	}
	public void setUse_time(int use_time) {
		this.use_time = use_time;
	}
	public String getCalc_type() {
		return calc_type;
	}
	public void setCalc_type(String calc_type) {
		this.calc_type = calc_type;
	}
	public String getCheck_type() {
		return check_type;
	}
	public void setCheck_type(String check_type) {
		this.check_type = check_type;
	}
	public String getCheck_value() {
		return check_value;
	}
	public void setCheck_value(String check_value) {
		this.check_value = check_value;
	}
}
