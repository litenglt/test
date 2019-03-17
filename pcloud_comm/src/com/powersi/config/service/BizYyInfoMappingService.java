package com.powersi.config.service;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.powersi.comm.service.memory.MemoryDB;
/**
 * 在缓存中进行医院编码小写映射
 * 在操作修改MAP_BIZ_YY_INFO中医院编码（key）信息时需要调用
 * 
 * 此service并不是每个工程都需要用到，请采用xml的方式注入Bean到需要调用的项目的spring文件中
 * 如：
 * <bean id="bizYyInfoMappingService" class="com.powersi.config.service.BizYyInfoMappingService"></bean>
 * @author 黄尧
 *
 */
public class BizYyInfoMappingService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private static final String MAP_BIZ_YYBM_MAPPING = "MAP_BIZ_YYBM_MAPPING";
	@Autowired
	MemoryDB memoryDB;
	
	/**
	 * 在缓存中进行医院编码小写映射
	 * 缓存中MAP_BIZ_YYBM_MAPPING，存储key：小写医院编码 value：医院编码
	 * @param yybm 医院编码
	 */
	public void addHospitalCodeMapping(String yybm){
		if (StringUtils.isBlank(yybm)) {
			logger.error("进行医院编码小写映射时，传入的医院编码为空");
			return;
		}
		//检测是否存在转小写之后值相同的医院编码，有并且存在医院编码大小写的差异，如Sr001和SR001这样的存在，则记录错误日志
		String lower_case_yybm = yybm.toLowerCase();
		boolean isExist = memoryDB.existMapKey(MAP_BIZ_YYBM_MAPPING, lower_case_yybm);
		if (isExist) {
			String save_yybm = (String) memoryDB.getMapValue(MAP_BIZ_YYBM_MAPPING, lower_case_yybm);
			if (!yybm.equals(save_yybm)) {
				logger.error("系统发现存在医院编码："+save_yybm+","+yybm+",目前，系统不支持这种情况的共存");
				return;
			}
		}
		//将映射关系加载到缓存中
		memoryDB.setMapValue(MAP_BIZ_YYBM_MAPPING, lower_case_yybm, yybm);
		
	}
	
	/**
	 * 删除医院编码小写映射
	 * @param yybm
	 */
	public void removeHospitalCodeMapping(String yybm){
		if (StringUtils.isBlank(yybm)) {
			logger.error("删除医院编码小写映射时，传入的医院编码为空");
			return;
		}
		String lower_case_yybm = yybm.toLowerCase();
		memoryDB.removeMapValue(MAP_BIZ_YYBM_MAPPING, lower_case_yybm);
	}
	
	
	/**
	 * 删除医院编码小写映射key--"MAP_BIZ_YYBM_MAPPING"
	 */
	public void delHospitalCodeMappingKey(){
		memoryDB.delete(MAP_BIZ_YYBM_MAPPING);
	}
	
	/**
	 * 将医院编码的小写映射map初始化到缓存
	 * @param  mappingMap 医院编码的小写映射map，key 医院编码小写  value 医院编码
	 */
	public void initHospitalCodeMappingMap(Map mappingMap) {
		memoryDB.initMap(MAP_BIZ_YYBM_MAPPING, 0, mappingMap);
	}
	
	
	/**
	 * 根据医院编码小写值从映射缓存中获取真实的医院编码
	 * @param lowerCaseYybm 医院编码小写
	 * @return 真实的医院编码 String
	 */
	public String getMappingRealHospitalCode(String lowerCaseYybm) {
		if (!memoryDB.existMapKey(MAP_BIZ_YYBM_MAPPING, lowerCaseYybm)) {
			return null;
		}
		return (String)memoryDB.getMapValue(MAP_BIZ_YYBM_MAPPING, lowerCaseYybm);
	}
}
