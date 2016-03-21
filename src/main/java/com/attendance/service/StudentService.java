package com.attendance.service;

import java.util.ArrayList;

import com.attendance.model.Student;

public interface StudentService {
		
	public boolean insert(Student student);
	
	public boolean delete(int id);
	
	public boolean update();
	
	public Student get(int id);
	
	public ArrayList<Student> getGroupByClass(int classid);
	
	public ArrayList<Student> getGroupByLesson(int lessonId); 
	
}
