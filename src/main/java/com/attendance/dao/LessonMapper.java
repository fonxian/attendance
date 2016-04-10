package com.attendance.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.attendance.model.Lesson;

public interface LessonMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Lesson record);

    int insertSelective(Lesson record);

    Lesson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lesson record);

    int updateByPrimaryKey(Lesson record);
    
    ArrayList<Lesson> getAllLesson(Integer teacherid);
    
    @Select("select * from lesson")
    ArrayList<Lesson> getLessonGroup();
    
}