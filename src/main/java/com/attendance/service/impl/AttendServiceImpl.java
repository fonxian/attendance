package com.attendance.service.impl;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.dao.AttendMapper;
import com.attendance.dao.StudentMapper;
import com.attendance.model.Attend;
import com.attendance.model.AttendTemp;
import com.attendance.model.Student;
import com.attendance.service.AttendService;

/**
 * 考勤管理业务层实现类
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：<br/>
 */
@Service("attendService")
public class AttendServiceImpl implements AttendService{

	@Autowired
	private AttendMapper attendMapper;
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public boolean setStudentAttend(Attend attend) {
		attend.setDate(new Date());
		attendMapper.insert(attend);
		return true;
	}

	@Override
	public ArrayList<AttendTemp> countLessonAttend(int lesson_id) {
		AttendTemp temp = null;
		ArrayList<AttendTemp> attendTemp = new ArrayList<AttendTemp>();
		ArrayList<Student> studentGroupLesson = studentMapper.getStudentGroupByLesson(lesson_id);
		for(Student student:studentGroupLesson){
			int student_id = student.getId();
			int normal = attendMapper.countAttend(student_id, lesson_id, 1);
			int absent = attendMapper.countAttend(student_id, lesson_id, 2);
			int leave = attendMapper.countAttend(student_id, lesson_id, 3);
			int late = attendMapper.countAttend(student_id, lesson_id, 4);
			temp = new AttendTemp(student.getName(),student.getClasses_id(),student.getId(),normal,absent,leave,late);
			attendTemp.add(temp);
		}
		return attendTemp;
	}

	@Override
	public ArrayList<Attend> getStudentAttend(int student_id, int lesson_id, int status_id) {
		ArrayList<Attend> attend = attendMapper.getStudentAttend(student_id, lesson_id, status_id);
		return attend;
	}

	@Override
	public boolean delStudentAttend(int attend_id) {
		attendMapper.delStudentAttend(attend_id);
		return true;
	}

	@Override
	public Attend getStudentAttend(int attend_id) {
		Attend attend = attendMapper.selectByPrimaryKey(attend_id);
		return attend;
	}

	@Override
	public boolean updateAttend(Attend attend) {
		attendMapper.updateByPrimaryKey(attend);
		return true;
	}

}
