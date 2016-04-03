package com.attendance.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class XssHttpServletRequestWraper extends HttpServletRequestWrapper {

	public XssHttpServletRequestWraper(HttpServletRequest request) {
		super(request);
	}

	@Override
	public String getHeader(String name) {
		return clearXss(super.getHeader(name));
	}

	@Override
	public String getParameter(String name) {
		return clearXss(super.getParameter(name));
	}

	@Override
	public String[] getParameterValues(String name) {
		String[] values = super.getParameterValues(name);
		String[] newValues = super.getParameterValues(name);
		for (int i = 0; i < values.length; i++) {
			newValues[i] = clearXss(values[i]);
		}
		return newValues;
	}

	// 处理转义字符
	private String clearXss(String value) {
		if (value == null || "".equals(value)) {
			return value;
		}
		value = value.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
		value = value.replaceAll("\\(", "&#40;").replaceAll(")", "&#41;");
		value = value.replaceAll("'", "&#39;");
		value = value.replaceAll("eval\\((.*)\\)", "");
		value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']",
				"\"\"");
		value = value.replaceAll("script", "");
		return value;
	}

}
