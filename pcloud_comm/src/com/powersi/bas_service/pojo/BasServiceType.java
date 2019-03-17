package com.powersi.bas_service.pojo;

import java.util.Map;

import com.powersi.comm.bean.BaseBean;

/**
 * @Description 服务类型 实体类
 * @author "lingang"
 * @time 2016年4月21日下午2:33:24
 *
 */
public class BasServiceType extends BaseBean{

	private static final long serialVersionUID = 1L;
	private String service_name;//服务名称 简拼or英语大写  CALC, DBSERVICE, MYSQL
	private String service_title;//服务的显示标题  如计算服务
	private String logo;//图标 目前是字体图标，这里存储文字编码
	private String service_type;//服务类型 0平台服务     1业务服务   2中间件mysql,redis等
	private int sort_id;//排序编号 默认99
	private String valid_flag;//有效标志 0停用     1正常
	private String current_ver;//当前版本号
	private String div_param;//架构图div显示参数，x,y,w,h 拼接字符串
	private String rpc_ip;//'服务访问入口IP'
	private int rpc_port;//'服务访问入口端口'
	private String url="";//服务访问的url路径（nginx）默认为空字符串
	private String deploy_type;//部署方式1/assist部署2/tomcat部署3/weblogic服务部署4/boot服务部署0/其他服务
	private String service_type_name;//服务类型名称
	private Map map;
	
	public String getDeploy_type() {
		return deploy_type;
	}
	public void setDeploy_type(String deploy_type) {
		this.deploy_type = deploy_type;
	}
	public String getService_type_name() {
		return service_type_name;
	}
	public void setService_type_name(String service_type_name) {
		this.service_type_name = service_type_name;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getService_title() {
		return service_title;
	}
	public void setService_title(String service_title) {
		this.service_title = service_title;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getService_type() {
		return service_type;
	}
	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	public int getSort_id() {
		return sort_id;
	}
	public void setSort_id(int sort_id) {
		this.sort_id = sort_id;
	}
	public String getValid_flag() {
		return valid_flag;
	}
	public void setValid_flag(String valid_flag) {
		this.valid_flag = valid_flag;
	}
	public String getCurrent_ver() {
		return current_ver;
	}
	public void setCurrent_ver(String current_ver) {
		this.current_ver = current_ver;
	}
	public String getDiv_param() {
		return div_param;
	}
	public void setDiv_param(String div_param) {
		this.div_param = div_param;
	}
	
	public String getRpc_ip() {
		return rpc_ip;
	}
	public void setRpc_ip(String rpc_ip) {
		this.rpc_ip = rpc_ip;
	}
	public int getRpc_port() {
		return rpc_port;
	}
	public void setRpc_port(int rpc_port) {
		this.rpc_port = rpc_port;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
