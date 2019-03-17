package com.powersi.pcloud.log.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * 业务日志的内容明细，存储大文本
 * @author 黄尧
 *
 */
public class LogBizDetail  extends BaseBean{
	private static final long serialVersionUID = 1L;
	private long log_id;
	private String log_detail;//详细日志内容
	private String table_name;//动态存储表名
	
	public long getLog_id() {
		return log_id;
	}
	public void setLog_id(long log_id) {
		this.log_id = log_id;
	}
	public String getLog_detail() {
		return log_detail;
	}
	public void setLog_detail(String log_detail) {
		this.log_detail = log_detail;
	}
	
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
