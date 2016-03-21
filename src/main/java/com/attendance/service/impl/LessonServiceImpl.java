package com.attendance.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.dao.LessonMapper;
import com.attendance.model.Lesson;
import com.attendance.service.LessonService;

@Service("lessonService")
public class LessonServiceImpl implements LessonService{

	@Autowired
	private LessonMapper lessonMapper;
	
	@Override
	public boolean add(Lesson lesson) {
		lessonMapper.insert(lesson);
		return true;
	}

	@Override
	public boolean del(int lessonid) {
		return false;
	}

	@Override
	public ArrayList<Lesson> getGroupByTeacher(int teacherId) {
		ArrayList<Lesson> lessonGroup = lessonMapper.getAllLesson(teacherId);
		return lessonGroup;
	}

}
