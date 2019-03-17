package com.powersi.pcloud.moniter.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 磁盘空间使用
 * @author 彭刚
 *
 */
public class MoniterData_Disk extends MoniterData {

	public MoniterData_Disk() {
		super("DISK");
	}
	private static final long serialVersionUID = 1L;
	//private String assist_uuid;//服务器uuid
	//private Date data_time;//数据采集时间 yyyymmddhhMM 字符串
	private String disk_path;//路径，例如/root
	private int disk_size;//磁盘尺寸，单位MB
	private int disk_used;//已经使用的尺寸，单位MB
	private List<DiskParam> list;//各个分盘情况
	
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
	
	
	public List<DiskParam> getList() {
		return list;
	}
	public void setList(List<DiskParam> list) {
		this.list = list;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/**
	 * 获取最大的磁盘使用率
	 * @return
	 */
	public Map<String,Object> getMaxDiskUsedRate(){
		Map<String,Object> map = new HashMap<String, Object>();
		String maxDiskName = "";
		double maxusedRate = -1;
		List<DiskParam> list =getList();
		if (list != null && list.size()!=0) {
			for (DiskParam diskParam : list) {
				double usedRate = diskParam.getUsedRate();
				String diskName = diskParam.getDisk_path();
				
				if (usedRate > maxusedRate) {
					maxusedRate = usedRate;
					maxDiskName = diskName;
				}
			}
		}
		map.put("maxusedRate", maxusedRate);
		map.put("maxDiskName", maxDiskName);
		return map;
	}
	
	/**
	 * 获取磁盘使用率
	 * @return
	 */
	public double getDiskUsedRate(){
		List<DiskParam> list =getList();
		if (list==null||list.size()==0) {
			return -1;
		}
		int sumDiskSize = 0;
		int sumDiskUsed = 0;
		for (DiskParam diskParam : list) {
			sumDiskSize += diskParam.getDisk_size();
			sumDiskUsed += diskParam.getDisk_used();
		}
		return (double)sumDiskUsed/(double)sumDiskSize;
	}
}
