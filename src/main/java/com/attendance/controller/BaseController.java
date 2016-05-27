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
/**
 * 基础控制层实现类
 * @author fonxian
 * @version 
 * 版本号：100-000-000<br/>
 * 创建日期：2016-03-15<br/>
 * 历史修订：<br/>
 */
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
