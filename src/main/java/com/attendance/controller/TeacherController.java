package com.attendance.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.attendance.model.Teacher;
import com.attendance.service.ClassesService;
import com.attendance.service.LessonService;
import com.attendance.service.TeacherService;
import com.attendance.util.MD5Utils;

@Controller
@RequestMapping("/teacher")
public class TeacherController extends BaseController{

	@Autowired
	private TeacherService teacherService;

	@Autowired
	private LessonService lessonService;

	@Autowired
	private ClassesService classesService;
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,ModelMap modelMap) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		password = MD5Utils.md5(password).toLowerCase();
		Teacher teacher = teacherService.loginTeacher(username, password);
		if (teacher != null) {
			modelMap.put("teacher", teacher);
			request.getSession().setAttribute("teacher", teacher);
			return new ModelAndView("/teacher/index",modelMap);
		} else {
			return new ModelAndView("loginFailure",modelMap);
		}
	}
	
	
	@RequestMapping("/register")
	public ModelAndView register(Teacher teacher,ModelMap modelMap){
		String password =MD5Utils.md5(teacher.getPassword()).toLowerCase();
		teacher.setPassword(password);
		teacherService.insert(teacher);
		modelMap.put("teacher", teacher);
		return new ModelAndView("registerSuccess",modelMap);
	}
	
}
