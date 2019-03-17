package com.powersi.api.pojo;

import com.powersi.comm.bean.BaseBean;
/**
 * 系统对外暴露api信息
 * @author dell-pcdssd
 *
 */
public class ApiList  extends BaseBean{
	private static final long serialVersionUID = 1L;
	private String function_id;//'功能编号'
	private String authority_flag;//鉴权标识，
	private String granted_accs;//授权的账户id 逗号分隔 前后都要加逗号方便like查询 例如 ,1,2,
	private String function_name;//'名称'
	private String full_resultset;//功能回参结果集
	public String getFunction_id() {
		return function_id;
	}
	public void setFunction_id(String function_id) {
		this.function_id = function_id;
	}
	public String getFunction_name() {
		return function_name;
	}
	public void setFunction_name(String function_name) {
		this.function_name = function_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getAuthority_flag() {
		return authority_flag;
	}
	public void setAuthority_flag(String authority_flag) {
		this.authority_flag = authority_flag;
	}
	public String getGranted_accs() {
		return granted_accs;
	}
	public void setGranted_accs(String granted_accs) {
		this.granted_accs = granted_accs;
	}
	public String getFull_resultset() {
		return full_resultset;
	}
	public void setFull_resultset(String full_resultset) {
		this.full_resultset = full_resultset;
	}
	
}
