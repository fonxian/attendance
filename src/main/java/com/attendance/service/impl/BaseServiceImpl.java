package com.attendance.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.attendance.dao.ClassesMapper;
import com.attendance.dao.LessonMapper;
import com.attendance.dao.StudentMapper;
import com.attendance.dao.TeacherMapper;
import com.attendance.model.Lesson;
import com.attendance.model.Teacher;
import com.attendance.service.base.BaseCache;
import com.attendance.service.base.ErrorCode;
import com.attendance.service.exception.TeacherErrorException;
/**
 * 基础业务层抽象类
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：2016-04-29<br/>
 */
public abstract class BaseServiceImpl {

	private static int teacherid;
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

	protected int getTeacherId() {
		return teacherid;
	}

	public void setTeacherId(int teacherid) {
		this.teacherid = teacherid;
	}

	/**
	 * 初始化缓存
	 */
	protected void initCache() throws TeacherErrorException {
		if (!BaseCache.getInstance().checkCache(getTeacherId())) {
			Teacher teacher = teacherMapper.selectByPrimaryKey(getTeacherId());
			ArrayList<Lesson> lessonGroup = lessonMapper
					.getAllLesson(getTeacherId());
			if (teacher != null && teacher.getId() != 0l) {
				BaseCache.getInstance().initCache(getTeacherId(), teacher,
						lessonGroup);
			} else {
				throw new TeacherErrorException(ErrorCode.DATA_LOAD_ERR,"data loading error");
			}
		}
	}

	/**
	 * 删除课程
	 */
	protected void removeLesson(int lessonId) {
		int teacherid = getTeacherId();
		System.out.println(teacherid);
		System.out.println(getTeacherId());
		if (BaseCache.getInstance().checkCache(getTeacherId())) {
			BaseCache.getInstance().removeLesson(getTeacherId(), lessonId);
		}
	}
	
	/**
	 * 添加课程
	 */
	protected void addLesson(Lesson lesson) {
		if (!BaseCache.getInstance().checkCache(getTeacherId())) {
			BaseCache.getInstance().addLesson(getTeacherId(), lesson);
		}
	}

}
