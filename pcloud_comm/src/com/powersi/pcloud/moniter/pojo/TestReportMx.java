package com.powersi.pcloud.moniter.pojo;

import com.powersi.comm.bean.BaseBean;
/**
 * 测试报告明细实体类
 * @author 黄尧
 *
 */
public class TestReportMx  extends BaseBean{
	private static final long serialVersionUID = 1L;
	private long id;//测试报告明细ID
	private long report_id ;//对应的报告ID
	private String action;//对应的请求url
	private long success_count;//成功次数
	private long fail_count;//失败次数
	private double avg_time;//平均执行时间，毫秒
	private long used_time;//测试使用时间 秒
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getReport_id() {
		return report_id;
	}
	public void setReport_id(long report_id) {
		this.report_id = report_id;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public long getSuccess_count() {
		return success_count;
	}
	public void setSuccess_count(long success_count) {
		this.success_count = success_count;
	}
	public long getFail_count() {
		return fail_count;
	}
	public void setFail_count(long fail_count) {
		this.fail_count = fail_count;
	}
	public double getAvg_time() {
		return avg_time;
	}
	public void setAvg_time(double avg_time) {
		this.avg_time = avg_time;
	}
	public long getUsed_time() {
		return used_time;
	}
	public void setUsed_time(long used_time) {
		this.used_time = used_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
