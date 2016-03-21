package com.attendance.dao;

import com.attendance.model.Attend;

public interface AttendMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Attend record);

    int insertSelective(Attend record);

    Attend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Attend record);

    int updateByPrimaryKey(Attend record);
}