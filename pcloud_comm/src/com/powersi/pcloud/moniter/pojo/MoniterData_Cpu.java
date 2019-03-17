package com.powersi.pcloud.moniter.pojo;

/**
 * Cpu使用率
 * @author 彭刚
 *
 */
public class MoniterData_Cpu extends MoniterData {

	private static final long serialVersionUID = 1L;
	/*private float cpu_user;//用户空间占用CPU百分比
	private float cpu_core;//内核空间占用CPU百分比
	private float cpu_change;//改变过优先级的进程占用CPU百分比
	private float cpu_free;//空闲CPU百分比
	private float cpu_wait;//等待输入输出的CPU时间百分比
*/	
	private float cpu_use;//cpu总使用率
	
	public MoniterData_Cpu(){
		super("CPU");
	}

	public float getCpu_use() {
		return cpu_use;
	}

	public void setCpu_use(float cpu_use) {
		this.cpu_use = cpu_use;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
