package com.attendance.util;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class CommonInterceptor extends HandlerInterceptorAdapter{
	
	private final Logger log = LoggerFactory.getLogger(CommonInterceptor.class);
	
	

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

	        log.info("==============执行顺序: 1、preHandle================");    
	        String requestUri = request.getRequestURI();  
	        String contextPath = request.getContextPath();  
	        String url = requestUri.substring(contextPath.length());  
	        
	        log.info("requestUri:"+requestUri);    
	        log.info("contextPath:"+contextPath);    
	        log.info("url:"+url);    
	        System.out.println("------------------------");
	        String username =  (String)request.getSession().getAttribute("user");   
	        if(username == null){  
	            log.info("Interceptor：跳转到login页面！");  
	            request.getRequestDispatcher("/index.jsp").forward(request, response);  
	            return false;  
	        }else  
	            return true;     
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		 log.info("==============执行顺序: 3、afterCompletion================");    
	}


}
