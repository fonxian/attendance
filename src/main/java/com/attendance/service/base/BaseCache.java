package com.attendance.service.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.attendance.model.Classes;
import com.attendance.model.Lesson;
import com.attendance.model.Student;
import com.attendance.model.Teacher;

/**
 * 缓存类
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：2016-04-29<br/>
 */
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
	public void initCache(Integer teacherId, Teacher teacher,ArrayList<Lesson> lessonGroup) {
		if (!teacherCache.containsKey(teacherId)) {
			teacherCache.put(teacherId, teacher);
			lessonCache.put(teacherId, lessonGroup);
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
	 * 获取Teacher
	 */
	public Teacher getTeacher(Integer teacherId){
		if(teacherCache.containsKey(teacherId)){
			return teacherCache.get(teacherId);
		}
		return null;
	}
	
	/**
	 * 获取Teacher所教的课程列表
	 */
	public ArrayList<Lesson> getLessonGroup(Integer teacherId){
		if(lessonCache.containsKey(teacherId)){
			return lessonCache.get(teacherId);
		}
		return null;
	}
	
	/**
	 * 移除Lesson
	 */
	public boolean removeLesson(Integer teacherId,Integer lessonId){
		if(lessonCache.containsKey(teacherId)){
			ArrayList<Lesson> lessonGroup = lessonCache.get(teacherId);
			Lesson removeLesson = null; 
			for(Lesson lesson:lessonGroup){
				if(lesson.getId()==lessonId)
					removeLesson = lesson;
			}
			if(removeLesson != null){
				lessonGroup.remove(removeLesson);
			}
			return true;
		}
		return false;
	}
	
	/**
	 * 添加Lesson
	 */
	public boolean addLesson(Integer teacherId,Lesson lesson){
		if(lessonCache.containsKey(teacherId)){
			lessonCache.get(teacherId).add(lesson);
			ArrayList<Lesson> lessonGroup = lessonCache.get(teacherId);
			System.out.println("---------");
			for(Lesson lesson1:lessonGroup){
				
				System.out.println(lesson1.getName());
			}
			return true;
		}
		return false;
	}
	
	/**
	 * 移除所有缓存
	 */
	public void remove(Integer teacherId){

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
