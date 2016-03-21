package com.attendance.dao;

import com.attendance.model.Teacher;

public interface TeacherMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);
    
    Teacher selectByUserName(String username);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
}