package com.powersi.backup;

import java.util.Date;

import com.powersi.comm.bean.BaseBean;

/**
 * 数据库备份任务表
 * @author penggang
 *
 */
public class BackupTask extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String assist_uuid;		//'服务器uuid',
	private String task_name;		//'任务名称 DBBACKUP、DELDBBACKUP',
	private String quartz_express;	//'定时任务的时钟表达式',
	private String task_type;		//'任务类型，0定时任务  1一次性任务',
	private String task_param;		//'任务参数',
	private String valid_flag;		//'有效标志 0无效  1有效',
	private Date modi_time;			//'最后修改时间',
	private String exec_flag;		//'实际执行情况 0未执行 1执行成功 2执行失败，3正在执行 只有一次性任务有反馈',
	private String exec_log;		//'执行情况日志，只有一次性任务有',
	private Date exec_time;			//'实际执行时间，只有一次性任务有',
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssist_uuid() {
		return assist_uuid;
	}
	public void setAssist_uuid(String assist_uuid) {
		this.assist_uuid = assist_uuid;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getQuartz_express() {
		return quartz_express;
	}
	public void setQuartz_express(String quartz_express) {
		this.quartz_express = quartz_express;
	}
	public String getTask_type() {
		return task_type;
	}
	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}
	public String getTask_param() {
		return task_param;
	}
	public void setTask_param(String task_param) {
		this.task_param = task_param;
	}
	public String getValid_flag() {
		return valid_flag;
	}
	public void setValid_flag(String valid_flag) {
		this.valid_flag = valid_flag;
	}
	public Date getModi_time() {
		return modi_time;
	}
	public void setModi_time(Date modi_time) {
		this.modi_time = modi_time;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
