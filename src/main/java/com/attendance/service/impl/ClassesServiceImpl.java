package com.attendance.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.dao.ClassesMapper;
import com.attendance.model.Classes;
import com.attendance.service.ClassesService;

@Service("classesService")
public class ClassesServiceImpl implements ClassesService{
	
	@Autowired
	private ClassesMapper classesMapper;

	@Override
	public boolean insert(String classname, String teacherid, int studentnum) {
		return false;
	}

	@Override
	public boolean update(Classes classes) {
		return false;
	}

	@Override
	public boolean delete(int classesid) {
		return false;
	}

	@Override
	public Classes getClassesById(int classesid) {
		return null;
	}

	@Override
	public ArrayList<Classes> getClassesGroup(int schoolid) {
		return null;
	}

	@Override
	public ArrayList<Classes> getClassesGroupByLesson(int lessonid) {
		ArrayList<Classes> classesGroup = classesMapper.getClasses(lessonid);
		return classesGroup;
	}

	@Override
	public boolean insertLessonClasses(int classes_id, int lesson_id) {
		classesMapper.insertLessonClasses(classes_id, lesson_id);
		return false;
	}

}
