package com.powersi.pcloud.moniter.pojo;

/**
 * mysql监控实体类,磁盘空间为（MB）
 * @author 彭刚
 *
 */
public class MoniterData_Mysql extends MoniterData{
 
	public MoniterData_Mysql() {
		super("MYSQL");
	}

	private static final long serialVersionUID = 1L;
	private float mysql_qps;//每秒的查询率
	private float mysql_tps;//每秒事务的处理
	private int connected;//当前的链接数量
	private long disk;//mysql占用磁盘空间（MB）
	private float mysql_cpu;//MySQL占用的cpu使用率百分比
	private long mysql_mem;//mysql占用操作系统的内存（MB）
	private int online_flag;//mysql在线标志，0离线/1在线
	
	private long delayTime;//数据库同步的延迟时间
	private int ioRunning;//显示SQL线程是否被启动，启动为Yes，否则为No。改为数据显示yes\1、no\0
	private int sqlRunning;//显示SQL线程是否被启动，启动为Yes，否则为No。改为数据显示yes\1、no\0

	
	public long getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(long delayTime) {
		this.delayTime = delayTime;
	}

	public int getIoRunning() {
		return ioRunning;
	}

	public void setIoRunning(int ioRunning) {
		this.ioRunning = ioRunning;
	}

	public int getSqlRunning() {
		return sqlRunning;
	}

	public void setSqlRunning(int sqlRunning) {
		this.sqlRunning = sqlRunning;
	}

	public int getOnline_flag() {
		return online_flag;
	}

	public void setOnline_flag(int online_flag) {
		this.online_flag = online_flag;
	}
	public float getMysql_cpu() {
		return mysql_cpu;
	}
	public void setMysql_cpu(float mysql_cpu) {
		this.mysql_cpu = mysql_cpu;
	}
	public long getMysql_mem() {
		return mysql_mem;
	}
	public void setMysql_mem(long mysql_mem) {
		this.mysql_mem = mysql_mem;
	}
	public long getDisk() {
		return disk;
	}
	public void setDisk(long disk) {
		this.disk = disk;
	}
	
	public float getMysql_qps() {
		return mysql_qps;
	}
	public void setMysql_qps(float mysql_qps) {
		this.mysql_qps = mysql_qps;
	}
	public float getMysql_tps() {
		return mysql_tps;
	}
	public void setMysql_tps(float mysql_tps) {
		this.mysql_tps = mysql_tps;
	}
	public int getConnected() {
		return connected;
	}
	public void setConnected(int connected) {
		this.connected = connected;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
