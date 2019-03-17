package com.powersi.pcloud.web.service;

import java.util.List;
/**
 * 查询所有医院信息的远程操作类
 * 通过rpc调用查询pcloud_web工程中的医院所有的医院编码
 * @author huangyao
 *
 */
public interface BizYyInfoSearchService {
	/**
	 * 查询所有医院的医院编码
	 * @return 
	 */
	public List<String> searchAllYybm();
}
