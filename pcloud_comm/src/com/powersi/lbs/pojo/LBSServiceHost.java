package com.powersi.lbs.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * 虚拟服务对应的后端服务器列表信息表
 * @author 彭刚
 *
 */
public class LBSServiceHost extends BaseBean{

	private static final long serialVersionUID = 1L;
	private int id;
	private String lbs_service_id;//对应服务的ID
	private String host_url;//目标服务器url
	private String host_weight;//权重1-100 越大越重
	private String valid_flag;//有效标志 0停用 1正常
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLbs_service_id() {
		return lbs_service_id;
	}
	public void setLbs_service_id(String lbs_service_id) {
		this.lbs_service_id = lbs_service_id;
	}
	public String getHost_url() {
		return host_url;
	}
	public void setHost_url(String host_url) {
		this.host_url = host_url;
	}
	public String getHost_weight() {
		return host_weight;
	}
	public void setHost_weight(String host_weight) {
		this.host_weight = host_weight;
	}
	public String getValid_flag() {
		return valid_flag;
	}
	public void setValid_flag(String valid_flag) {
		this.valid_flag = valid_flag;
	}
	
}
