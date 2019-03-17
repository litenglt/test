package com.powersi.pcloud.hygeia.client.pojo;

import java.util.Date;

import com.powersi.comm.bean.BaseBean;

/**
 * 通用客户端信息表
 * @author 彭刚
 *
 */
public class HygeiaClients extends BaseBean{

	private static final long serialVersionUID = 1L;
	private int id;//                   bigint not null auto_increment,
	private String tcqbm;//                varchar(32) not null comment '统筹区编码，对应字典',
	private String yybm;//                 varchar(64) comment '医院编码',
	private String yymc;//                 varchar(128) comment '医院名称',
	private String online_flag;//          int comment '在线标志 0/1,数值型',
	private String client_ver;//           varchar(32) comment '客户端版本号',
	private String client_ip;//            varchar(64) comment '客户端IP地址',
	private Date last_online_time;//     datetime comment '最新心跳时间',
	
	private String service_ver; //当前服务器版本
	
	public String getService_ver() {
		return service_ver;
	}
	public void setService_ver(String service_ver) {
		this.service_ver = service_ver;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTcqbm() {
		return tcqbm;
	}
	public void setTcqbm(String tcqbm) {
		this.tcqbm = tcqbm;
	}
	public String getYybm() {
		return yybm;
	}
	public void setYybm(String yybm) {
		this.yybm = yybm;
	}
	public String getYymc() {
		return yymc;
	}
	public void setYymc(String yymc) {
		this.yymc = yymc;
	}
	public String getOnline_flag() {
		return online_flag;
	}
	public void setOnline_flag(String online_flag) {
		this.online_flag = online_flag;
	}
	public String getClient_ver() {
		return client_ver;
	}
	public void setClient_ver(String client_ver) {
		this.client_ver = client_ver;
	}
	public String getClient_ip() {
		return client_ip;
	}
	public void setClient_ip(String client_ip) {
		this.client_ip = client_ip;
	}
	public Date getLast_online_time() {
		return last_online_time;
	}
	public void setLast_online_time(Date last_online_time) {
		this.last_online_time = last_online_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
