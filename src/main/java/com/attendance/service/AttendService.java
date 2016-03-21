package com.attendance.service;

public interface AttendService {
	
	public boolean setStudentAttend(int lessonid,int studentid,int statusid,String reason);
	
	public boolean countLessonAttend(int classid,int lesson);
	
}
