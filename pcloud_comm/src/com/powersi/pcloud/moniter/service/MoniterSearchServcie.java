package com.powersi.pcloud.moniter.service;

import java.util.List;

import com.powersi.pcloud.moniter.pojo.MoniterData;

/**
 * 根据服务器id，监控数据类型，存储监控数据的表类型，开始时间，截止时间等参数
 * 统一查询监控数据的接口
 * 传入参数，调用该接口方法，将返回监控数据父类的集合
 * @author 黄尧
 *
 */
public interface MoniterSearchServcie {
	
	/**
	 * 根据传入的参数进行监控数据的查询
	 * @param assist_uuid 服务器id
	 * @param moniterType 监控数据类型
	 * @param tableType 存储监控数据的表类型"HOUR"或者"MIN"
	 * @param startTime 开始时间，格式为年月日时（如：2016032501）
	 * @param endTime 截止时间，格式为年月日时（如：2016032530）
	 * @param tableTime 表名上的时间
	 * @return
	 */
	public List<MoniterData> searchMoniterByParams(String assist_uuid,String moniterType,String tableType,String startTime,String endTime, String tableTime);
	
	/**
	 * 根据传入的参数进行监控数据的查询
	 * @param assist_uuid 服务器id
	 * @param function_id 对于中心api的监控需要传递function_id
	 * @param moniterType 监控数据类型
	 * @param tableType 存储监控数据的表类型"HOUR"或者"MIN"
	 * @param startTime 开始时间，格式为年月日时（如：2016032501）
	 * @param endTime 截止时间，格式为年月日时（如：2016032530）
	 * @param tableTime 表名上的时间
	 * @return
	 */
	public List<MoniterData> searchMoniterByParams(String assist_uuid, String function_id, String moniterType,
			String tableType, String startTime, String endTime, String tableTime);
}
