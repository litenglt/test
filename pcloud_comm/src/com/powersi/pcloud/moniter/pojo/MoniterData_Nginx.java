package com.powersi.pcloud.moniter.pojo;

/**
 * nginx
 * @author Lenovo
 *
 */
public class MoniterData_Nginx extends MoniterData{

	public MoniterData_Nginx() {
		super("NGINX");
	}

	private static final long serialVersionUID = 1L;
	//private int connected_clients;//已连接客户端的数量
	private int active_conn;//活跃的连接数（最大值）
	private int online_flag;//在线标志 0/1,数值型
	private int service_err_count; //配置的节点故障的故障数量
	private String service_err_msg; //节点故障描叙
	
	public int getActive_conn() {
		return active_conn;
	}
	public void setActive_conn(int active_conn) {
		this.active_conn = active_conn;
	}
	public int getOnline_flag() {
		return online_flag;
	}
	public void setOnline_flag(int online_flag) {
		this.online_flag = online_flag;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	 
	public int getService_err_count() {
		return service_err_count;
	}
	public void setService_err_count(int service_err_count) {
		this.service_err_count = service_err_count;
	}
	public String getService_err_msg() {
		return service_err_msg;
	}
	public void setService_err_msg(String service_err_msg) {
		this.service_err_msg = service_err_msg;
	}
	
}
