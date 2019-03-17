package com.powersi.bas_service.service;

import java.util.List;
import java.util.Map;

import com.powersi.bas_service.pojo.BasServiceEndPoint;
import com.powersi.bas_service.pojo.BasServiceType;

/**
 * bas_service_type表操作接口
 * @author dell-pc
 *
 */
public interface BasServiceTypeDao {
	
	
	/**
	 * 获取服务类型信息列表(包含版本号)
	 * @return
	 * List<BasServiceType>
	 */
	public List<BasServiceType> getServiceTypeCurrentVer();
	
	/**
	 * 获取最新的服务类型
	 * @return
	 * List<BasServiceType>
	 */
	public List<BasServiceType> getBasServiceType(BasServiceType basServiceType);
	
	/**
	 * 查询系统资源概况，服务类型运行（配置台数）情况
	 * @return
	 * Map
	 */
	public Map<String, Object> getMoniterServiceTypeRun();
	
	/**
	 * 获取0平台服务     1业务服务的服务类型
	 * @return
	 */
	public List<BasServiceType> getBasServiceTypeByServiceType();
	
	/**
	 * 修改服务类型表中rpc的ip和端口号
	 * @param basServiceType 服务类型实体basServiceTypebasServiceType
	 *
	 */
	void updateRpcInfo(BasServiceType basServiceType);
	
	/**
	 * 查询所有通过统筹区来区分的配置信息
	 * @return
	 */
	public List<BasServiceEndPoint> getBasServiceEndPoints();
	
	/**
	 * 插入bas_service_endpoint表
	 * @param basServiceEndPoint
	 */
	public void insertDuplicateKeyUpdate(BasServiceEndPoint basServiceEndPoint);
	
}
