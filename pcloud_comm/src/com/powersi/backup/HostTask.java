package com.powersi.backup;

import java.util.Date;

public interface HostTask {
	public int getId() ;
	public void setId(int id) ;
	public String getAssist_uuid() ;
	public void setAssist_uuid(String assist_uuid) ;
	public String getTask_name() ;
	public void setTask_name(String task_name) ;
	public String getQuartz_express() ;
	public void setQuartz_express(String quartz_express) ;
	public String getTask_type() ;
	public void setTask_type(String task_type) ;
	public String getTask_param() ;
	public void setTask_param(String task_param) ;
	public String getValid_flag() ;
	public void setValid_flag(String valid_flag) ;
	public Date getModi_time() ;
	public void setModi_time(Date modi_time) ;
	public String getExec_flag() ;
	public void setExec_flag(String exec_flag) ;
	public String getExec_log() ;
	public void setExec_log(String exec_log) ;
	public Date getExec_time() ;
	public void setExec_time(Date exec_time) ;
}
