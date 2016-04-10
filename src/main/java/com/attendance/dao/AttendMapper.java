package com.attendance.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.attendance.model.Attend;

public interface AttendMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Attend record);

    int insertSelective(Attend record);

    Attend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Attend record);

    int updateByPrimaryKey(Attend record);
    
    @Select("select count(*) from attend where student_id =#{student_id} and lesson_id = #{lesson_id} and status_id =#{status_id}")
    int countAttend(@Param("student_id")Integer student_id,@Param("lesson_id")Integer lesson_id,@Param("status_id")Integer status_id);
 
    @Select("select * from attend where student_id =#{student_id} and lesson_id = #{lesson_id} and status_id =#{status_id}")
    ArrayList<Attend> getStudentAttend(@Param("student_id")Integer student_id,@Param("lesson_id")Integer lesson_id,@Param("status_id")Integer status_id);
    
    
    @Delete("delete from attend where id = #{attend_id}")
    int delStudentAttend(@Param("attend_id")Integer attend_id);
    
}