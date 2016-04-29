package com.attendance.service;

import com.attendance.model.Teacher;
import com.attendance.service.exception.TeacherErrorException;

/**
 * 老师管理业务层接口
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：<br/>
 */
public interface TeacherService {
		
	public boolean insert(Teacher teacher);
	
	public boolean delete(int id);
	
	public boolean update(Teacher teacher);
	
	public Teacher getTeacherById(int id);
	
	public Teacher loginTeacher(String username,String password) throws TeacherErrorException;
	
	
}
