package com.powersi.pcloud.msg.pojo;

import java.util.Date;

import com.powersi.comm.bean.BaseBean;

/**
 * 系统通知消息
 * @author 李志钢
 *
 */
public class BasMsg extends BaseBean {
	private static final long serialVersionUID = 1L;

	private long id;
	private String msg_type; 		//消息类别
	private String msg_title;		//标题
	private String msg_content;		//内容
	private Date msg_time;			//产生时间
	private String msg_biz_param;	//消息携带的业务参数，每个类型不同，由消息产生者与接收者约定
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMsg_type() {
		return msg_type;
	}
	public void setMsg_type(String msg_type) {
		this.msg_type = msg_type;
	}
	public String getMsg_title() {
		return msg_title;
	}
	public void setMsg_title(String msg_title) {
		this.msg_title = msg_title;
	}
	public String getMsg_content() {
		return msg_content;
	}
	public void setMsg_content(String msg_content) {
		this.msg_content = msg_content;
	}
	public Date getMsg_time() {
		return msg_time;
	}
	public void setMsg_time(Date msg_time) {
		this.msg_time = msg_time;
	}
	public String getMsg_biz_param() {
		return msg_biz_param;
	}
	public void setMsg_biz_param(String msg_biz_param) {
		this.msg_biz_param = msg_biz_param;
	}
	
}
