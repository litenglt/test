package com.powersi.pcloud.moniter.pojo;

/**
 * ogg监控实体类
 * @author liteng
 *
 */
public class MoniterData_Ogg extends MoniterData{

	private static final long serialVersionUID = 1L;
	private int online_flag;//ogg在线标志，0离线/1在线
	public int getOnline_flag() {
		return online_flag;
	}
	public void setOnline_flag(int online_flag) {
		this.online_flag = online_flag;
	}

	public MoniterData_Ogg() {
		super("OGG");
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
