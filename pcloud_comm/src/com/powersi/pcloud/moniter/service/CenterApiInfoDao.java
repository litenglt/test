package com.powersi.pcloud.moniter.service;

import java.util.List;
import java.util.Map;

import com.powersi.api.pojo.CenterApiInfo;

public interface CenterApiInfoDao {
	/**
	 * 查询所有得中心api信息
	 * @return
	 */
	public List<CenterApiInfo> selectAllCenterApiInfo();
	
	
	/**
	 * 根据信息参数获取中心api信息
	 * @param centerApiInfo
	 * @return
	 */
	public List<CenterApiInfo> selectCenterApiInfo(CenterApiInfo centerApiInfo);
	
	/**
	 * 修改中心api信息
	 * @param centerApiInfo
	 * @return
	 */
	public void updateCenterApiInfo(CenterApiInfo centerApiInfo);
	
	
	/**
	 * 新增中心api信息
	 * @param centerApiInfo
	 * @return
	 */
	public void insertCenterApiInfo(CenterApiInfo centerApiInfo);
	
	
	/**
	 * 删除中心api信息
	 * @param id
	 * @return
	 */
	public void delCenterApiInfoById(long id);
	
	
	/**
	 * 根据功能id和关键参数值(唯一索引)删除中心api信息
	 * @param function_id
	 * @param key_param 
	 * @return
	 */
	public void delCenterApiInfoByUniqueKey(String function_id,String key_param);

	/**
	 * 根据id查询中心api信息
	 * @param id
	 * @return
	 */
	CenterApiInfo selectAllCenterApiInfoById(long id);

	/**
	 * 根据参数查询中心api信息
	 * @param map searchVal(模糊查询function_id，key_param,function_name),calc_sign
	 * @return
	 */
	public List<CenterApiInfo> selectCenterApiInfoByParam(Map<String, String> map);
	
	
	
}
