package com.attendance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 工具管理控制层实现类
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：<br/>
 */
@Controller
@RequestMapping(value="/tool")
public class ToolController {
	
	@RequestMapping(value="/help")
	public  String index() {
			return "teacher/help";
	}
	@RequestMapping(value="/setting")
	public  String setting() {
			return "teacher/setting";
	}
	
}
