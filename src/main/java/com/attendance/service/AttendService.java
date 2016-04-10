package com.attendance.service;

import java.util.ArrayList;

import com.attendance.model.Attend;
import com.attendance.model.AttendTemp;

public interface AttendService {
	
	public boolean setStudentAttend(Attend attend);
	
	public ArrayList<AttendTemp> countLessonAttend(int lesson_id);
	
	public ArrayList<Attend> getStudentAttend(int student_id,int lesson_id,int status_id);
	
	public boolean delStudentAttend(int attend_id);
	
	public Attend getStudentAttend(int attend_id);
	
	public boolean updateAttend(Attend attend);
	
}
