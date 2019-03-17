package com.powersi.pcloud.moniter.service;

import java.util.List;
import java.util.Map;

import com.powersi.pcloud.moniter.pojo.MoniterBizHour;

/**
 * 
 * @author 彭刚
 *
 */
public interface MoniterBizSearchService {
	
	/**
	 * 传入类别与时间，查询业务监控表
	 * @param table_name  查询表名
	 * @param zone_code  地区编码
	 * @param bizType 类别
	 * @param startTime 开始时间(确定yyyymmddhh)
	 * @param endTime 结束时间(确定yyyymmddhh)
	 * @return
	 */
	public List<MoniterBizHour> searchMoniterBiz(String table_name,String zone_code ,String bizType,String startTime,String endTime);
	
	/**
	 * 传入类别与时间、地区编码，对业务量统计数据求和
	 * @param table_name  查询表名
	 * @param zone_code  地区编码
	 * @param bizType 类别
	 * @param startTime 开始时间(确定yyyymmddhh)
	 * @param endTime 结束时间(确定yyyymmddhh)
	 * @return
	 */
	public String getBizValueTotal(String table_name,String zone_code ,String bizType,String startTime,String endTime);
	
	/**
	 * 查询业务明细数据   --带分页参数
	 * @param 参数MAP param里面包含如下key：
	 * @param page 分页参数（必须）
	 * @param biz_type 业务类型
	 * @param start_time 查询开始时间（yyyy-MM-dd HH:mm:ss）（必须,默认当天00:00:00）
	 * @param end_time 查询结束时间（yyyy-MM-dd HH:mm:ss）（必须,默认当天23:59:59）
	 * @param zone_code 地区(统筹区编码)
	 * @param yybm 医院编码
	 * @return
	 * Map<String,Object>
	 */
	public Map<String,Object> searchMoniterBizMX(Map<String,Object> param);
	
	/**
	 * 查询redis中今日的累加数据，比如今日住院人次
	 * @param moniterTypes	数据的标识，对应业务代码中MoniterTypes的成员
	 * @param zoneCode 地区编码
	 * @return
	 */
	public Double getDaySummerData( String moniterTypes,String zoneCode );
	
	/**
	 * 查询业务统计监控数据
	 * @param zone_code 地区编码
	 * @param yybm 医疗机构编码
	 * @param indexterm 统计指标项 逗号分隔
	 * @param count_way 统计方式 2小时 1 天
	 * @param startTime 统计开始时间
	 * @param endTime 	统计结束时间
	 * @return
	 * List<MoniterBizHour>
	 */
	public List<MoniterBizHour> searchMoniterBizCount(String zone_code,String yybm,String indexterm,String count_way,String startTime,String endTime);
	
	/**
	 * 汇总各个指标项统计数据
	 * 	求和
	 * @param zone_code 地区编码
	 * @param indexterm 统计指标项 逗号分隔
	 * @param startTime 统计开始时间
	 * @param endTime 	统计结束时间
	 * @return
	 * List<Map>
	 */
	public List<Map> searchMoniterBizDataCountSum(String zone_code,String indexterm,String startTime,String endTime);
}
