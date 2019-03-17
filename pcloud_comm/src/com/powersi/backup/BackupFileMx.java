package com.powersi.backup;

import java.util.Date;


import com.powersi.comm.bean.BaseBean;

/**
 * 数据库备份文件明细表
 * @author penggang
 *
 */
public class BackupFileMx extends BaseBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String assist_uuid;			//'服务器uuid',
	private String backup_file_name;	//'备份文件名',
	private Date backup_time;			//'备份时间',
	private String backup_zip_path;		//'备份压缩文件路径',
	private int storage_day;			//'文件保存天数',
	private String backup_db_info;      //数据库信息 
	private int dbserverid;             //备份服务器id
	private BackupDBServer dbserver;    //服务器对象
	public int getDbserverid() {
		return dbserverid;
	}
	public void setDbserverid(int dbserverid) {
		this.dbserverid = dbserverid;
	}
	public BackupDBServer getDbserver() {
		return dbserver;
	}
	public void setDbserver(BackupDBServer dbserver) {
		this.dbserver = dbserver;
	}
	public String getBackup_db_info() {
		return backup_db_info;
	}
	public void setBackup_db_info(String backup_db_info) {
		this.backup_db_info = backup_db_info;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssist_uuid() {
		return assist_uuid;
	}
	public void setAssist_uuid(String assist_uuid) {
		this.assist_uuid = assist_uuid;
	}
	public String getBackup_file_name() {
		return backup_file_name;
	}
	public void setBackup_file_name(String backup_file_name) {
		this.backup_file_name = backup_file_name;
	}
	public Date getBackup_time() {
		return backup_time;
	}
	public void setBackup_time(Date backup_time) {
		this.backup_time = backup_time;
	}
	public String getBackup_zip_path() {
		return backup_zip_path;
	}
	public void setBackup_zip_path(String backup_zip_path) {
		this.backup_zip_path = backup_zip_path;
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
	
}
