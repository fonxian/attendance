package com.attendance.service.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.attendance.model.Classes;
import com.attendance.model.Lesson;
import com.attendance.model.Student;
import com.attendance.model.Teacher;

public class BaseCache {

	private static BaseCache instance;

	private BaseCache() {
	}

	public static BaseCache getInstance() {
		if (instance == null) {
			instance = new BaseCache();
		}
		return instance;
	}

	/** ========================Teacher的缓存=============================== **/
	protected Map<Integer, Teacher> teacherCache = new HashMap<Integer, Teacher>();

	/** =============根据教师ID设置的所教课程lesson的缓存==================== **/
	protected Map<Integer, ArrayList<Lesson>> lessonCache = new HashMap<Integer, ArrayList<Lesson>>();
	
	/** =============根据课程ID设置的所上班级classes的缓存==================== **/
	protected Map<Integer, ArrayList<Classes>> classesCache = new HashMap<Integer, ArrayList<Classes>>();

	/** =============根据教师ID、课程ID设置的所上课程的学生的缓存========================= **/
	protected Map<Integer, Map<Integer,ArrayList<Student>>> studentCache = new HashMap<Integer, Map<Integer,ArrayList<Student>>>();

	/**
	 * 初始化缓存
	 */
	public void initCache(Integer teacherId, Teacher teacher,ArrayList<Lesson> lessonGroup,ArrayList<Student> studentGroup) {
		if (!teacherCache.containsKey(teacherId)) {
			teacherCache.put(teacherId, teacher);
			lessonCache.put(teacherId, lessonGroup);
			initLessonMap(teacherId);
			initStudentMap(teacherId);
		}
	}

	/**
	 * 验证缓存是否存在
	 */
	public boolean checkCache(Integer teacherId) {
		if (teacherCache.containsKey(teacherId)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 移除所有缓存
	 */
	public void remove(Integer teacherId){
		teacherCache.remove(teacherId);
		studentCache.remove(teacherId);
		lessonCache.remove(teacherId);
	}

	/** ===============初始化课程、学生缓存========================================= **/
	/**
	 * 初始化课程缓存,key为部门parentId，传递parentID可获取该部门的下级部门
	 */
	private void initLessonMap(Integer teacherId) {
		if (teacherCache.containsKey(teacherId)&& !lessonCache.containsKey(teacherId)) {
			ArrayList<Lesson> lessonGroup = new ArrayList<Lesson>();
			lessonCache.put(teacherId, lessonGroup);
		}
	}

	/**
	 * 初始化学生缓存,key为部门parentId，传递parentID可获取该部门的下级部门
	 */
	private void initStudentMap(Integer teacherId) {
		if (teacherCache.containsKey(teacherId)&& !studentCache.containsKey(teacherId)) {
			
		}
	}
}
