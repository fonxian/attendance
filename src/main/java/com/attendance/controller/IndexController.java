package com.attendance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
