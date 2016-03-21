package com.attendance.dao;

import com.attendance.model.LessonHave;

public interface LessonHaveMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(LessonHave record);

    int insertSelective(LessonHave record);

    LessonHave selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LessonHave record);

    int updateByPrimaryKey(LessonHave record);
}