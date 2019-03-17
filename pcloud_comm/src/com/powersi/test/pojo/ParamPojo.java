package com.powersi.test.pojo;

import com.powersi.comm.bean.BaseBean;
/**
 * 测试nginx远程调用时传递的对象
 * @author dell-pc
 *
 */
public class ParamPojo extends BaseBean{
	
	private static final long serialVersionUID = 1L;
	private String param;
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
