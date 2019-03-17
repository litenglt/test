package com.powersi.bas_service.pojo;

import java.util.Map;

import com.powersi.comm.bean.BaseBean;

/**
 * @Description 服务类型 实体类
 * @author "lingang"
 * @time 2016年4月21日下午2:33:24
 *
 */
public class BasServiceEndPoint extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String service_name;//服务名称 简拼or英语大写  CALC, DBSERVICE, MYSQL
	private String tcjgbm;//统筹区编码，000000表示所有统筹区
	private String rpc_ip;//'服务访问入口IP'
	private int rpc_port;//'服务访问入口端口'
	private Map map;
	
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getRpc_ip() {
		return rpc_ip;
	}
	public void setRpc_ip(String rpc_ip) {
		this.rpc_ip = rpc_ip;
	}
	public int getRpc_port() {
		return rpc_port;
	}
	public void setRpc_port(int rpc_port) {
		this.rpc_port = rpc_port;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getTcjgbm() {
		return tcjgbm;
	}
	public void setTcjgbm(String tcjgbm) {
		this.tcjgbm = tcjgbm;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
}
