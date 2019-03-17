package com.powersi.backup;

import com.powersi.comm.bean.BaseBean;

/**
 * 备份目标服务器信息表
 * @author penggang
 *
 */
public class BackupDBServer extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String ip;		//'服务器ip',
	private String db_name;	//'数据库名称',
	private String user_name;//'用户名',
	private String passwd;	//'密码',
	private String port;	//'端口',
	public int getId() {
		return id;
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
	public String getDb_name() {
		return db_name;
	}
	public void setDb_name(String db_name) {
		this.db_name = db_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
