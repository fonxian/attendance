package com.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.attendance.model.Classes;
import com.attendance.service.ClassesService;

@Controller
@RequestMapping("/classes")
public class ClassesController extends BaseController{

	@Autowired
	private ClassesService classesService;
	
	@RequestMapping("/list")
	public ModelAndView list(int lessonid,ModelMap modelMap){
		List<Classes> classesGroup = classesService.getClassesGroupByLesson(lessonid);
		modelMap.put("classesGroup",classesGroup);
		return new ModelAndView("teacher/listClasses",modelMap);
	}
	
	
}
