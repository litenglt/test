package com.powersi.pcloud.oracle;

import java.util.List;

import com.powersi.comm.bean.BaseBean;

/**
 * 业务监控实体类
 * 
 * @author 李腾
 *
 */
public class OracleBizCheckNorms extends BaseBean {

	private static final long serialVersionUID = 1L;
	private String moniter_norm;// 监控类型
	private long id;// id
	private String norm_name;// 监控名
	private String moniter_sql;// 监控sql
	private String ips;// 执行监控的ips
	private List<OracleMoniterHosts> oracleMoniterList;// 一个监控类型可以多个服务执行

	public String getMoniter_norm() {
		return moniter_norm;
	}

	public void setMoniter_norm(String moniter_norm) {
		this.moniter_norm = moniter_norm;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNorm_name() {
		return norm_name;
	}

	public void setNorm_name(String norm_name) {
		this.norm_name = norm_name;
	}

	public String getMoniter_sql() {
		return moniter_sql;
	}

	public void setMoniter_sql(String moniter_sql) {
		this.moniter_sql = moniter_sql;
	}

	public String getIps() {
		return ips;
	}

	public void setIps(String ips) {
		this.ips = ips;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<OracleMoniterHosts> getOracleMoniterList() {
		return oracleMoniterList;
	}

	public void setOracleMoniterList(List<OracleMoniterHosts> oracleMoniterList) {
		this.oracleMoniterList = oracleMoniterList;
	}

}
