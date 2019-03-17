package com.powersi.pcloud.assist.pojo;

import java.util.HashMap;
import java.util.Map;

import com.powersi.comm.bean.BaseBean;
import com.powersi.pcloud.host.BasHost;

/**
 * pcloud_assist发起的心跳包
 * @author 李志钢
 *
 */
public class AssistHeart extends BaseBean {
	private static final long serialVersionUID = 1L;
	private String assist_uuid; //assist_uuid
	private String assist_version; //自身版本号，MainService成员变量中定义死
	private String assist_types; //客户端类别，多个逗号分割CALC,POLICY
	//最后任务的时间yyyymmddhhMMss ，客户端最开始本字段传值为空，后续得到了任务，就记录最大的任务时间
	private String lastTaskTime;
	
	//存储客户端管理文件对象的版本号，key是文件名，例如phs.war，value是字符串版本号
	private Map<String, String> verMap = new HashMap<String, String>();
	
	//本地配置的版本号，初始为空，下载一次配置后，就存储并记录该配置的版本号，每次心跳时携带
	private String configVersion;

	//存储assist所在服务器的信息，每次启动确保成功提交中心一次即无需再次携带
	private BasHost basHost; 
	
	private String host_type;//服务器类型MASTER(主)、BACKUP(从)、VIP(虚拟IP)
	 
	public String getHost_type() {
		return host_type;
	}

	public void setHost_type(String host_type) {
		this.host_type = host_type;
	}

	public String getAssist_uuid() {
		return assist_uuid;
	}

	public void setAssist_uuid(String assist_uuid) {
		this.assist_uuid = assist_uuid;
	}

	public String getAssist_version() {
		return assist_version;
	}

	public void setAssist_version(String assist_version) {
		this.assist_version = assist_version;
	}

	public String getAssist_types() {
		return assist_types;
	}

	public void setAssist_types(String assist_types) {
		this.assist_types = assist_types;
	}

	public String getLastTaskTime() {
		return lastTaskTime;
	}

	public void setLastTaskTime(String lastTaskTime) {
		this.lastTaskTime = lastTaskTime;
	}

	public Map<String, String> getVerMap() {
		return verMap;
	}

	public void setVerMap(Map<String, String> verMap) {
		this.verMap = verMap;
	}

	public String getConfigVersion() {
		return configVersion;
	}

	public void setConfigVersion(String configVersion) {
		this.configVersion = configVersion;
	}

	public BasHost getBasHost() {
		return basHost;
	}

	public void setBasHost(BasHost basHost) {
		this.basHost = basHost;
	}
	
	
}
