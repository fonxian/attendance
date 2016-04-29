package com.attendance.service;

import java.util.ArrayList;

import com.attendance.model.Student;

/**
 * 学生管理业务层接口
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：<br/>
 */
public interface StudentService {
		
	public boolean insert(Student student);
	
	public boolean delete(int id);
	
	public boolean update();
	
	public Student get(int id);
	
	public ArrayList<Student> getGroupByClass(int classid);
	
	public ArrayList<Student> getGroupByLesson(int lessonId); 
	
	public ArrayList<Student> getAllStudentGroup();
	
	public boolean excelImport(String path);
	
	
}
