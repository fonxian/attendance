package com.attendance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
