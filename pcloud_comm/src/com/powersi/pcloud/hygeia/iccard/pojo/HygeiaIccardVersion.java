package com.powersi.pcloud.hygeia.iccard.pojo;

import java.util.Date;

import com.powersi.comm.bean.BaseBean;

/**
 * IC卡客户端版本记录表
 * @author 林刚
 *
 */
public class HygeiaIccardVersion extends BaseBean{

	private static final long serialVersionUID = 1L;
	private int id;//                   bigint not null auto_increment,
	private String version;//int not null comment '版本号',
	private Date deploy_time;//          datetime not null comment '发布时间',
	private String user_name;//            varchar(128) not null comment '操作者名称',
	private String deploy_comm;//          Text comment '发布说明',
	private String file_url;//             varchar(256) comment '文件下载地址',
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Date getDeploy_time() {
		return deploy_time;
	}
	public void setDeploy_time(Date deploy_time) {
		this.deploy_time = deploy_time;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getDeploy_comm() {
		return deploy_comm;
	}
	public void setDeploy_comm(String deploy_comm) {
		this.deploy_comm = deploy_comm;
	}
	public String getFile_url() {
		return file_url;
	}
	public void setFile_url(String file_url) {
		this.file_url = file_url;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
