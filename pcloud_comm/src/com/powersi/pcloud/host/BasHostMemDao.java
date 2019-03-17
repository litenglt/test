package com.powersi.pcloud.host;

import java.util.Set;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.powersi.comm.service.memory.MemoryDB;

/**
 * 基于MemoryDB的BasHost的DAO
 * @author 李志钢
 *
 */
@Service
public class BasHostMemDao {
	@Autowired
	MemoryDB memoryDB;
	private static final String BAS_HOST = "BAS_HOST";// 服务器信息
	
	/**
	 * 根据UUID得到具体的Host对象
	 * @param uuid
	 * @return
	 */
	public BasHost getByUUID( String uuid ){
		if (StringUtils.isBlank(uuid)) {
			return null;
		}
		if (!memoryDB.existMapKey(BAS_HOST, uuid)) {
			return null;
		}
		return (BasHost) memoryDB.getMapValue(BAS_HOST, uuid);
	}
	
	/**
	 * 赋值BasHost
	 * @param basHost
	 */
	public void setBasHost( BasHost basHost ){
		memoryDB.setMapValue(BAS_HOST, basHost.getAssist_uuid(), basHost);
	}
	
	/**
	 * 得到所有服务器的UUID结果集
	 * @return
	 */
	public Set getAllHostUUIDS( ){
		return memoryDB.getMap(BAS_HOST).keySet();
	}
	
	/**
	 * 获取redis中的缓存map大小
	 * @return
	 */
	public int getBasHostMapSize() {
		return memoryDB.getMapSize(BAS_HOST);
	}
	
	/**
	 * 删除redis中的basHost缓存
	 */
	public void deleteBasHost() {
		memoryDB.delete(BAS_HOST);
	}
	
	/**
	 * 跟句uuid删除redis中的basHost中对应缓存
	 */
	public void deleteBasHostByUUid(String assist_uuid) {
		memoryDB.removeMapValue(BAS_HOST, assist_uuid);
	}
	
	/**
	 * 初始化redis中的basHost缓存
	 * @param basHostSaveMap 缓存map
	 */
	public void initBasHost(ConcurrentMap<String, Object> basHostSaveMap) {
		memoryDB.initMap(BAS_HOST, 0, basHostSaveMap);
	}
	
	
}
