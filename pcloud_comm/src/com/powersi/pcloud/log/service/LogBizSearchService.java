package com.powersi.pcloud.log.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.powersi.pcloud.log.pojo.LogBiz;
import com.powersi.pcloud.log.pojo.LogBizDetail;
import com.powersi.pcloud.log.pojo.LogBizFuncs;
import com.powersi.pcloud.log.pojo.LogBizSummerHour;

public interface LogBizSearchService {
	
	/**
	 * 获取log_biz_funcs表中所有的不重复应用系统名称
	 * @return
	 */
	public List<String> getAppNameList();
	
	/**
	 * 根据应用系统名称获取业务功能清单
	 * @param app_name	业务标识名称
	 * @return list
	 */
	public List<LogBizFuncs> getLogBizFuncsByAppName(String app_name);
	
	/**
	 * 获取业务功能清单
	 * @return list
	 */
	public List<LogBizFuncs> getLogBizFuncs();
	
	/**
	 * 根据条件查询业务日志
	 * @param startTime	开始时间（精确到小时）
	 * @param endTime 结束时间（精确到小时）
	 * @param app	业务标识名称
	 * @param bizUuid 业务识别号
	 * @param execFlag	执行成功标志（0/1）
	 * @param funcId	业务功能标识
	 * @return list
	 */
	public List<LogBiz> searchLogBiz(Date startTime,Date endTime,String app,String bizUuid,String execFlag,String funcId);
	
	/**
	 * 根据条件查询统计表
	 * @param app	业务系统标识名称
	 * @param funcId	业务功能标识
	 * @param execFlag	执行成功（0/1）
	 * @param day	日期（精确到天）
	 * @return list
	 */
	public List<LogBizSummerHour> searchLogBizSummerHour(Map map);
	
	/**
	 * 分析业务性能日志情况
	 * @param app	业务系统标识名称
	 * @param funcId	业务功能标识
	 * @param execFlag	执行成功（0/1）
	 * @param day	日期（精确到天）
	 * @return map
	 */
	public List<LogBizSummerHour> logAnalysis(Map map);
	
	/**
	 * 首页  服务性能分析 每日汇总业务服务访问次数及平均时间，业务服务前N访问的情况
	 * @param number 查询的记录数量
	 * @return
	 * LogBizSummerHour
	 */
	public Map searchDayServePerformance(int number);
	
	/**
	 * 查询出监控日志表
	 * @param map
	 * @return
	 * Map
	 */
	public Map selectLogbiz(Map map);
	
	/**
	 * 查询监控日志详情表
	 * @param map
	 * @return
	 * LogBizDetail
	 */
	public LogBizDetail selectLogbizDetail(Map map);
}
