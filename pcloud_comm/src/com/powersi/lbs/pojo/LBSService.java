package com.powersi.lbs.pojo;

import java.util.List;

import com.powersi.comm.bean.BaseBean;

/**
 * 负载均衡服务信息表，每条记录标识一个网站的映射
 * @author 彭刚
 *
 */
public class LBSService extends BaseBean{

	private static final long serialVersionUID = 1L;
	private int id;
	private int device_id;//对应的设备
	private String service_url;//服务的映射路径，例如 /pcloud_web
	private String service_name;//负载均衡服务名称,例如云日志
	private String service_comm;//服务备注说明
	private String valid_flag;//有效标志 0停用 1正常
	private String check_url;//检测是否工作正常的url
	private String ip_hash_flag;//ip绑定访问，用于解决部分session问题，为1增加，为0则不
	private List<LBSServiceHost> listServiceHost;//虚拟服务对应的后端服务器
	
	public String getIp_hash_flag() {
		return ip_hash_flag;
	}
	public void setIp_hash_flag(String ip_hash_flag) {
		this.ip_hash_flag = ip_hash_flag;
	}
	public List<LBSServiceHost> getListServiceHost() {
		return listServiceHost;
	}
	public void setListServiceHost(List<LBSServiceHost> listServiceHost) {
		this.listServiceHost = listServiceHost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDevice_id() {
		return device_id;
	}
	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}
	public String getService_url() {
		return service_url;
	}
	public void setService_url(String service_url) {
		this.service_url = service_url;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getService_comm() {
		return service_comm;
	}
	public void setService_comm(String service_comm) {
		this.service_comm = service_comm;
	}
	public String getValid_flag() {
		return valid_flag;
	}
	public void setValid_flag(String valid_flag) {
		this.valid_flag = valid_flag;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getCheck_url() {
		return check_url;
	}
	public void setCheck_url(String check_url) {
		this.check_url = check_url;
	}
	
}
