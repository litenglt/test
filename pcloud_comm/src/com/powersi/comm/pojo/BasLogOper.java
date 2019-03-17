package com.powersi.comm.pojo;

/**
 * 系统操作日志 pojo
 * @author luoji_000
 *
 */
public class BasLogOper extends BasLog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String oper_ip;//操作机器IP地址
	private String oper_type;//操作类别，对应字典：登录，注销，查询，修改，删除
	private String is_mobile;//是否为手机端操作 0否 / 1是
	
	public String getOper_ip() {
		return oper_ip;
	}
	public void setOper_ip(String oper_ip) {
		this.oper_ip = oper_ip;
	}
	public String getOper_type() {
		return oper_type;
	}
	public void setOper_type(String oper_type) {
		this.oper_type = oper_type;
	}
	public String getIs_mobile() {
		return is_mobile;
	}
	public void setIs_mobile(String is_mobile) {
		this.is_mobile = is_mobile;
	}
	
	
	
}
