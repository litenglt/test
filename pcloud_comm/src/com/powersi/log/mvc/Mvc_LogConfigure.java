package com.powersi.log.mvc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.formula.ThreeDEval;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.powersi.asyn.service.AsynService;
import com.powersi.comm.ajax.AjaxRetBean;

@Controller
@RequestMapping("/logConfig/")
public class Mvc_LogConfigure{
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	@Qualifier("asynService")
	AsynService asynService;
	@Autowired
	private Properties configs;
	
	/**
	 * 初始化刷新log4j的配置到程序中
	 */
	@PostConstruct
	public void init(){
		RefreshConfigure();
		//为不影响程序的加载，采用异步的方式延迟之后再刷新
		asynService.addWork(this, "delayRefresh");	
	}
	
	/**
	 * 为避免被覆盖，延迟之后再度刷新
	 */
	public void delayRefresh(){
		try {
			Thread.sleep(120000);
		} catch (InterruptedException e) { }
		
		RefreshConfigure();
	}
	
	/**
	 * 动态加载log4j的配置文件
	 */
	public void RefreshConfigure(){
		String logFile = getPlatform();
		//判断配置文件地址是否为空，为空则结束当前方法
		//检查文件是否存在，不存在则结束方法
		if(logFile.equals("")||logFile==null){
			return;
		}else{
			File file=new File(logFile);
			if (!file.exists()) {
				return;
			}
		}
		PropertyConfigurator.configure(logFile);
	}
	
	/**
	 * 得到当前操作系统类型
	 * 根据操作系统返回相对应的配置
	 * @return "WINDOWS" "LINUX" "MAC"
	 */
	public String getPlatform() {
		Properties prop = null;
		prop = configs;
		String projectName = prop.getProperty("project.name");
		
		String log4jFile=""; 
		Properties props = System.getProperties(); // 获得系统属性集
		String os = props.getProperty("os.name"); // 操作系统名称
		// 判断系统
		if (os.startsWith("windows") || os.startsWith("Windows")) {
			log4jFile="";
		} else if (os.startsWith("linux") || os.startsWith("Linux")) {
			log4jFile="/app/project/"+projectName+"/log4j.properties";
		} else if (os.startsWith("Mac") || os.startsWith("mac")) {
			log4jFile="";
		}
		return log4jFile;
	}
	
	/**
	 * 检查文件路径
	 * @param logFile
	 * @return
	 */
	public boolean checkFile(String logFile){
		if(logFile.equals("")||logFile==null){
			return false;
		}else{
			File file=new File(logFile);
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					logger.error("配置文件创建失败"+e.getMessage());
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * 读取log4j.properties配置文件，并返回到页面
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("readLog.shtml")
	@ResponseBody
	public String readLogConfigure(){
		StringBuilder result = new StringBuilder();
		AjaxRetBean retBean = new AjaxRetBean();
		BufferedReader br = null;
		
		//判断配置文件地址是否为空，为空则结束当前方法
		//检查文件是否存在，不存在则结束方法
		String logFile = getPlatform();
		if(!checkFile(logFile)){
			return "";
		}
		
		//读取log4j配置文件
        try{
            br = new BufferedReader(new FileReader(logFile));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }  
        }catch(Exception e){
        	logger.error("读取log4j文件失败:"+e.getMessage());
        	
        }finally{
			//关闭流
        	try {
				br.close();
			} catch (IOException e) {}
		}
       
        return result.toString();
	}
	
	/**
	 * 将修改后的配置，写入log4j.properties配置文件
	 * @return
	 */
	@RequestMapping("writeLog.shtml")
	@ResponseBody
	public String writeLogConfigure(String fileConfig){
		PrintWriter pw = null;
		String result="";
		
		//判断配置文件地址是否为空，为空则结束当前方法
		//检查文件是否存在，不存在则结束方法
		String logFile = getPlatform();
		if(!checkFile(logFile)){
			return "未指定文件路径或新建失败";
		}
		//写入log4j配置文件,并刷新配置
		try {
			pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(logFile)),true);
			pw.println(fileConfig);
			RefreshConfigure();
		} catch (FileNotFoundException e) {
			logger.error("log4j文件修改异常："+e.getMessage());
			result="失败";
			//throw new ApusException("文件处理异常",e);
		}finally{
			//关闭流
			pw.close();
		}
		result="成功";
		return result;
	}
	
	/**
	 * @return
	 
	@RequestMapping("LogConfig.shtml")
	public String logConfigure(){
		
		return null;
	}*/
	
	
}
