package com.powersi.pcloud.msg.service;

import java.util.Map;

import com.powersi.pcloud.msg.pojo.BasMsg;

/**
 * 消息接收处理接口
 * 所有消息的处理者需要实现本接口，并在pcloud_web的消息接收机制中登记
 * @author 李志钢
 *
 */
public interface MsgHandler {
	/**
	 * 接收并处理消息
	 * @param request		本Map会在所有的接收器之前传递，用于接收器之间传递参数
	 * @param msg			消息本身
	 */
	public void onGetMsg( Map request, BasMsg msg );
}
