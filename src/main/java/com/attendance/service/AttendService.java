package com.attendance.service;

import com.attendance.model.Attend;

public interface AttendService {
	
	public boolean setStudentAttend(Attend attend);
	
	public boolean countLessonAttend(int classid,int lesson);
	
}
