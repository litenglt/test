package com.powersi.pcloud.moniter.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * 磁盘信息
 * @author Lenovo
 *
 */
public class DiskParam extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String disk_path;//路径，例如/root
	private int disk_size;//磁盘尺寸，单位MB
	private int disk_used;//已经使用的尺寸，单位MB
	
	/**
	 * 获取使用磁盘的比例
	 * @return
	 */
	public double getUsedRate(){
		return (double)disk_used/(double)disk_size;
	}

	public String getDisk_path() {
		return disk_path;
	}
	public void setDisk_path(String disk_path) {
		this.disk_path = disk_path;
	}
	public int getDisk_size() {
		return disk_size;
	}
	public void setDisk_size(int disk_size) {
		this.disk_size = disk_size;
	}
	public int getDisk_used() {
		return disk_used;
	}
	public void setDisk_used(int disk_used) {
		this.disk_used = disk_used;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
