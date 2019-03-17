package com.powersi.pcloud.alarm.service;

import java.util.List;

import com.powersi.pcloud.alarm.pojo.AlarmService;
import com.powersi.pcloud.alarm.pojo.AlarmServiceKeys;

/**
 * 提供对alarm_service以及alarm_service_keys的查询管理
 * @author 李志钢
 *
 */
public interface AlarmServiceManager {
	/**
	 * 得到所有的alarm_service记录，按照sort_id排序
	 * @return
	 */
	public List<AlarmService> getAlarmServices();
	
	/**
	 * 根据告警对象代码得到alarm_service记录
	 * @return
	 */
	public AlarmService getAlarmServiceByServiceCode(String service_code);
	
	/**
	 * 根据service_code得到alarm_service_list的记录，按sort_id排序
	 * @param service_code
	 * @return
	 */
	public List<AlarmServiceKeys> getAlarmKeysByServiceCode( String service_code );
	
	
	/**
	 * 根据指示代码和指标名称查询出对应的alarm_service记录
	 * @param service_code 指示代码
	 * @param key_code 指标名称
	 * @return
	 */
	public AlarmServiceKeys getAlarmKeysByServiceCodeAndKeyCode(String service_code ,String key_code);
	
	/**
	 * 根据指标代码查询告警对象
	 * @param key_code 指标代码
	 * @return
	 */
	public String getServiceCodeByKeyCode(String key_code);
}
