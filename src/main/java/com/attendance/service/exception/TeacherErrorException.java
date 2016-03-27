package com.attendance.service.exception;

public class TeacherErrorException extends Exception {

	private static final long serialVersionUID = 573115585423539819L;

	private String msg;

	private int code = 1000;

	public TeacherErrorException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public TeacherErrorException(int code, String msg) {
		super(msg);
		this.code = code;
		this.msg = msg;
	}

	public int getFailedCode() {
		return code;
	}

	public String getFailedMsg() {
		return msg;
	}

}
