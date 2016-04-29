package com.attendance.service;

import java.util.ArrayList;

import com.attendance.model.Classes;

/**
 * 班级管理业务层接口
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：<br/>
 */
public interface ClassesService {
	
	public boolean insert(Classes classes);
	
	public boolean update(Classes classes);
	
	public boolean delete(int classesid);
	
	public Classes getClassesById(int classesid);
	
	public ArrayList<Classes> getClassesGroup(int schoolid);
	
	public ArrayList<Classes> getClassesGroupByLesson(int lessonid);
	
	public boolean insertLessonClasses(int classes_id,int lesson_id);
	
	public boolean delLessonClasses(int classes_id,int lesson_id);
	
	
}
