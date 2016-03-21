package com.attendance.service;

import java.util.ArrayList;

import com.attendance.model.Lesson;

public interface LessonService {
	
	public boolean add(Lesson lesson);
	
	public boolean del(int lessonid);
	
	public ArrayList<Lesson> getGroupByTeacher(int teacherId);
	
}
