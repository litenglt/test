package com.powersi.pcloud.moniter.pojo;

/**
 * redis实体类，其中含有memory的数据以以MB为单位
 * @author 彭刚
 *
 */
public class MoniterData_Redis extends MoniterData{
	private static final long serialVersionUID = 1L;
	//客户端
	private int connected_clients;//已连接客户端的数量
	private int blocked_clients;//正在等待阻塞命令的客户端的数量
	//内存
	private long used_memory;//由 Redis 分配器分配的内存总量，以MB为单位
	private long used_memory_rss;//从操作系统的角度，返回 Redis 已分配的内存总量，以MB为单位
	private long used_memory_peak;//Redis 的内存消耗峰值，以MB为单位
	//服务器
	private String redis_version;//服务器版本
	private String redis_mode;//工作模式
	private int online_flag;//redis在线标志，0离线/1在线

	
	public int getOnline_flag() {
		return online_flag;
	}

	public void setOnline_flag(int online_flag) {
		this.online_flag = online_flag;
	}
	public MoniterData_Redis(){
		super("REDIS");
	}
	
	
	public int getConnected_clients() {
		return connected_clients;
	}


	public void setConnected_clients(int connected_clients) {
		this.connected_clients = connected_clients;
	}


	public int getBlocked_clients() {
		return blocked_clients;
	}

	public void setBlocked_clients(int blocked_clients) {
		this.blocked_clients = blocked_clients;
	}

	public long getUsed_memory() {
		return used_memory;
	}

	public void setUsed_memory(long used_memory) {
		this.used_memory = used_memory;
	}
	public long getUsed_memory_rss() {
		return used_memory_rss;
	}
	public void setUsed_memory_rss(long used_memory_rss) {
		this.used_memory_rss = used_memory_rss;
	}
	public long getUsed_memory_peak() {
		return used_memory_peak;
	}
	public void setUsed_memory_peak(long used_memory_peak) {
		this.used_memory_peak = used_memory_peak;
	}
	public String getRedis_version() {
		return redis_version;
	}
	public void setRedis_version(String redis_version) {
		this.redis_version = redis_version;
	}
	public String getRedis_mode() {
		return redis_mode;
	}
	public void setRedis_mode(String redis_mode) {
		this.redis_mode = redis_mode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
