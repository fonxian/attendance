package com.attendance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.dao.TeacherMapper;
import com.attendance.model.Teacher;
import com.attendance.service.TeacherService;
import com.attendance.service.exception.TeacherErrorException;

@Service("teacherService")
public class TeacherServiceImpl extends BaseServiceImpl implements TeacherService{

	@Autowired
	private TeacherMapper teacherMapper;
	
	@Override
	public boolean insert(Teacher teacher) {
		teacherMapper.insert(teacher);
		return true;
	}

	@Override
	public boolean delete(int id) {
		teacherMapper.deleteByPrimaryKey(id);
		return true;
	}

	@Override
	public boolean update(Teacher teacher) {
		teacherMapper.updateByPrimaryKey(teacher);
		return true;
	}

	@Override
	public Teacher getTeacherById(int id) {
		Teacher teacher = teacherMapper.selectByPrimaryKey(id);
		return teacher;
	}

	@Override
	public Teacher loginTeacher(String username, String password) throws TeacherErrorException {
		Teacher teacher = teacherMapper.selectByUserName(username);
		if(teacher!=null&&teacher.getPassword().equals(password)){
			setTeacherId(teacher.getId());
			initCache();
			return teacher;
		}
		return null;
	}

}
