package com.attendance.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
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
	
	@RequestMapping("addLessonClass")
	public ModelAndView addLessonClass(){
		return new ModelAndView("teacher/addLessonClass");
	}
	
	@RequestMapping("saveLessonClass")
	ModelAndView saveLessonClass(HttpServletRequest request) throws ServletRequestBindingException{
		int lesson_id= ServletRequestUtils.getIntParameter(request, "lessonid");
		int classes_id= ServletRequestUtils.getIntParameter(request, "classes_id");
		classesService.insertLessonClasses(classes_id, lesson_id);
		return new ModelAndView("teacher/listClasses");
	}
	
}
