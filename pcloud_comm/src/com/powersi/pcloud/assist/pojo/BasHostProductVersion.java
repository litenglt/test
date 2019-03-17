package com.powersi.pcloud.assist.pojo;

import java.util.Date;

import com.powersi.comm.bean.BaseBean;

/**
 * 服务器对应产品的最新版本号
 * @author 彭刚
 *
 */
public class BasHostProductVersion extends BaseBean{ 
	private static final long serialVersionUID = 1L;
	private String assist_uuid;
	private String product_name;//产品名称，简拼or英语大写 HYGEIA_API HYGEIA_CALC
	private String  current_ver;//当前版本号
	private Date modi_time;//最后修改时间
	public String getAssist_uuid() {
		return assist_uuid;
	}
	public void setAssist_uuid(String assist_uuid) {
		this.assist_uuid = assist_uuid;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getCurrent_ver() {
		return current_ver;
	}
	public void setCurrent_ver(String current_ver) {
		this.current_ver = current_ver;
	}
	public Date getModi_time() {
		return modi_time;
	}
	public void setModi_time(Date modi_time) {
		this.modi_time = modi_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
       