package com.powersi.pcloud.log.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.powersi.comm.mybatis.Page;
import com.powersi.pcloud.log.pojo.LogSample;

public interface LogSearchService {
	
	/**
	 * 获取所有业务系统标识名称
	 * @return list （业务系统标识名称）
	 */
	public List<String> getAppList();
	
	/**
	 * 传入app，获取相应模块值
	 * @param app 业务系统标识名称
	 * @return list（业务系统标识名称）
	 */
	public List<String> getModuleList(String app);
	
	/**
	 * 传入app与module，获取相应类别
	 * @param app 业务系统标识名称
	 * @param module 模块
	 * @return list（类别）
	 */
	public List<String> getTypesList(String app,String module);
	
	/**
	 * 传入app,module,type,startTime,endTime,outline,获取日志信息
	 * @param app	业务系统标识名称
	 * @param module	模块
	 * @param type	类别
	 * @param tableName	表名
	 * @param startTime	开始时间（精确到小时）
	 * @param endTime	截止时间（精确到小时）
	 * @param outline	日志摘要
	 * @param page 
	 * @return	
	 */
	Map<String, Object> searchLogs(String app, String module, String type,
			String tableName, Date startTime, Date endTime, String outline,String server_uuid, Page page);
	
	/**
	 * 传入table_name,logId,获取详细日志
	 * @param table_name 日志主表表名
	 * @param logId	日志id
	 * @return	bean(详细日志)
	 */
	LogSample getLogDetailByID(String table_name, String logId);
	
	/**
	 * 获取当日产生的日志的最后一条（用于判断当日是否产生了日志）
	 * @param app	业务系统标识名称
	 * @param module	模块
	 * @param logType	日志类型
	 * @param startTime	查询时的开始时间
	 * @param server_uuid 服务器uuid
	 * @return LogSample（日志实体）
	 */
	LogSample searchCrrentdayLogData(String app, String module, String logType,String startTime, String server_uuid);

}
