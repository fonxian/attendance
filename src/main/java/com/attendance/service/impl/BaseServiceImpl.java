package com.attendance.service.impl;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.attendance.dao.ClassesMapper;
import com.attendance.dao.LessonMapper;
import com.attendance.dao.StudentMapper;
import com.attendance.dao.TeacherMapper;
import com.attendance.model.Lesson;
import com.attendance.model.Student;
import com.attendance.model.Teacher;
import com.attendance.service.base.BaseCache;
import com.attendance.service.base.ErrorCode;
import com.attendance.service.exception.TeacherErrorException;

public abstract class BaseServiceImpl {
	
	@Autowired
	private ClassesMapper classesMapper;
	@Autowired
	private LessonMapper lessonMapper;
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private TeacherMapper teacherMapper;
	
	/**
	 * 获取当前登录教师的Id
	 */
	protected int getTeacherId(){
		return 1000;
	}
	/**
	 * 初始化缓存
	 */
	protected void initCache() throws TeacherErrorException{
		if(!BaseCache.getInstance().checkCache(getTeacherId())) {
			Teacher teacher = teacherMapper.selectByPrimaryKey(getTeacherId());
			ArrayList<Lesson> lessonGroup =lessonMapper.getAllLesson(getTeacherId());
			ArrayList<Student> studentGroup = studentMapper.getStudentGroupByLesson(getTeacherId());
			if (teacher != null && teacher.getId() != 0l) {
				BaseCache.getInstance().initCache(getTeacherId(), teacher,lessonGroup,studentGroup);
			} else {
				throw new TeacherErrorException(ErrorCode.DATA_LOAD_ERR, "data loading error");
			}
		}
	}
	
}
