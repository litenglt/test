package com.powersi.test.service.rpc;

import com.powersi.test.pojo.ParamPojo;
/**
 * 测试nginx的远程调用的实现类接口
 * @author dell-pc
 *
 */
public interface ReceptionDataService {
	public ParamPojo receptionData(ParamPojo pojo);
}
