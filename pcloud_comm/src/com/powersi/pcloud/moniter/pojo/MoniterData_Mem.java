package com.powersi.pcloud.moniter.pojo;

/**
 * 内存数据实体，数据后加KB
 * @author 彭刚
 *
 */
public class MoniterData_Mem extends MoniterData {

	private static final long serialVersionUID = 1L;
	
	private long mem_total;//内存总量(MB)
	private long mem_used;//使用的物理内存总量(MB)
	//private long mem_free;//空闲内存总量
	//private long mem_buffers;//内核缓存的内存量
	
	
	public MoniterData_Mem(){
		super("MEM");
	}
	
	public long getMem_total() {
		return mem_total;
	}
	public void setMem_total(long mem_total) {
		this.mem_total = mem_total;
	}
	public long getMem_used() {
		return mem_used;
	}
	public void setMem_used(long mem_used) {
		this.mem_used = mem_used;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/**
	 * 获取物理内存使用率
	 * @return 物理内存使用率
	 */
	public double getMemUsedRate(){
		return (double)mem_used/(double)mem_total;
	}
	
	
}
