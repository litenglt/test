package com.powersi.pcloud.host;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.powersi.comm.bean.BaseBean;

/**
 * 对应bas_host表
 * @author 李志钢
 *
 */
public class BasHost extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 服务器类型-主服务器类型:双活模式下的主或者是非双活模式下的服务器
	 */
	public static final String  HOST_TYPE_M = "MASTER";
	/**
	 * 服务器类型-虚拟IP服务器类型
	 */
	public static final String  HOST_TYPE_V = "VIP";
	/**
	 * 服务器类型-从服务器类型
	 */
	public static final String  HOST_TYPE_B = "BACKUP";
	private String assist_uuid;//服务器id
	private String host_ip;//ip地址
	private Date reg_time;//登记时间
	private String online_flag;//在线标志
	private String assist_ver;//助手版本号
	private String host_cpu;//服务器cpu配置描述
	private String host_mem;//服务器内存配置描述
	private String host_disk;//磁盘大小描述
	private String host_os_ver;//操作系统版本描述
	private String host_name;//服务器的名称
	private int capacity = 0;//服务能力，数值标识，对应医院分配存储时使用
	private int capacity_used = 0;//已经分配使用的服务能力(分配的医院权重之和)
	private int over_plus_capacity;//剩余的服务能力
	private String host_group; //服务器分组,按地市的分组
	private String host_group_str;
	
	private String vip_ip;//虚拟IP地址
	private String host_type;//服务器类型MASTER(主)、BACKUP(从)、VIP(虚拟IP)
	
	public String getHost_group() {
		return host_group;
	}
	public void setHost_group(String host_group) {
		this.host_group = host_group;
	}
	public String getVip_ip() {
		return vip_ip;
	}
	public void setVip_ip(String vip_ip) {
		this.vip_ip = vip_ip;
	}
	public String getHost_type() {
		return host_type;
	}
	public void setHost_type(String host_type) {
		this.host_type = host_type;
	}
	private List<String> db_names = new ArrayList<String>();//数据库名称
	public String getHost_name() {
		return host_name;
	}
	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getAssist_uuid() {
		return assist_uuid;
	}
	public void setAssist_uuid(String assist_uuid) {
		this.assist_uuid = assist_uuid;
	}
	public String getHost_ip() {
		return host_ip;
	}
	public void setHost_ip(String host_ip) {
		this.host_ip = host_ip;
	}
	public Date getReg_time() {
		return reg_time;
	}
	public void setReg_time(Date reg_time) {
		this.reg_time = reg_time;
	}
	public String getOnline_flag() {
		return online_flag;
	}
	public void setOnline_flag(String online_flag) {
		this.online_flag = online_flag;
	}
	public String getAssist_ver() {
		return assist_ver;
	}
	public void setAssist_ver(String assist_ver) {
		this.assist_ver = assist_ver;
	}
	public String getHost_cpu() {
		return host_cpu;
	}
	public void setHost_cpu(String host_cpu) {
		this.host_cpu = host_cpu;
	}
	public String getHost_mem() {
		return host_mem;
	}
	public void setHost_mem(String host_mem) {
		this.host_mem = host_mem;
	}
	public String getHost_disk() {
		return host_disk;
	}
	public void setHost_disk(String host_disk) {
		this.host_disk = host_disk;
	}
	public String getHost_os_ver() {
		return host_os_ver;
	}
	public void setHost_os_ver(String host_os_ver) {
		this.host_os_ver = host_os_ver;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getCapacity_used() {
		return capacity_used;
	}
	public void setCapacity_used(int capacity_used) {
		this.capacity_used = capacity_used;
	}
	public int getOver_plus_capacity() {
		return over_plus_capacity;
	}
	public void setOver_plus_capacity(int over_plus_capacity) {
		this.over_plus_capacity = over_plus_capacity;
	}
	public List<String> getDb_names() {
		return db_names;
	}
	public void setDb_names(List<String> db_names) {
		this.db_names = db_names;
	}
	public String getHost_group_str() {
		return host_group_str;
	}
	public void setHost_group_str(String host_group_str) {
		this.host_group_str = host_group_str;
	}
	
}
