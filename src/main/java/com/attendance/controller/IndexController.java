package com.attendance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 首页跳转控制层实现类
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：<br/>
 */
@Controller
public class IndexController extends BaseController{

	@RequestMapping(value="/index")
	public String index(){
		return "login";
	}
	
	@RequestMapping(value="/register")
	public String register(){
		return "register";
	}
	
}
