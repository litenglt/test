package com.powersi.comm.pojo;

/**
 * 系统运行日志 pojo
 * @author luoji_000
 *
 */
public class BasLogSys extends BasLog{
	private static final long serialVersionUID = 1L;
	private String server_ip;//服务器ip地址
	private String exception_str;//异常信息
	public String getServer_ip() {
		return server_ip;
	}
	public void setServer_ip(String server_ip) {
		this.server_ip = server_ip;
	}
	public String getException_str() {
		return exception_str;
	}
	public void setException_str(String exception_str) {
		this.exception_str = exception_str;
	}
	
}
