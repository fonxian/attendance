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
@RequestMapping("/classes")
public class ClassesController extends BaseController{

	@Autowired
	private ClassesService classesService;
	
	@RequestMapping("/list")
	public String list(int lessonid,ModelMap modelMap){
		List<Classes> classesGroup = classesService.getClassesGroupByLesson(lessonid);
		modelMap.put("classesGroup",classesGroup);
		return "teacher/listClasses";
	}
	
	@RequestMapping("addLessonClass")
	public String addLessonClass(){
		return "teacher/addLessonClass";
	}
	
	@RequestMapping("saveLessonClass")
	public String saveLessonClass(HttpServletRequest request) throws ServletRequestBindingException{
		int lesson_id= ServletRequestUtils.getIntParameter(request, "lessonid");
		int classes_id= ServletRequestUtils.getIntParameter(request, "classes_id");
		classesService.insertLessonClasses(classes_id, lesson_id);
		return"teacher/listClasses";
	}
	
}
