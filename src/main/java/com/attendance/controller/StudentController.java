package com.attendance.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.attendance.model.Student;
import com.attendance.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController extends BaseController{
	
	@Autowired
	private StudentService studentService;
		
	@RequestMapping("/list")
	public ModelAndView list(int classid,ModelMap modelMap){
		List<Student> classStudentGroup = studentService.getGroupByClass(classid);
		modelMap.put("classStudentGroup",classStudentGroup);
		return new ModelAndView("teacher/classstudent",modelMap);
	}
	
	@RequestMapping("/add")
	public ModelAndView add(){
		return new ModelAndView("teacher/addStudent");
	}
	
	@RequestMapping("/saveAdd")
	public ModelAndView saveAdd(Student student){
		studentService.insert(student);
		return new ModelAndView("redirect:/student/list?classid="+student.getClasses_id()+"");
	}
	
	@RequestMapping("del")
	public ModelAndView del(int studentid){
		Student student = studentService.get(studentid);
		studentService.delete(studentid);
		return new ModelAndView("redirect:/student/list?classid="+student.getClasses_id()+"");
	}
	
	@RequestMapping("/lesson/list")
	public ModelAndView lessonList(int lessonId,ModelMap modelMap) {
		List<Student> lessonStudentGroup = studentService.getGroupByLesson(lessonId);
		modelMap.put("lessonStudentGroup",lessonStudentGroup);
		return new ModelAndView("teacher/lessonStudent",modelMap);
	}
	
}
