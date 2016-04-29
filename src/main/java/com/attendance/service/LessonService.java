package com.attendance.service;

import java.util.ArrayList;

import com.attendance.model.Lesson;

/**
 * 课程管理业务层接口
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：<br/>
 */
public interface LessonService {
	
	public boolean add(Lesson lesson);
	
	public boolean del(int lessonid);
	
	public ArrayList<Lesson> getGroupByTeacher(int teacherId);
	
	public ArrayList<Lesson> getGroup();
	
}
