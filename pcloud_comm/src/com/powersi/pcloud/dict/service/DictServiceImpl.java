package com.powersi.pcloud.dict.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.powersi.comm.service.memory.MemoryDB;
import com.powersi.pcloud.dict.pojo.BasDictValues;

public class DictServiceImpl implements DictService{
	private static final String MAP_DICT_VALUELIST="MAP_DICT_VALUELIST";
	
	private MemoryDB memoryDB;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BasDictValues> getByKey(String dict_key) {
		List<BasDictValues> list=(List<BasDictValues>) getMemoryDB().getMapValue(MAP_DICT_VALUELIST, dict_key);
		return list;
	}

	@Override
	public String getValue(String dict_key, String dict_value_code) {
		return this.getValue(dict_key, dict_value_code, "");
	}
	
	@Override
	public String getValue(String dict_key, String dict_value_code, String defaultValue) {
		//拼接对应字典key的MapName
		String dictValueMapName = "MAP_DICT_VALUE_"+dict_key.toUpperCase();
		//获取缓存中对应的value值
		if( !getMemoryDB().existMapKey(dictValueMapName, dict_value_code) ){
			return defaultValue;
		}
		String dictValue=(String)getMemoryDB().getMapValue(dictValueMapName, dict_value_code);
		return dictValue;
	}
	
	@Override
	public float getValue_float(String dict_key, String dict_value_code, float defaultValue) {
		String dictValueStr = getValue(dict_key, dict_value_code);
		if( StringUtils.isEmpty(dictValueStr) ){
			return defaultValue;
		}
		//将字符串类型value转换为float类型
		float value_float=Float.parseFloat(dictValueStr);
		return value_float;
	}
	
	@Override
	public float getValue_float(String dict_key, String dict_value_code) {
		return this.getValue_float(dict_key, dict_value_code, (float)0.00);
	}
	
	@Override
	public int getValue_int(String dict_key, String dict_value_code, int defaultValue) {
		String dictValueStr = getValue(dict_key, dict_value_code);
		if( StringUtils.isEmpty(dictValueStr) ){
			return defaultValue;
		}
		
		//将字符串类型value转换为int类型
		int value_int = Integer.parseInt(dictValueStr);
		return value_int;
	}

	@Override
	public int getValue_int(String dict_key, String dict_value_code) {
		return this.getValue_int(dict_key, dict_value_code, 0);
	}
	
	public MemoryDB getMemoryDB() {
		return memoryDB;
	}
	public void setMemoryDB(MemoryDB memoryDB) {
		this.memoryDB = memoryDB;
	}
}
