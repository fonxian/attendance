package com.attendance.model;

public class AttendTemp {
	
	private String name;
	
	private int classes_id;
	
	private int student_id;
	
	private int leave;
	
	private int absent;
	
	private int normal;
	
	private int late;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClasses_id() {
		return classes_id;
	}

	public void setClasses_id(int classes_id) {
		this.classes_id = classes_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getLeave() {
		return leave;
	}

	public void setLeave(int leave) {
		this.leave = leave;
	}

	public int getAbsent() {
		return absent;
	}

	public void setAbsent(int absent) {
		this.absent = absent;
	}

	public int getNormal() {
		return normal;
	}

	public void setNormal(int normal) {
		this.normal = normal;
	}

	public int getLate() {
		return late;
	}

	public void setLate(int late) {
		this.late = late;
	}

	public AttendTemp(String name, int classes_id, int student_id, int normal, int absent,int leave, int late) {
		this.name = name;
		this.classes_id = classes_id;
		this.student_id = student_id;
		this.leave = leave;
		this.absent = absent;
		this.normal = normal;
		this.late = late;
	}

	@Override
	public String toString() {
		return "AttendTemp [name=" + name + ", classes_id=" + classes_id
				+ ", student_id=" + student_id + ", leave=" + leave
				+ ", absent=" + absent + ", normal=" + normal + ", late="
				+ late + "]";
	}
	
}
