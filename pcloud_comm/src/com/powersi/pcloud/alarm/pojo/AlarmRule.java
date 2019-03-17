package com.powersi.pcloud.alarm.pojo;

import java.util.ArrayList;
import java.util.List;

import com.powersi.comm.bean.BaseBean;
import com.powersi.comm.utils.ToolUtil;

/**
 * 报警规则
 * @author 李志钢
 *
 */
public class AlarmRule extends BaseBean {
	private static final long serialVersionUID = 1L;
	private long id;//'规则id',
	private String rule_type;//            char(10 not null comment '规则类型 1全局规则，所有服务适用     2指定机器规则，assist_uuid对应机器适用',
	private String service_code;//        varchar(32) not null comment '监控的服务名称：MYSQL,REDIS,TOMCAT为OS表示监控操作系统',
	private String value_key;//            varchar(32) not null comment '监控的指标，根据服务不同而不同，例如：MYSQL包括：IOPS, CONNECTION等',
	private String assist_uuid;//          varchar(64) comment '服务器uuid，rule_type=2时生效，为空用于全局规则',
	private String check_type;//           varchar(32) not null comment '检查方式，对应字典表ALARM_CHECK_TYPE，包括：离线检查，阀值检查',
	private String check_param;//          varchar(1024) comment '规则参数对象json字符串，对应RuleCheckParam对象',
	private int recover_time;//         int comment '告警恢复时间，秒，即多少秒后没有新的告警就视同告警消除',
	private String valid_flag;//           char(1) not null comment '有效标志  0停用     1正常',
	private String user_ids;//           varchar(256) comment '接收告警的用户id列表逗号分割',
	private String[] userIds;//           接收告警的用户id用户数组,
	private String key_name;//           varchar(60) comment '指标名称 ',
	private String key_unit;//           varchar(30) comment '指标的单位，用于显示，例如：%',
	
	private AlarmRuleParam alarmRuleParam;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRule_type() {
		return rule_type;
	}
	public void setRule_type(String rule_type) {
		this.rule_type = rule_type;
	}
	
	public String getService_code() {
		return service_code;
	}
	public void setService_code(String service_code) {
		this.service_code = service_code;
	}
	/*public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}*/
	public String getValue_key() {
		return value_key;
	}
	public void setValue_key(String value_key) {
		this.value_key = value_key;
	}
	public String getAssist_uuid() {
		return assist_uuid;
	}
	public void setAssist_uuid(String assist_uuid) {
		this.assist_uuid = assist_uuid;
	}
	public String getCheck_type() {
		return check_type;
	}
	public void setCheck_type(String check_type) {
		this.check_type = check_type;
	}
	/**
	 * @return
	 
	public AlarmRuleParam getCheck_param() {
		return alarmRuleParam;
	}*/
	
	/**传入字符串转换成规则参数对象
	 * @param check_param
	 */
	public void setCheck_param(String check_param) {
		this.alarmRuleParam = ToolUtil.strJson2Obj(check_param, AlarmRuleParam.class);
	}
	
	/**获取规则参数对象转换的字符串
	 * @return
	 */
	public String getCheck_param() {
		return check_param;
	}
	
	/**传入规则参数实体类，转换成字符串
	 * @param alarmRuleParam
	 */
	public void setCheck_param(AlarmRuleParam alarmRuleParam) {
		this.check_param = alarmRuleParam.toJson();
	}
	
	public int getRecover_time() {
		return recover_time;
	}
	public void setRecover_time(int recover_time) {
		this.recover_time = recover_time;
	}
	public String getValid_flag() {
		return valid_flag;
	}
	public void setValid_flag(String valid_flag) {
		this.valid_flag = valid_flag;
	}
	public String getUser_ids() {
		return user_ids;
	}
	public void setUser_ids(String user_ids) {
		this.user_ids = user_ids;
	}
	public AlarmRuleParam getAlarmRuleParam() {
		return alarmRuleParam;
	}
	public void setAlarmRuleParam(AlarmRuleParam alarmRuleParam) {
		this.alarmRuleParam = alarmRuleParam;
	}
	public String getKey_name() {
		return key_name;
	}
	public String getKey_unit() {
		return key_unit;
	}
	public void setKey_name(String key_name) {
		this.key_name = key_name;
	}
	public void setKey_unit(String key_unit) {
		this.key_unit = key_unit;
	}
	public String[] getUserIds() {
		return userIds;
	}
	public void setUserIds(String[] userIds) {
		this.userIds = userIds;
	}
	
	
}
