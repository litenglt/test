package com.powersi.pcloud.moniter.pojo;

/**
 * 数据传输实体对象
 * @author "lingang"
 * @time 2017年6月30日上午11:52:16
 *
 */
public class MoniterData_Trans extends MoniterData{
	
	public MoniterData_Trans() {
		super("TRANS");
	}
	private static final long serialVersionUID = 1L;
	private String trans_type;//详细传输类型
	private String trans_errInfo;//传输错误信息
	
	public String getTrans_type() {
		return trans_type;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	public String getTrans_errInfo() {
		return trans_errInfo;
	}
	public void setTrans_errInfo(String trans_errInfo) {
		this.trans_errInfo = trans_errInfo;
	}
}
