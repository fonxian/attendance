package com.attendance.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.dao.StudentMapper;
import com.attendance.model.Student;
import com.attendance.service.StudentService;
import com.attendance.util.ExcelImport;

/**
 * 学生管理业务层实现类
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：<br/>
 */
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
	public boolean excelImport(String path) {
		List<Student> students = ExcelImport.getAllStudentByExcel(path);
		for(Student student:students){
			studentMapper.insert(student);
		}
		return false;
	}

}
