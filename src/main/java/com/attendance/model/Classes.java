package com.attendance.model;

public class Classes {
    private Integer id;

    private String name;

    private Integer school_id;

    private Integer leader_id;

    private Integer student_num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSchool_id() {
        return school_id;
    }

    public void setSchool_id(Integer school_id) {
        this.school_id = school_id;
    }

    public Integer getLeader_id() {
        return leader_id;
    }

    public void setLeader_id(Integer leader_id) {
        this.leader_id = leader_id;
    }

    public Integer getStudent_num() {
        return student_num;
    }

    public void setStudent_num(Integer student_num) {
        this.student_num = student_num;
    }
}