package com.powersi.jmeter.pojo;

import com.powersi.comm.bean.BaseBean;
/**
 * jmeter测试需传递的参数实体类
 * @author 黄尧
 *
 */
public class JmeterParam extends BaseBean{

	private static final long serialVersionUID = 1L;
	//通用参数
	private long report_id;//报告id
	private long scene_id;//场景id
	private long keep_sec;//测试持续时长
	private String script_name;//脚本名称
	private String script_type;//脚本类型(1简易脚本，即在页面编辑    2 脚本文件，即上传脚本)
	private int wait_sec;//测试启动等待时间
	
	//上传脚本需传递的参数
	private String script_url;//脚本存放路径(ftp服务器路径)
	//简易脚本需要传递的参数实体
	private SimpleScriptParam simpleScriptParam;
	public long getReport_id() {
		return report_id;
	}
	public void setReport_id(long report_id) {
		this.report_id = report_id;
	}
	public long getScene_id() {
		return scene_id;
	}
	public void setScene_id(long scene_id) {
		this.scene_id = scene_id;
	}
	public long getKeep_sec() {
		return keep_sec;
	}
	public void setKeep_sec(long keep_sec) {
		this.keep_sec = keep_sec;
	}
	public String getScript_name() {
		return script_name;
	}
	public void setScript_name(String script_name) {
		this.script_name = script_name;
	}
	public String getScript_type() {
		return script_type;
	}
	public void setScript_type(String script_type) {
		this.script_type = script_type;
	}
	public int getWait_sec() {
		return wait_sec;
	}
	public void setWait_sec(int wait_sec) {
		this.wait_sec = wait_sec;
	}
	public String getScript_url() {
		return script_url;
	}
	public void setScript_url(String script_url) {
		this.script_url = script_url;
	}
	public SimpleScriptParam getSimpleScriptParam() {
		return simpleScriptParam;
	}
	public void setSimpleScriptParam(SimpleScriptParam simpleScriptParam) {
		this.simpleScriptParam = simpleScriptParam;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
