package com.powersi.pcloud.assist.pojo;

import java.util.Date;

import com.powersi.comm.bean.BaseBean;

/**
 * 任务参数实体类
 * 
 * @author 黄尧
 *
 */
public class AssistTask extends BaseBean {
	private static final long serialVersionUID = 1L;
	private int id; // 对应bas_host_task的ID
	private String assist_uuid;// 任务的服务id
	private String task_name;// 任务名称
	private String task_type;// 任务类型 "0"位定时任务"1"为一次性任务
	private String quartz_express;// quartz规则表达式
	private String task_param;// 执行参数
	private String valid_flag;// 有效标志，"0"位无效"1"为有效
	private Date modi_time;// 上次执行时间
	private String exec_flag;
	private String bean_id;// bean的唯一标志

	public String getExec_flag() {
		return exec_flag;
	}

	public void setExec_flag(String exec_flag) {
		this.exec_flag = exec_flag;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public String getTask_type() {
		return task_type;
	}

	public void setTask_type(String task_type) {
		this.task_type = task_type;
	}

	public String getQuartz_express() {
		return quartz_express;
	}

	public void setQuartz_express(String quartz_express) {
		this.quartz_express = quartz_express;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAssist_uuid() {
		return assist_uuid;
	}

	public void setAssist_uuid(String assist_uuid) {
		this.assist_uuid = assist_uuid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBean_id() {
		return bean_id;
	}

	public void setBean_id(String bean_id) {
		this.bean_id = bean_id;
	}

}
