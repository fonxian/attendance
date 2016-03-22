package com.attendance.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.attendance.model.Attend;
import com.attendance.service.AttendService;

@Controller
@RequestMapping("/attend")
public class AttendController extends BaseController{

	@Autowired
	private AttendService attendService;
	
	@RequestMapping("/index")
	public ModelAndView index(){
		return new ModelAndView("redirect:/lesson/attendList");
	}
	
	@RequestMapping("/add")
	public ModelAndView add(Attend attend,ModelMap modelMap){
		attendService.setStudentAttend(attend);
		return new ModelAndView("redirect:/student/lesson/listclassid="+attend.getClasses_id()+"");
	}
	
}
