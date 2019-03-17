package com.powersi.pcloud.moniter.pojo;

/**
 * 服务器监控实体类
 * @author 彭刚
 *
 */
public class MoniterData_OS extends MoniterData{


	private static final long serialVersionUID = 1L;
	private int online_flag;//服务器在线标志，0离线/1在线
	private String os_type;//服务器详细监控类型
	
	public int getOnline_flag() {
		return online_flag;
	}

	public void setOnline_flag(int online_flag) {
		this.online_flag = online_flag;
	}

	public String getOs_type() {
		return os_type;
	}

	public void setOs_type(String os_type) {
		this.os_type = os_type;
	}

	public MoniterData_OS() {
		super("OS");
	}
}
