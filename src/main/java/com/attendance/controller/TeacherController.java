package com.attendance.controller;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.attendance.model.Teacher;
import com.attendance.service.TeacherService;
import com.attendance.util.MD5Utils;

@Controller
@RequestMapping("/teacher")
public class TeacherController extends BaseController{

	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		password = MD5Utils.md5(password).toLowerCase();
		Teacher teacher = teacherService.loginTeacher(username, password);
		if (teacher != null) {
			modelMap.put("teacher", teacher);
			request.getSession().setAttribute("teacher", teacher);
//			Cookie idCookie = new Cookie("id",teacher.getId().toString());
//			Cookie usernameCookie = new Cookie("name",teacher.getUsername());
//			Cookie passwordCookie = new Cookie("password",teacher.getPassword());
//			Cookie realNameCookie = new Cookie("realname",teacher.getRealname());
//			response.addCookie(idCookie);
//			response.addCookie(usernameCookie);
//			response.addCookie(passwordCookie);
//			response.addCookie(realNameCookie);
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
	
	@RequestMapping("update")
	public ModelAndView get(Teacher teacher,ModelMap modelMap){
		teacherService.update(teacher);
		modelMap.put("teacher", teacher);
		return new ModelAndView("/teacher/myinfo");
	}
	
}
