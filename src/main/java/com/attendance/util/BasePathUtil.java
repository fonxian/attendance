package com.attendance.util;

import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class BasePathUtil {
	public static String getBasePath(HttpServletRequest request){
		String basepath = null;
			if(80==request.getServerPort()){
				basepath = request.getScheme()+"://"+request.getServerName()+ request.getContextPath()+"/"; 
			}else{
				basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ request.getContextPath()+"/"; 
			}
		return basepath;
	}
	
	 public static String getContextPath(HttpServletRequest request) {
	        String rawContextPath = request.getContextPath();
	        if (StringUtils.isBlank(rawContextPath) || rawContextPath.length() == 1) {
	            return "";
	        } else {
	            return StringUtils.substring(rawContextPath, 1, rawContextPath.length())+"/";
	        }
	    }

}
