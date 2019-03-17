package com.powersi.pcloud.alarm.service;

import java.util.List;

import com.powersi.pcloud.alarm.pojo.AlarmRule;

/**
 * 报警规则操作
 * @author 彭刚
 *
 */
public interface AlarmRuleService {
	/**
	 * 查询全部报警规则
	 * @return
	 */
	public List<AlarmRule> findAll();
	
	
	/**
	 * 根据id获取规则
	 * @param id
	 * @return
	 */
	public AlarmRule getByID( long id );
	
	/**
	 * 新增报警规则
	 * @param alarmRule
	 */
	public void insertAlarmRule(AlarmRule alarmRule);
	 
	/**
	 * 传入监控服务，查询相应规则
	 * @param service_code
	 * @return
	 */
	public List<AlarmRule> findByServiceCode(String service_code);
	
	/**
	 * 修改报警规则
	 * @param alarmRule
	 */
	public void updateAlarmRule(AlarmRule alarmRule);
	
	/**
	 * 定义报警规则为停用
	 * @param id
	 */
	public void updateValidFlag(String id);
	
	/**
	 * 传入id彻底删除报警规则
	 * @param id
	 * @return
	 */
	public int deleteAlarmRule(int id);
}
