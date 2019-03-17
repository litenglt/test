package com.powersi.pcloud.moniter.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * @author Administrator
 *	统筹区名对应的统筹区编码 实体类
 */
public class MoniterZone extends BaseBean{
	private static final long serialVersionUID = 1L;
	private String name; //统筹区名称
	private String value; //统筹区编码
	public MoniterZone() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
