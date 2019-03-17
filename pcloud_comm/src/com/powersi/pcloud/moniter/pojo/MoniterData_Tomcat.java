package com.powersi.pcloud.moniter.pojo;

/**
 * tomcat监控实体类
 * @author 彭刚
 *
 */
public class MoniterData_Tomcat extends MoniterData{


	private static final long serialVersionUID = 1L;
	private long max_heap_size;//配置的最大内存大小（MB）
	private long eden_capacity;//实际分配的内存数目（MB）
	private long eden_used;//实际分配的内存已经使用的部分（MB）
	private long eden_free;//实际分配的内存剩余（MB）
	private float tomcat_cpu;//cpu使用率
	private long tomcat_mem;//占操作系统使用内存
	private int online_flag;//tomcat在线标志，0离线/1在线

	
	public int getOnline_flag() {
		return online_flag;
	}

	public void setOnline_flag(int online_flag) {
		this.online_flag = online_flag;
	}

	public MoniterData_Tomcat() {
		super("TOMCAT");
	}
	
	public long getMax_heap_size() {
		return max_heap_size;
	}
	public void setMax_heap_size(long max_heap_size) {
		this.max_heap_size = max_heap_size;
	}
	public long getEden_capacity() {
		return eden_capacity;
	}
	public void setEden_capacity(long eden_capacity) {
		this.eden_capacity = eden_capacity;
	}
	public long getEden_used() {
		return eden_used;
	}
	public void setEden_used(long eden_used) {
		this.eden_used = eden_used;
	}
	public long getEden_free() {
		return eden_free;
	}
	public void setEden_free(long eden_free) {
		this.eden_free = eden_free;
	}
	public float getTomcat_cpu() {
		return tomcat_cpu;
	}
	public void setTomcat_cpu(float tomcat_cpu) {
		this.tomcat_cpu = tomcat_cpu;
	}
	public long getTomcat_mem() {
		return tomcat_mem;
	}
	public void setTomcat_mem(long tomcat_mem) {
		this.tomcat_mem = tomcat_mem;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/**
	 * 获取tomcat实际分配的内存的使用率
	 * @return 内存的使用率
	 */
	public double getEdenUsedRate(){
		return (double)eden_used/(double)max_heap_size;
	}
}
