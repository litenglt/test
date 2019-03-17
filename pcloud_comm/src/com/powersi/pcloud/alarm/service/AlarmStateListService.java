package com.powersi.pcloud.alarm.service;

import java.util.List;

import com.powersi.pcloud.alarm.pojo.AlarmStateList;

/**
 * @Description 告警状态comm service接口
 * @author "lingang"
 * @time 2016年5月12日下午5:15:58
 *
 */

public interface AlarmStateListService {
	
	/**
	 * 查询所有的告警服务器
	 * @return
	 * List<AlarmStateList>
	 */
	public List<AlarmStateList> findAllServer();
	
	/**
	 * 根据uuid集合  查询对应的告警服务器
	 * uuids  服务器assist_uuid 拼接
	 * @return
	 * List<AlarmStateList>
	 */
	public List<AlarmStateList> findAllServerUUIDs(String uuids);
}
