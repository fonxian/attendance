package com.attendance.controller;

import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.attendance.model.Student;
import com.attendance.service.StudentService;
/**
 * 学生管理控制层实现类
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：<br/>
 */
@Controller
@RequestMapping(value="/student")
public class StudentController extends BaseController{
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/add")
	public String add(){
		return new String("teacher/addStudent");
	}
	
	@RequestMapping(value="/list")
	public String list(int classid,ModelMap modelMap){
		List<Student> classStudentGroup = studentService.getGroupByClass(classid);
		for(Student student:classStudentGroup){
			System.out.println(student.getName());
		}
		modelMap.put("classesStudentGroup",classStudentGroup);
		return "teacher/listClassStudent";
	}
	
	@RequestMapping(value="/saveAdd")
	public String saveAdd(Student student){
		studentService.insert(student);
		return "redirect:/student/list?classid="+student.getClasses_id()+"";
	}
	
	@RequestMapping(value="/del")
	public String del(int studentid){
		Student student = studentService.get(studentid);
		studentService.delete(studentid);
		return ("redirect:/student/list?classid="+student.getClasses_id()+"");
	}
	
	@RequestMapping(value="/listLessonStudent")
	public String lessonList(int lessonId,ModelMap modelMap) {
		List<Student> lessonStudentGroup = studentService.getGroupByLesson(lessonId);
		modelMap.put("lessonStudentGroup",lessonStudentGroup);
		return "teacher/listLessonStudent";
	}
	
	@RequestMapping(value="/importStudent")
	public String importStudent(String path,ModelMap modelMap) {
		studentService.excelImport(path);
		return "redirect:/lesson/list";
	}
	
}
