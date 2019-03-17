package com.powersi.pcloud.rpc.service;

import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powersi.comm.service.memory.MemoryDB;


/**
 * 读取redis存储服务关系配置信息
 * @author 李志钢
 * 
系统开发RpcConfigReadService，本服务负责2件事情

A. 从redis读取给定服务名称对应的IP:Port，例如HYGEIA_API，这里不包括:HYGEIA_DB

B. 从redis读取给定医院编码对应的DBService IP:PORT，例如传入：4301xxxx  返回 172.18.1.11:8080



Redis中的存储结构：

A. MAP     name=MAP_RPC_SERVICE_CONFIG

                 key=service_name，例如PCLOUD_MONITER

              value=172.18.100.11:9031


B. MAP     name=MAP_RPC_BIZ_DBSERVICE

             key=医院编码

              value=172.18.100.11:9031
 *
 */
@Service("RpcConfigReadService")
public class RpcConfigReadService {
	@Autowired
	private MemoryDB memoryDB;
	
	@Autowired
	private Properties configs;	
	
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	private final String MAP_RPC_SERVICE_CONFIG = "MAP_RPC_SERVICE_CONFIG";
	private final String MAP_RPC_BIZ_DBSERVICE = "MAP_RPC_BIZ_DBSERVICE";
	
	/**
	 * 根据服务名称读取rpc入口
	 * @param service_name
	 * @return  IP:PORT
	 */
	public String getConfigByServiceName(String service_name){
		//如果是本地rpc调试模式
		if( "1".equals(configs.getProperty("pcloud_rpc.debug_mode"))){
			return configs.getProperty("pcloud_rpc.debug_endpoint", "127.0.0.1:8080");
		}
		
		String sRet = (String) memoryDB.getMapValue(MAP_RPC_SERVICE_CONFIG, service_name);
		if( StringUtils.isBlank(sRet) ){
			logger.error("无法找到给定服务对应的访问入口信息："+service_name);
			return "";
		}
		
		return sRet;
	}
	
	
	/**
	 * 根据服务名称读取rpc入口
	 * @param service_name
	 * @return  IP:PORT
	 */
	public String getDBServiceConfigByYYBM(String yybm){
		String sRet = (String) memoryDB.getMapValue(MAP_RPC_BIZ_DBSERVICE, yybm);
		if( StringUtils.isBlank(sRet) ){
			logger.error("无法找到给定服务对应的数据服务访问入口信息,医院编码："+yybm);
			return "";
		}
		return sRet;
	}
}
