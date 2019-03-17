package com.powersi.pcloud.log.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.powersi.comm.mybatis.Page;
import com.powersi.pcloud.log.pojo.LogSql;

public interface LogSqlSearchService {
	
	/**
	 * 根据id获取sql日志详细信息
	 * @param time sql日志产生的时间
	 * @param id
	 * @return
	 */
	public LogSql getLogSqlDetailByID(Date time,String id);
	
	/**
	 * 获取sql日志的获取所有业务系统标识名称
	 */
	public List<String> getSQLAppList();
	
	/**
	 * 根据条件查询sql日志表
	 * @param smallExeTime 执行时间范围的较小值
	 * @param bigExeTime	执行时间范围的较大值
	 * @param tableName 表名
	 * @param app	业务标识名称
	 * @param outline	日志摘要
	 * @param bizUuid	业务标识号
	 * @param startTime	开始时间
	 * @param endTime	结束时间
	 * @param server_uuid 服务器uuid
	 * @param page Page对象
	 * @return
	 */
	Map<String, Object> searchSqlLogs(int smallExeTime, int bigExeTime,String app, String tableName, Date startTime, Date endTime,
			String outline, /*String server_uuid,*/ Page page);
}
