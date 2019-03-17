package com.powersi.pcloud.moniter.pojo;

/**
 * 并发量
 */
public class MoniterData_CONCURRENT extends MoniterData{
	private static final long serialVersionUID = 1L;

	public MoniterData_CONCURRENT() {
		super("CONCURRENT"); 
	}
	private String type;//统计类型 hygeia_wed, hygeia_esb
	private double concurrent_number;//并发量  

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getConcurrent_number() {
		return concurrent_number;
	}
	public void setConcurrent_number(double concurrent_number) {
		this.concurrent_number = concurrent_number;
	}
}
