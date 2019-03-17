package com.powersi.pcloud.moniter.pojo;

/**
 * MySQL参数类，用于计算qps与tps
 * @author 彭刚
 *
 */
public class MysqlParam {
	private float Questions;//执行次数
	private float Uptime;//服务器运行时间（秒钟）
	private float Com_commit;//提交事物
	private float Com_rollback;//回滚事物
	public float getQuestions() {
		return Questions;
	}
	public void setQuestions(float questions) {
		Questions = questions;
	}
	public float getUptime() {
		return Uptime;
	}
	public void setUptime(float uptime) {
		Uptime = uptime;
	}
	public float getCom_commit() {
		return Com_commit;
	}
	public void setCom_commit(float com_commit) {
		Com_commit = com_commit;
	}
	public float getCom_rollback() {
		return Com_rollback;
	}
	public void setCom_rollback(float com_rollback) {
		Com_rollback = com_rollback;
	}
	
}
