package com.powersi.pcloud.version.pojo;

import com.powersi.comm.bean.BaseBean;

/**
 * 版本升级任务的参数实体
 */
public class VersionTaskParam extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String productName; //产品名称，即文件名称，例如hygeia_web.war
	private String targetPath;	//目标文件路径，即下载覆盖的war的路径
	private String version;		//本次发布文件的版本号
	private String fileUrl;		//本次发布文件的下载路径
	private String cleanDir;	//本次要清理的目录，支持多个路径，封号分割，例如：/app/tomcat-cache;/app/tempfile/ 
	private String restartTomcat; //是否重启tomcat  1/0
	private String restartAssist; //是否重启assist  1/0
	private String restartBoot; //是否重启assist  1/0
	private String restartWeblogic;    //是否重启weblogic    1/0
	private String deployPattern;    //weblogic部署模式，列：1（war包）或0（zip包 ）
	
	public String getRestartWeblogic() {
		return restartWeblogic;
	}
	public void setRestartWeblogic(String restartWeblogic) {
		this.restartWeblogic = restartWeblogic;
	}
	public String getDeployPattern() {
		return deployPattern;
	}
	public void setDeployPattern(String deployPattern) {
		this.deployPattern = deployPattern;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getRestartBoot() {
		return restartBoot;
	}
	public void setRestartBoot(String restartBoot) {
		this.restartBoot = restartBoot;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getTargetPath() {
		return targetPath;
	}
	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getRestartTomcat() {
		return restartTomcat;
	}
	public void setRestartTomcat(String restartTomcat) {
		this.restartTomcat = restartTomcat;
	}
	public String getCleanDir() {
		return cleanDir;
	}
	public void setCleanDir(String cleanDir) {
		this.cleanDir = cleanDir;
	}
	public String getRestartAssist() {
		return restartAssist;
	}
	public void setRestartAssist(String restartAssist) {
		this.restartAssist = restartAssist;
	}
	
}
