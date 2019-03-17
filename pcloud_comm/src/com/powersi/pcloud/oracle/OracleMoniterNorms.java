package com.powersi.pcloud.oracle;

import com.powersi.comm.bean.BaseBean;

/**
 * 监控或者业务巡检的指标信息
 * @author liteng
 *
 */
public class OracleMoniterNorms extends BaseBean{

	private static final long serialVersionUID = 1L;
	private int id;
    private String moniter_norm;
    private String norm_name;
    private String moniter_sql;
    private String norm_type;
	public int getId() {
		return id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMoniter_norm() {
		return moniter_norm;
	}
	public void setMoniter_norm(String moniter_norm) {
		this.moniter_norm = moniter_norm;
	}
	public String getMoniter_sql() {
		return moniter_sql;
	}
	public void setMoniter_sql(String moniter_sql) {
		this.moniter_sql = moniter_sql;
	}
	public String getNorm_name() {
		return norm_name;
	}
	public void setNorm_name(String norm_name) {
		this.norm_name = norm_name;
	}
	public String getNorm_type() {
		return norm_type;
	}
	public void setNorm_type(String norm_type) {
		this.norm_type = norm_type;
	}
    
}
