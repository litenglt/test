package com.powersi.lbs.pojo;

import java.util.Date;
import java.util.List;

import com.powersi.comm.bean.BaseBean;

/**
 * 负载均衡设备信息表
 * @author 彭刚
 *
 */
public class LBSDevice extends BaseBean{

	private static final long serialVersionUID = 1L;
	private int id;
	private String lbs_device_ip;//ip地址
	private String lbs_device_type;//设备类型，固定值，配置在字典表
	private String user_code;//user_code
	private String user_pswd;//md5 password
	private String config_flag;//配置状态 1已经修改未下发 2已经下发 3配置成功 9配置失败
	private Date config_success_time;//最后配置成功时间
	private List<LBSService> listLBSService;
	
	public List<LBSService> getListLBSService() {
		return listLBSService;
	}
	public void setListLBSService(List<LBSService> listLBSService) {
		this.listLBSService = listLBSService;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLbs_device_ip() {
		return lbs_device_ip;
	}
	public void setLbs_device_ip(String lbs_device_ip) {
		this.lbs_device_ip = lbs_device_ip;
	}
	public String getLbs_device_type() {
		return lbs_device_type;
	}
	public void setLbs_device_type(String lbs_device_type) {
		this.lbs_device_type = lbs_device_type;
	}
	public String getUser_code() {
		return user_code;
	}
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	public String getUser_pswd() {
		return user_pswd;
	}
	public void setUser_pswd(String user_pswd) {
		this.user_pswd = user_pswd;
	}
	 
	public String getConfig_flag() {
		return config_flag;
	}
	public void setConfig_flag(String config_flag) {
		this.config_flag = config_flag;
	}
	public Date getConfig_success_time() {
		return config_success_time;
	}
	public void setConfig_success_time(Date config_success_time) {
		this.config_success_time = config_success_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
