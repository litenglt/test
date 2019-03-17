package com.powersi.pcloud.ansyes.pojo;

import java.util.List;
import java.util.Map;

import com.powersi.comm.bean.BaseBean;

/**
 * mysql-es 同步服务心跳pojo类
 * @author luyang
 * @since 2018-06-06
 */
public class AnsyHeart extends BaseBean{
	private static final long serialVersionUID = 1L;
	
	private String host_ip;//服务器ip地址
	
	private String ansy_uuid;//同步服务
	
	private long ansy_max_moditime;//上次参数修改时间
	
	private List<Map<String, String>> dataFilter;//数据过滤.key : 数据库.表 value:字段
	
	private String es_ip;
	
	private String es_port;
	
	private String es_cluster_name;
	
	private String canal_address;
	
	private String canal_port;
	
	private String canal_destination;
	
	private String canal_username;
	
	private String canal_password;
	
	public String getHost_ip() {
		return host_ip;
	}

	public void setHost_ip(String host_ip) {
		this.host_ip = host_ip;
	}

	public String getAnsy_uuid() {
		return ansy_uuid;
	}

	public void setAnsy_uuid(String ansy_uuid) {
		this.ansy_uuid = ansy_uuid;
	}

	public long getAnsy_max_moditime() {
		return ansy_max_moditime;
	}

	public void setAnsy_max_moditime(long ansy_max_moditime) {
		this.ansy_max_moditime = ansy_max_moditime;
	}

	public List<Map<String, String>> getDataFilter() {
		return dataFilter;
	}

	public void setDataFilter(List<Map<String, String>> dataFilter) {
		this.dataFilter = dataFilter;
	}

	public String getEs_ip() {
		return es_ip;
	}

	public void setEs_ip(String es_ip) {
		this.es_ip = es_ip;
	}

	public String getEs_port() {
		return es_port;
	}

	public void setEs_port(String es_port) {
		this.es_port = es_port;
	}

	public String getEs_cluster_name() {
		return es_cluster_name;
	}

	public void setEs_cluster_name(String es_cluster_name) {
		this.es_cluster_name = es_cluster_name;
	}

	public String getCanal_address() {
		return canal_address;
	}

	public void setCanal_address(String canal_address) {
		this.canal_address = canal_address;
	}

	public String getCanal_port() {
		return canal_port;
	}

	public void setCanal_port(String canal_port) {
		this.canal_port = canal_port;
	}

	public String getCanal_destination() {
		return canal_destination;
	}

	public void setCanal_destination(String canal_destination) {
		this.canal_destination = canal_destination;
	}

	public String getCanal_username() {
		return canal_username;
	}

	public void setCanal_username(String canal_username) {
		this.canal_username = canal_username;
	}

	public String getCanal_password() {
		return canal_password;
	}

	public void setCanal_password(String canal_password) {
		this.canal_password = canal_password;
	}

}
