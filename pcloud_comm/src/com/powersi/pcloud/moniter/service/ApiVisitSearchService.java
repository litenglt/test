package com.powersi.pcloud.moniter.service;

import java.util.List;
import java.util.Map;

/**
 * API访问信息查询 远程接口
 * @author "lingang"
 * @time 2016年8月3日下午5:30:50
 *
 */
public interface ApiVisitSearchService {

	/**
	 * 获取全局访问统计信息 按照时间统计
	 * 	访问全局的统计查询的是账户表即可，账户表会统计全部的访问情况
	 * @param startTime 查询开始时间
	 * @param endTime 查询结束时间
	 * @param count_way 统计方式  1 天 2 小时
	 * @param query_type 查询类型
	 * @return
	 * List
	 */
	public List<Map<String,Object>> searchGlobalVisitInfoByTime(String startTime,String endTime,String count_way,
			String sum_type,String title_code,String search_code,String query_type);
	
	/**
	 * 查询api、账户、医疗机构编码 三种类型的全局访问统计信息
	 * @param startTime 查询开始时间
	 * @param endTime 查询结束时间
	 * @param sum_type  为 yybm、acc_code、function_id
	 * @param condition_value  条件参数值
	 * @param query_type  查询类型
	 * @return
	 * List
	 */
	public List<Map<String,Object>> searchGlobalVisitSumByType(String startTime,String endTime,String sum_type,
			String condition_value,String query_type);
	
	/**
	 * 根据条件查询 api访问信息
	 * @param map
	 * @return
	 * Map
	 */
	public Map selectApiVisitInfo(Map map);
	
	/**
	 * 根据医院与api 查询每日访问详情
	 * @param map
	 * @return
	 * Map
	 */
	public Map selectApiVisitDayDetailInfo(Map map);
	
	/**
	 * 异步统计最新数据
	 */
	public void asynCount();
}
