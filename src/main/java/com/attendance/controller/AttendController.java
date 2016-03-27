package com.attendance.controller;



import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.attendance.model.Attend;
import com.attendance.model.AttendTemp;
import com.attendance.service.AttendService;
import com.attendance.service.StudentService;
import com.attendance.util.Result;
import com.attendance.util.SpeakUtil;

@Controller
@RequestMapping("/attend")
public class AttendController extends BaseController{

	@Autowired
	private AttendService attendService;
	@Autowired
	private StudentService studentService;
		
	
	@RequestMapping("/index")
	public ModelAndView index(){
		return new ModelAndView("redirect:/lesson/attendList");
	}
	
	@RequestMapping(value="/read", produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String read(HttpServletRequest request)throws ServletRequestBindingException{
		Result result = new Result();
		String name= ServletRequestUtils.getStringParameter(request, "name");
		SpeakUtil.attend(name);
		result.setSuccess(true);
		return result.toString();
	}
	
	@RequestMapping(value="/add", produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String add(HttpServletRequest request) throws ServletRequestBindingException{
		
		Result result = new Result();
		Attend attend = new Attend();
		
		int lesson_id = ServletRequestUtils.getIntParameter(request, "lesson_id");
		int student_id= ServletRequestUtils.getIntParameter(request, "student_id");
		int teacher_id= ServletRequestUtils.getIntParameter(request, "teacher_id");
		int classes_id= ServletRequestUtils.getIntParameter(request, "classes_id");
		int status_id= ServletRequestUtils.getIntParameter(request, "status_id");
		String reason= ServletRequestUtils.getStringParameter(request, "reason");
		
		attend.setClasses_id(classes_id);
		attend.setLesson_id(lesson_id);
		attend.setReason(reason);
		attend.setStatus_id(status_id);
		attend.setStudent_id(student_id);
		attend.setTeacher_id(teacher_id);
		
		attendService.setStudentAttend(attend);
		
		result.setSuccess(true);
		return result.toString();
	}
	
	@RequestMapping("/listLessonAttend")
	public ModelAndView lessonAttendList(ModelMap modelMap) {
		int lessonId = 1;
		ArrayList<AttendTemp> attendTempGroup= attendService.countLessonAttend(lessonId);
		modelMap.put("attendTempGroup",attendTempGroup);
		return new ModelAndView("teacher/listLessonAttend",modelMap);
	}
	
}
