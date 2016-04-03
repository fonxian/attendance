package com.attendance.controller;

import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.attendance.model.Student;
import com.attendance.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController extends BaseController{
	
	@Autowired
	private StudentService studentService;
		
	@RequestMapping("/list")
	public String list(int classid,ModelMap modelMap){
		List<Student> classStudentGroup = studentService.getGroupByClass(classid);
		modelMap.put("classesStudentGroup",classStudentGroup);
		return "teacher/listClassStudent";
	}
	
	@RequestMapping("/add")
	public String add(){
		return new String("teacher/addStudent");
	}
	
	@RequestMapping("/saveAdd")
	public String saveAdd(Student student){
		studentService.insert(student);
		return "redirect:/student/list?classid="+student.getClasses_id()+"";
	}
	
	@RequestMapping("del")
	public String del(int studentid){
		Student student = studentService.get(studentid);
		studentService.delete(studentid);
		return ("redirect:/student/list?classid="+student.getClasses_id()+"");
	}
	
	@RequestMapping("/listLessonStudent")
	public String lessonList(int lessonId,ModelMap modelMap) {
		List<Student> lessonStudentGroup = studentService.getGroupByLesson(lessonId);
		modelMap.put("lessonStudentGroup",lessonStudentGroup);
		return "teacher/listLessonStudent";
	}
	
}
