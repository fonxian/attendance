package com.attendance.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.dao.StudentMapper;
import com.attendance.model.Student;
import com.attendance.service.StudentService;
import com.attendance.util.SpeakUtil;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public boolean insert(Student student) {
		studentMapper.insert(student);
		return true;
	}

	@Override
	public boolean delete(int id) {
		studentMapper.deleteByPrimaryKey(id);
		return true;
	}

	@Override
	public boolean update() {
		return false;
	}

	@Override
	public Student get(int id) {
		Student student = studentMapper.selectByPrimaryKey(id);
		return student;
	}

	@Override
	public ArrayList<Student> getGroupByClass(int classid) {
		ArrayList<Student> studentGroup = studentMapper.getAllStudentByClassId(classid);
		return studentGroup;
	}

	@Override
	public ArrayList<Student> getGroupByLesson(int lessonId) {
		ArrayList<Student> studentGroupLesson = studentMapper.getStudentGroupByLesson(lessonId);
		return studentGroupLesson;
	}

	@Override
	public ArrayList<Student> getAllStudentGroup() {
		ArrayList<Student> studentGroup = studentMapper.getAllStudent();
		return studentGroup;
	}

	@Override
	public void readAllStudent(List<Student> studentGroup) {
		for(Student student:studentGroup)
			SpeakUtil.attend(student.getName());
	}

}
