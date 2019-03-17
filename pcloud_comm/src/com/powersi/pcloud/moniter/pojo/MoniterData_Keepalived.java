package com.powersi.pcloud.moniter.pojo;

/**
 * Keepalived 监控数据
 * 
 * @author lingang
 * @time 2018年3月1日上午10:51:44
 *
 */
public class MoniterData_Keepalived extends MoniterData {

	public MoniterData_Keepalived() {
		super("KEEPALIVED");
	}

	private String node_type; // 切换之后当前虚拟的节点类型 master backup
	private String change_time; // 节点切换时间 yyyy-MM-dd hh:mm:ss
	private String key_code; // 指标代码
	private int online_flag;// 在线标志 0/1,数值型

	public int getOnline_flag() {
		return online_flag;
	}

	public void setOnline_flag( int online_flag) {
		this.online_flag = online_flag;
	}

	public String getNode_type() {
		return node_type;
	}

	public void setNode_type(String node_type) {
		this.node_type = node_type;
	}

	public String getChange_time() {
		return change_time;
	}

	public void setChange_time(String change_time) {
		this.change_time = change_time;
	}

	public String getKey_code() {
		return key_code;
	}

	public void setKey_code(String key_code) {
		this.key_code = key_code;
	}

	private static final long serialVersionUID = 1L;

}
