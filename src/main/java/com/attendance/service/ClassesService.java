package com.attendance.service;

import java.util.ArrayList;

import com.attendance.model.Classes;

public interface ClassesService {
	
	public boolean insert(String classname,String teacherid,int studentnum);
	
	public boolean update(Classes classes);
	
	public boolean delete(int classesid);
	
	public Classes getClassesById(int classesid);
	
	public ArrayList<Classes> getClassesGroup(int schoolid);
	
	public ArrayList<Classes> getClassesGroupByLesson(int lessonid);
	
	public boolean insertLessonClasses(int classes_id,int lesson_id);
	
	public boolean delLessonClasses(int classes_id,int lesson_id);
	
}
