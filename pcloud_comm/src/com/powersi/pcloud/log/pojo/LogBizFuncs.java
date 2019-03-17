package com.powersi.pcloud.log.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * 业务功能清单表
 * @author 彭刚
 *
 */
public class LogBizFuncs extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String app_name;//对应的业务系统标识名称
	private String func_id;//业务功能标识
	private String func_desc;//功能描述
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	public String getFunc_id() {
		return func_id;
	}
	public void setFunc_id(String func_id) {
		this.func_id = func_id;
	}
	public String getFunc_desc() {
		return func_desc;
	}
	public void setFunc_desc(String func_desc) {
		this.func_desc = func_desc;
	}

}
