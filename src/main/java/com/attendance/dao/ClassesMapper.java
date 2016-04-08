package com.attendance.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.attendance.model.Classes;

public interface ClassesMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
    
    @Select("select classes.Id,classes.name,school_id,leader_id,student_num from classes,lessonhave where lessonhave.classes_id = classes.Id and lessonhave.lesson_id= #{id}")
    ArrayList<Classes> getClasses(Integer id);
    
    @Insert("insert into lessonhave(lessonhave.classes_id,lessonhave.lesson_id) values( #{classes_id},#{lesson_id} )")
    int insertLessonClasses(@Param("classes_id")Integer classes_id,@Param("lesson_id")Integer lesson_id);
    
    @Delete("delete from lessonhave where classes_id = #{classes_id} and lesson_id = #{lesson_id}")
    int delLessonClasses(@Param("classes_id")Integer classes_id,@Param("lesson_id")Integer lesson_id);
    
}