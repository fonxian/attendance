package com.attendance.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;

import com.attendance.model.Teacher;

public interface TeacherMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer id);
    
    Teacher selectByUserName(String username);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
    @Select("select * from teacher")
    ArrayList<Teacher> getAllTeacher();
    
}