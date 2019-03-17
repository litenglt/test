package com.powersi.backup;

import java.util.List;

import com.powersi.comm.bean.BaseBean;

/**
 * 数据库备份任务明细表
 * @author penggang
 *
 */
public class BackupTaskMx extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int task_id;			//'对应的任务ID',
	private int dbserver_id;		//'对应备份服务器信息ID',
	private String dbserver_name;	//'数据库名称',
	private String db_host_ip;	//'服务器ip',
	private String backup_table_structure;//'是否备份表结构 0不备份  1备份',
	private String backup_table_name;//'备份表参数，支持表名，带通配符，多个之间分号分割',
	private String backup_path;		//'备份文件路径',
	private String backup_zip_path;	//'备份压缩文件路径',
	private String storage_flag;	//'保存标志 0设置保存天数  1持久保持',
	private int storage_day;		//'文件保存天数',
	private BackupDBServer DBServer;
	
	public BackupDBServer getDBServer() {
		return DBServer;
	}
	public void setDBServer(BackupDBServer dBServer) {
		DBServer = dBServer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public int getDbserver_id() {
		return dbserver_id;
	}
	public void setDbserver_id(int dbserver_id) {
		this.dbserver_id = dbserver_id;
	}
	public String getDbserver_name() {
		return dbserver_name;
	}
	public void setDbserver_name(String dbserver_name) {
		this.dbserver_name = dbserver_name;
	}
	public String getBackup_table_structure() {
		return backup_table_structure;
	}
	public void setBackup_table_structure(String backup_table_structure) {
		this.backup_table_structure = backup_table_structure;
	}
	public String getBackup_table_name() {
		return backup_table_name;
	}
	public void setBackup_table_name(String backup_table_name) {
		this.backup_table_name = backup_table_name;
	}
	public String getBackup_path() {
		return backup_path;
	}
	public void setBackup_path(String backup_path) {
		this.backup_path = backup_path;
	}
	public String getBackup_zip_path() {
		return backup_zip_path;
	}
	public void setBackup_zip_path(String backup_zip_path) {
		this.backup_zip_path = backup_zip_path;
	}
	public String getStorage_flag() {
		return storage_flag;
	}
	public void setStorage_flag(String storage_flag) {
		this.storage_flag = storage_flag;
	}
	public int getStorage_day() {
		return storage_day;
	}
	public void setStorage_day(int storage_day) {
		this.storage_day = storage_day;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getDb_host_ip() {
		return db_host_ip;
	}
	public void setDb_host_ip(String db_host_ip) {
		this.db_host_ip = db_host_ip;
	}
	
	
}
