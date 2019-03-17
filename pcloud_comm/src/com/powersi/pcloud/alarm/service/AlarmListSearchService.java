package com.powersi.pcloud.alarm.service;

import java.util.List;
import java.util.Map;

import com.powersi.comm.mybatis.Page;
/**
 * 告警记录查询的接口
 * @author huangyao
 *
 */
public interface AlarmListSearchService {
	
	/**
	 * 根据参数查询告警记录
	 * @param service_code 告警对象代码
	 * @param startTime 开始时间
	 * @param endTime   结束时间
	 * @param page      Page对象
	 * @return
	 */
	public Map<String,Object> searchAlarmListByParam(String service_code,String startTime,String endTime,Page page);

	/**
	 * 查询出前天凌晨后产生了告警的对象代码
	 * @param todayTime 当前天凌晨
	 * @return
	 */
	List<String> searchServiceCodeAfterTodayToAlarm(String todayTime);
	
	/**
	 * 根据服务器的uuid查询告警记录，进行分页
	 * @param assist_uuid 服务器uuid
	 * @param page Page实体对象
	 * @return Page实体对象和告警记录实体的map
	 */
	public Map<String,Object> searchAlarmListByUUID_page(String assist_uuid ,Page page);

}
