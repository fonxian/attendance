package com.attendance.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.attendance.model.Lesson;
import com.attendance.model.Teacher;
import com.attendance.service.LessonService;

@Controller
@RequestMapping(value="/lesson")
public class LessonController extends BaseController{
	
	@Autowired
	private LessonService lessonService;
		
	@RequestMapping(value="/add")
	public String add(){
		return "teacher/addLesson";
	}
	
	@RequestMapping(value="/saveAdd")
	public String saveAdd(Lesson lesson){
		lessonService.add(lesson);
		return "redirect:/lesson/list";
	}
	
	@RequestMapping(value="/del")
	public String delete(int lessonid){
		lessonService.del(lessonid);
		return "redirect:/lesson/list";
	}
	
	@RequestMapping(value="/attendList")
	public String attendList(HttpServletRequest request,ModelMap modelMap){
		Teacher teacher = (Teacher)request.getSession().getAttribute("teacher");
		List<Lesson> lessonGroup = lessonService.getGroupByTeacher(teacher.getId());
		modelMap.put("lessonGroup", lessonGroup);
		return "teacher/listAttendLesson";
	}
	
	@RequestMapping(value="/list")
	public String list(HttpServletRequest request,ModelMap modelMap){
		Teacher teacher = (Teacher)request.getSession().getAttribute("teacher");
		List<Lesson> lessonGroup = lessonService.getGroupByTeacher(teacher.getId());
		for(Lesson lesson:lessonGroup){
			System.out.println(lesson.getName());
		}
		modelMap.put("lessonGroup", lessonGroup);
		return "teacher/manageLesson";
	}
	
}
