package com.powersi.biz.snmanager.service.rpc;

import java.util.List;
import java.util.Map;

/**
 * 增加适应岳阳的设备串号远程调用接口
 * @author ly
 * @date 2017-11-28
 */
public interface SNManagerRpcService {

	/**
	 * 导入设备串号对象
	 * @param list
	 * @return Map
	 */
	public Map importSNManager(List<Map> list);
	
}
