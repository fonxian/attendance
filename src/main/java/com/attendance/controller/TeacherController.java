package com.attendance.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.attendance.model.Teacher;
import com.attendance.service.TeacherService;
import com.attendance.service.exception.TeacherErrorException;
import com.attendance.util.MD5Utils;
/**
 * 教师管理控制层实现类
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：<br/>
 */
@Controller
@RequestMapping(value="/teacher")
public class TeacherController extends BaseController{

	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping(value="/index")
	public  String index() {
			return "teacher/index";
	}
	
	@RequestMapping(value="/react")
	public String react(){
		return "/react/test";
	}
	
	@RequestMapping(value="/test")
	public String test(){
		return "/registersuccess";
	}
	
	@RequestMapping(value="/login")
	public  String login(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap) throws TeacherErrorException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		password = MD5Utils.md5(password).toLowerCase();
		Teacher teacher = teacherService.loginTeacher(username, password);
		if (teacher != null) {
			modelMap.put("name", teacher.getRealname());
			request.getSession().setAttribute("teacher", teacher);
			return "teacher/index";
		} else {
			return "loginFailure";
		}	
	}
	
	@RequestMapping(value="/logout")
	public  String logout(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap) throws TeacherErrorException {
		request.getSession().invalidate();
		return "redirect:/index";
	}
	
	@RequestMapping(value="/register")
	public String register(Teacher teacher,HttpServletRequest request,HttpServletResponse response,ModelMap modelMap){
		String password =MD5Utils.md5(teacher.getPassword()).toLowerCase();
		teacher.setPassword(password);
		teacherService.insert(teacher);
		request.getSession().invalidate();
		return "registerSuccess";
	}
	
	@RequestMapping(value="/update")
	public String update(){
		return "/teacher/myinfo";
	}
	
	@RequestMapping(value="/saveUpdate")
	public String saveUpdate(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap) throws ServletRequestBindingException {
		Teacher teacher = (Teacher)request.getSession().getAttribute("teacher");
		int school_id= ServletRequestUtils.getIntParameter(request, "school_id");
		String realname= ServletRequestUtils.getStringParameter(request, "realname");
		String password= ServletRequestUtils.getStringParameter(request, "password");
		String tel= ServletRequestUtils.getStringParameter(request, "tel");
		if(password.length()>0&&!password.trim().equals("")){
			password = MD5Utils.md5(password).toLowerCase();
			teacher.setPassword(password);
		}
		teacher.setRealname(realname);
		teacher.setSchool_id(school_id);
		teacher.setTel(tel);
		teacherService.update(teacher);
		return "/teacher/myinfo";
	}
	
}