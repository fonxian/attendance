package com.attendance.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.attendance.service.AttendService;

public class AttendController extends BaseController{

	@Autowired
	private AttendService attendService;
	
}
