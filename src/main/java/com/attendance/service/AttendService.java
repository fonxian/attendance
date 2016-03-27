package com.attendance.service;

import java.util.ArrayList;

import com.attendance.model.Attend;
import com.attendance.model.AttendTemp;

public interface AttendService {
	
	public boolean setStudentAttend(Attend attend);
	
	//public boolean countLessonAttend(int classid,int lesson);
	
	public ArrayList<AttendTemp> countLessonAttend(int lesson_id);
	
}
