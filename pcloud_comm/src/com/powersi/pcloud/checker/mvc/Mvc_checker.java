package com.powersi.pcloud.checker.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 重启tomcat成功，即返回“ok”
 * @author 彭刚
 *
 */
@Controller
public class Mvc_checker {
	@ResponseBody
	@RequestMapping("/check.shtml")
	public String checker(){
		return "ok";
	}
}
