package com.attendance.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.dao.LessonMapper;
import com.attendance.model.Lesson;
import com.attendance.service.LessonService;
import com.attendance.service.base.BaseCache;

@Service("lessonService")
public class LessonServiceImpl extends BaseServiceImpl implements LessonService{

	@Autowired
	private LessonMapper lessonMapper;
	
	@Override
	public boolean add(Lesson lesson) {
		lessonMapper.insert(lesson);
		return true;
	}

	@Override
	public boolean del(int lessonid) {
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
