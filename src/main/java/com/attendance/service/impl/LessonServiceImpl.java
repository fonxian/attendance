package com.attendance.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.dao.LessonMapper;
import com.attendance.model.Lesson;
import com.attendance.service.LessonService;
import com.attendance.service.base.BaseCache;

/**
 * 课程管理业务层实现类
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：<br/>
 */
@Service("lessonService")
public class LessonServiceImpl extends BaseServiceImpl implements LessonService{

	@Autowired
	private LessonMapper lessonMapper;
	
	@Override
	public boolean add(Lesson lesson) {
		addLesson(lesson);
		lessonMapper.insert(lesson);
		return true;
	}

	@Override
	public boolean del(int lessonid) {
		removeLesson(lessonid);
		lessonMapper.deleteByPrimaryKey(lessonid);
		return true;
	}

	@Override
	public ArrayList<Lesson> getGroupByTeacher(int teacherId) {
		ArrayList<Lesson> lessonGroup =BaseCache.getInstance().getLessonGroup(teacherId);
		return lessonGroup;
	}

	@Override
	public ArrayList<Lesson> getGroup() {
		ArrayList<Lesson> lessonGroup = lessonMapper.getLessonGroup();
		return lessonGroup;
	}

}
