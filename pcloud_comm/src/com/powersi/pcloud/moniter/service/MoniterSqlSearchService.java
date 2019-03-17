package com.powersi.pcloud.moniter.service;

import java.util.List;
import java.util.Map;

import com.powersi.comm.mybatis.Page;
/**
 * 进行监控sql统计信息查询的接口，需要实现rpc的远程调用
 * @author 黄尧
 *
 */
public interface MoniterSqlSearchService {
	
	/**
	 * 获取产生了sql监控信息的应用名称
	 * @return 应用名称List
	 */
	List<String> getAppNameList();
	
	/**
	 * 分页查询监控sql的信息
	 * @param server_uuid 服务器uuid
	 * @param app         应用名称
	 * @param searchVal   查询内容
	 * @param page        分页参数
	 * @param order_type  排序的类别 如exec_err_rate,max_record_count等
	 * @param order_flag  排序的标志，顺序或者倒序DESC,ASC
	 * @param page
	 * @return
	 */
	Map<String, Object> searchSqlInfos( String server_uuid ,String app,String data_time, String searchVal,String order_type,String order_flag, Page page);
	
	
	/**
	 * 查询SQL明细
	 * @param id
	 * @return
	 */
	String getSqlDetailByID(Long id);
	
	/**
	 * 对当天的数据进行实时统计
	 * @param needSummaryTime
	 */
	void countCurrentDayData(String needSummaryTime);

}
