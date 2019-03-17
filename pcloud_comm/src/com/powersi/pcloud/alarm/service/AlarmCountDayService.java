package com.powersi.pcloud.alarm.service;

import java.util.List;

import com.powersi.pcloud.alarm.pojo.AlarmCountDay;

/**
 * 告警日统计操作类
 * @author 彭刚
 */
public interface AlarmCountDayService {
	/**
	 * 新增记录
	 * @param bean
	 */
	public void insertAlarmCountDay(AlarmCountDay bean);
	
	/**
	 * 根据告警对象与开始截止时间查询记录
	 * @param service_code
	 * @param startDay
	 * @param endDay
	 * @return
	 */
	public List<AlarmCountDay> findAlarmCount(String service_code,String startDay,String endDay);
}
