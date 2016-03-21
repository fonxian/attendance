package com.attendance.service;

import com.attendance.model.Teacher;


public interface TeacherService {
		
	public boolean insert(Teacher teacher);
	
	public boolean delete(int id);
	
	public boolean update(Teacher teacher);
	
	public Teacher getTeacherById(int id);
	
	public Teacher loginTeacher(String username,String password);
	
	
}
