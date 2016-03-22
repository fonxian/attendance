package com.attendance.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.attendance.model.Lesson;
import com.attendance.model.Teacher;
import com.attendance.service.LessonService;

@Controller
@RequestMapping("/lesson")
public class LessonController extends BaseController{
	
	@Autowired
	private LessonService lessonService;
		
	@RequestMapping("/add")
	public ModelAndView add(){
		return new ModelAndView("teacher/addLesson");
	}
	
	@RequestMapping("/saveAdd")
	public ModelAndView saveAdd(Lesson lesson){
		lessonService.add(lesson);
		return new ModelAndView("redirect:/lesson/list");
	}
	
	@RequestMapping("/del")
	public ModelAndView delete(int lessonid){
		lessonService.del(lessonid);
		return new ModelAndView("redirect:/lesson/list");
	}
	
	@RequestMapping("attendList")
	public ModelAndView attendList(HttpServletRequest request,ModelMap modelMap){
		Teacher teacher = (Teacher)request.getSession().getAttribute("teacher");
		List<Lesson> lessonGroup = lessonService.getGroupByTeacher(teacher.getId());
		modelMap.put("lessonGroup", lessonGroup);
		return new ModelAndView("teacher/listAttendLesson");
	}
	
	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request,ModelMap modelMap){
		Teacher teacher = (Teacher)request.getSession().getAttribute("teacher");
		List<Lesson> lessonGroup = lessonService.getGroupByTeacher(teacher.getId());
		modelMap.put("lessonGroup", lessonGroup);
		return new ModelAndView("teacher/manageLesson",modelMap);
	}
	
}
