package com.powersi.pcloud.assist.pojo;

import java.util.Date;

import com.powersi.comm.bean.BaseBean;

/**
 * 一次性任务执行情况反馈对象
 * @author 李志钢
 *
 */
public class AssistTaskReport extends BaseBean {
	private static final long serialVersionUID = 1L;
	private long id; //对应bas_host_task的ID
	private String exec_flag;   //实际执行情况  0 未执行    1 执行成功     2执行失败，只有一次性任务有反馈
	private String exec_log; 	//执行情况日志，只有一次性任务有
	private Date exec_time;		//实际执行时间
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getExec_flag() {
		return exec_flag;
	}
	public void setExec_flag(String exec_flag) {
		this.exec_flag = exec_flag;
	}
	public String getExec_log() {
		return exec_log;
	}
	public void setExec_log(String exec_log) {
		this.exec_log = exec_log;
	}
	public Date getExec_time() {
		return exec_time;
	}
	public void setExec_time(Date exec_time) {
		this.exec_time = exec_time;
	}
	
	
}
