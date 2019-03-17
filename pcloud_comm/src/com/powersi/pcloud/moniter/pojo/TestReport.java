package com.powersi.pcloud.moniter.pojo;

import java.util.Date;

import com.powersi.comm.bean.BaseBean;
/**
 * 测试报告实体类
 * @author 黄尧
 *
 */
public class TestReport extends BaseBean{
	private static final long serialVersionUID = 1L;
	private long id;//'测试报告ID',
    private String report_name;//'报告名称，场景名称+年月日+次数',
    private long scene_id;//'对应的场景',
    private String scene_name;//对应场景名称
    private Date create_time;
    private String report_state;//'报告状态 1执行中  2执行完毕 对于执行中的需要查询热数据统计',
    private long success_count;//'成功次数',
    private long fail_count;//'失败次数',
    private double avg_time;//'平均执行时间，毫秒',
    private long used_time;//'测试使用时间 秒',
    private double tps;//测试中没秒执行的数量
    
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getReport_name() {
		return report_name;
	}
	public void setReport_name(String report_name) {
		this.report_name = report_name;
	}
	public long getScene_id() {
		return scene_id;
	}
	public void setScene_id(long scene_id) {
		this.scene_id = scene_id;
	}
	public String getScene_name() {
		return scene_name;
	}
	public void setScene_name(String scene_name) {
		this.scene_name = scene_name;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getReport_state() {
		return report_state;
	}
	public void setReport_state(String report_state) {
		this.report_state = report_state;
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
	public double getTps() {
		return tps;
	}
	public void setTps(double tps) {
		this.tps = tps;
	}
	
}
