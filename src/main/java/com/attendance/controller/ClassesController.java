package com.attendance.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.attendance.model.Classes;
import com.attendance.service.ClassesService;

@Controller
@RequestMapping(value="/classes")
public class ClassesController extends BaseController{

	@Autowired
	private ClassesService classesService;
	
	@RequestMapping(value="/list")
	public String list(int lessonid,ModelMap modelMap){
		List<Classes> classesGroup = classesService.getClassesGroupByLesson(lessonid);
		modelMap.put("classesGroup",classesGroup);
		modelMap.put("lessonid",lessonid);
		return "teacher/listLessonClass";
	}
	
	@RequestMapping(value="/addClass")
	public String addClass(){
		return "teacher/addClass";
	}
	
	@RequestMapping(value="/saveClass")
	public String saveClass(Classes classes) {
		classesService.insert(classes);
		return"teacher/listLessonClass";
	}
	
	@RequestMapping(value="/addLessonClass")
	public String addLessonClass(){
		return "teacher/addLessonClass";
	}
	
	@RequestMapping(value="/saveLessonClass")
	public String saveLessonClass(HttpServletRequest request) throws ServletRequestBindingException{
		int lesson_id= ServletRequestUtils.getIntParameter(request, "lessonid");
		int classes_id= ServletRequestUtils.getIntParameter(request, "classes_id");
		classesService.insertLessonClasses(classes_id, lesson_id);
		return"teacher/listLessonClass";
	}
	
	@RequestMapping(value="/delLessonClass")
	public String delLessonClass(HttpServletRequest request) throws ServletRequestBindingException{
		int classes_id= ServletRequestUtils.getIntParameter(request, "classesid");
		int lesson_id= ServletRequestUtils.getIntParameter(request, "lessonid");
		classesService.delLessonClasses(classes_id, lesson_id);
		return ("redirect:/classes/list?lessonid="+lesson_id+"");
	}
	
}