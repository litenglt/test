package com.powersi.pcloud.moniter.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.powersi.pcloud.moniter.pojo.TestReport;
import com.powersi.pcloud.moniter.pojo.TestReportMx;

/**
 * 远程调用的测试报告service的接口
 * @author 黄尧
 *
 */
public interface TestReportService {
	
	/**
	 * 生成测试报告
	 * @param scene_id 场景id
	 * @param report_name 报告名称，场景名称+年月日+次数
	 * @return 返回测试报告id
	 */
	public long createTestReport(long scene_id, String report_name);
	
	/**
	 * 查询出测试报告信息(不分页)
	 * @param map 测试报告信息
	 * @return 
	 */
	public List<TestReport> findTestReport(TestReport testReport);
	
	/**
	 * 分页查询测试报告信息
	 * @param map 1.测试报告信息  2 page对象
	 * @return
	 */
	List<TestReport> findTestReport_page(Map<String, Object> map);
	
	/**
	 * 根据测试场景id查询测试报告
	 * @param scene_id 测试场景id
	 * @return
	 */
	public List<TestReport> findTestReportBySceneId(long scene_id);
	
	
	/**
	 * 修改测试报告信息
	 * @param testReport 测试报告实体
	 */
	public void updateTestReport(TestReport testReport);
	
	/**
	 * 根据报告id查询测试报告信息
	 * @param id 报告id
	 * @return
	 */
	public TestReport findTestReportById(long id);
	
	/**
	 * 根据id删除测试报告
	 * @param id 测试报告id
	 */
	public void delTestReport(long id);
	
	/**
	 * 统计报告数据
	 * be_save为true时
	 * 表示进行报告数据的统计,并且存储到数据库中
	 * be_save为false时
	 * 表示进行报告数据的监控,不存储到数据库中,制统计显示到页面
	 * @param report_id 报告id
	 * @param exec_time 测试执行的时间(Date)
	 * @param wait_sec  启动测试等待时间(单位:s)
	 * @param be_save   是否为保存,true则为统计保存数据,false则为监控数据
	 * @return
	 */
	Map<String, Object> countTestReport(long report_id, Date exec_time, int wait_sec,boolean be_save);
	
	/**
	 * 批量插入测试报告明细数据
	 * @param testReportMxList 测试报告明细List列表
	 */
	void insertTestReportMx(List<TestReportMx> testReportMxList);
	
	/**
	 * 根据测试报告id,查询出所有请求的明细
	 * @param report_id 测试报告id
	 * @return
	 */
	public List<TestReportMx> findTestReportExByReportId(long report_id);
}
