package com.attendance.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.dao.AttendMapper;
import com.attendance.model.Attend;
import com.attendance.service.AttendService;

@Service("attendService")
public class AttendServiceImpl implements AttendService{

	@Autowired
	private AttendMapper attendMapper;
	
	@Override
	public boolean setStudentAttend(Attend attend) {
		attend.setDate(new Date());
		attendMapper.insert(attend);
		return false;
	}

	@Override
	public boolean countLessonAttend(int classid, int lesson) {
		return false;
	}

}
