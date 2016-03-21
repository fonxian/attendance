package com.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.attendance.model.Lesson;
import com.attendance.service.LessonService;

@Controller
@RequestMapping("/lesson")
public class LessonController extends BaseController{
	
	@Autowired
	private LessonService lessonService;
		
	@RequestMapping("/add")
	public ModelAndView add(){
		return new ModelAndView("addLesson");
	}
	
	@RequestMapping("/saveAdd")
	public ModelAndView saveAdd(Lesson lesson){
		lessonService.add(lesson);
		return new ModelAndView("redirect:/teacher/lessonlist");
	}
	
	@RequestMapping("/list")
	public ModelAndView list(int teacherId,ModelMap modelMap){
		List<Lesson> lessonGroup = lessonService.getGroupByTeacher(teacherId);
		modelMap.put("lessonGroup", lessonGroup);
		return new ModelAndView("teacher/listLesson",modelMap);
	}
	
}
