package com.powersi.pcloud.moniter.pojo;

/**
 * 业务明细数据实体对象
 * @author "lingang"
 * @time 2017年6月30日上午11:52:16
 *
 */
public class MoniterData_BIZ_MX extends MoniterData{
	
	private static final long serialVersionUID = 1L;
	private String biz_info;//业务明细信息
	
	public String getBiz_info() {
		return biz_info;
	}
	public void setBiz_info(String biz_info) {
		this.biz_info = biz_info;
	}
	
	public MoniterData_BIZ_MX() {
		super("BIZ_MX");
	}
}
