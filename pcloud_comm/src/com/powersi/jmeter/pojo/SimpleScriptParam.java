package com.powersi.jmeter.pojo;

import com.powersi.comm.bean.BaseBean;
/**
 * 简易脚本界面需传递的参数
 * @author 黄尧
 *
 */
public class SimpleScriptParam  extends BaseBean{

	private static final long serialVersionUID = 1L;
	private long thread_delay;//每次请求的时间间隔(ms)
	private String parameters;//请求参数
	private long loop_count;//循环次数
	private int ramp_up_period;//jmeter中线程组启动延迟时间(单位:s)
	private int thread_num;//线程数
	private String request_url;//测试请求访问域名或ip:端口号
	private String web_path;//请求的路径
	public long getThread_delay() {
		return thread_delay;
	}
	public void setThread_delay(long thread_delay) {
		this.thread_delay = thread_delay;
	}
	public String getParameters() {
		return parameters;
	}
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	public long getLoop_count() {
		return loop_count;
	}
	public void setLoop_count(long loop_count) {
		this.loop_count = loop_count;
	}
	public int getRamp_up_period() {
		return ramp_up_period;
	}
	public void setRamp_up_period(int ramp_up_period) {
		this.ramp_up_period = ramp_up_period;
	}
	public int getThread_num() {
		return thread_num;
	}
	public void setThread_num(int thread_num) {
		this.thread_num = thread_num;
	}
	public String getRequest_url() {
		return request_url;
	}
	public void setRequest_url(String request_url) {
		this.request_url = request_url;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getWeb_path() {
		return web_path;
	}
	public void setWeb_path(String web_path) {
		this.web_path = web_path;
	}
	
}
