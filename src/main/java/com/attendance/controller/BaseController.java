package com.attendance.controller;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.attendance.model.Teacher;

@Controller
public class BaseController {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	protected MessageSourceAccessor messages;

	@Autowired
	public void setMessages(MessageSource messageSource) {
		messages = new MessageSourceAccessor(messageSource);
	}

	protected String getText(String msgKey) {
		return messages.getMessage(msgKey);
	}

	protected String getText(String msgKey, String arg) {
		return getText(msgKey, new Object[] { arg });
	}

	protected String getText(String msgKey, Object[] args) {
		return messages.getMessage(msgKey, args);
	}

	public String getModel(ModelMap model, String page) {
		Teacher teacher = (Teacher) SecurityUtils.getSubject().getPrincipal();
		model.put("userid", teacher.getId());
		model.put("userrealname", teacher.getRealname());
		model.put("username", teacher.getUsername());
		return page;
	}

}
