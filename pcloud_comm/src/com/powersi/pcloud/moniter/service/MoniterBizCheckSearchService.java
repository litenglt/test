package com.powersi.pcloud.moniter.service;

import java.util.Map;
import com.powersi.comm.mybatis.Page;

public interface MoniterBizCheckSearchService {
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
	public Map<String,Object> searchBizCheckMoniter(String norm_name, String startTime, String endTime, String keywords, String server_uuid, Page page);
}
