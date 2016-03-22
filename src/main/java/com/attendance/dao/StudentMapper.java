package com.attendance.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;

import com.attendance.model.Student;

public interface StudentMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    ArrayList<Student> getAllStudentByClassId(Integer id);
    
    @Select("select s.Id,s.name,s.sex,s.classes_id from student s,classes c,lessonhave l where s.classes_id = l.classes_id and l.classes_id = c.Id and l.lesson_id = #{id}")
    ArrayList<Student> getStudentGroupByLesson(Integer id);
    
    
}