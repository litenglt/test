package com.powersi.pcloud.moniter.pojo;

/**
 * 中心api的参数
 * @author 黄尧
 *
 */
public class MoniterData_CenterApi extends MoniterData{
	private static final long serialVersionUID = 1L;
	private String function_id; //center_api功能号
	private float exec_err_rate; //center_api在一分钟内调用出错率
	private float exec_avg_time;   //center_api在一分钟内调用的平均时间
	private float exec_result_score; //一分钟内center_api调用结果打分
	
	public MoniterData_CenterApi() {
		super("CENTER_API");
	}

	
	public String getFunction_id() {
		return function_id;
	}


	public void setFunction_id(String function_id) {
		this.function_id = function_id;
	}


	public float getExec_err_rate() {
		return exec_err_rate;
	}


	public void setExec_err_rate(float exec_err_rate) {
		this.exec_err_rate = exec_err_rate;
	}


	public float getExec_avg_time() {
		return exec_avg_time;
	}


	public void setExec_avg_time(float exec_avg_time) {
		this.exec_avg_time = exec_avg_time;
	}


	public float getExec_result_score() {
		return exec_result_score;
	}


	public void setExec_result_score(float exec_result_score) {
		this.exec_result_score = exec_result_score;
	}
}
