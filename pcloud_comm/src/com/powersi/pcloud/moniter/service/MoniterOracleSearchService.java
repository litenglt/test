package com.powersi.pcloud.moniter.service;

import java.util.Map;

import com.powersi.comm.mybatis.Page;

public interface MoniterOracleSearchService {
	
	/**
	 * 获取oracle监控信息
	 * @param data_type
	 * @param startTime
	 * @param endTime
	 * @param keywords
	 * @param server_uuid
	 * @param page
	 * @return
	 */
	public Map<String,Object> searchOracleMoniter(String data_type, String startTime, String endTime,
			String keywords, String server_uuid,String min_val,String max_val, Page page);
}
