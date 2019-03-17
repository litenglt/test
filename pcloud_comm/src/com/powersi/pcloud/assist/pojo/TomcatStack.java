package com.powersi.pcloud.assist.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * tomcat堆栈信息
 * @author 彭刚
 *
 */
public class TomcatStack extends BaseBean{ 
	private static final long serialVersionUID = 1L;
	private String assist_uuid;
	private String stackParam;
	public String getAssist_uuid() {
		return assist_uuid;
	}
	public void setAssist_uuid(String assist_uuid) {
		this.assist_uuid = assist_uuid;
	}
	public String getStackParam() {
		return stackParam;
	}
	public void setStackParam(String stackParam) {
		this.stackParam = stackParam;
	}
	
}
