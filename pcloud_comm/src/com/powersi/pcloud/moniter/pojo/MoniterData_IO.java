package com.powersi.pcloud.moniter.pojo;

/**
 * io监控
 * @author 彭刚
 *
 */
public class MoniterData_IO extends MoniterData{
	private static final long serialVersionUID = 1L;

	public MoniterData_IO() {
		super("IO"); 
	}
	private float iops;
	private float read_kps;//每秒读取多少KB
	private float write_kps;//每秒写入多少KB

	public float getIops() {
		return iops;
	}
	public void setIops(float iops) {
		this.iops = iops;
	}
	public float getRead_kps() {
		return read_kps;
	}
	public void setRead_kps(float read_kps) {
		this.read_kps = read_kps;
	}
	public float getWrite_kps() {
		return write_kps;
	}
	public void setWrite_kps(float write_kps) {
		this.write_kps = write_kps;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
