package com.powersi.pcloud.oracle;

import java.util.List;

import com.powersi.comm.bean.BaseBean;

/**
 * 进行监控的oracle数据库信息
 * @author liteng
 *
 */
public class OracleMoniterHosts extends BaseBean {
	private static final long serialVersionUID = 1L;
	private int id;
    private String ip;
    public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int port;
    private String user;
    private String passwd;
    private String instance;
    private String moniter_norms;
    private List<OracleMoniterNorms> normList;//一个oracle服务器对应多个监控指标
	public int getId() {
		return id;
	}
	public String getInstance() {
		return instance;
	}
	public void setInstance(String instance) {
		this.instance = instance;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public List<OracleMoniterNorms> getNormList() {
		return normList;
	}
	public void setNormList(List<OracleMoniterNorms> normList) {
		this.normList = normList;
	}
	public String getMoniter_norms() {
		return moniter_norms;
	}
	public void setMoniter_norms(String moniter_norms) {
		this.moniter_norms = moniter_norms;
	}
    
}
