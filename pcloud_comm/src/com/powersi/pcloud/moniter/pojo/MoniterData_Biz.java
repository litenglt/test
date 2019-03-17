package com.powersi.pcloud.moniter.pojo;

public class MoniterData_Biz extends MoniterData {
	private String bizType; //业务类别唯一标识
	private String bizParam; //业务执行的参数，由AOP拼接
	private long bizTime; //业务执行时间，秒
	
	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizParam() {
		return bizParam;
	}

	public void setBizParam(String bizParam) {
		this.bizParam = bizParam;
	}

	public long getBizTime() {
		return bizTime;
	}

	public void setBizTime(long bizTime) {
		this.bizTime = bizTime;
	}

	public MoniterData_Biz(String type) {
		super("BIZ");
	}

	private static final long serialVersionUID = 1L;

}
