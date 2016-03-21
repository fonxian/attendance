<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>课堂考勤系统登录</title>
  </head>
  
  <body>
    	<form action="teacher/login" method="post">
		<label>账号</label>
		<input type="text" name="username"> 
		<label>密码</label>
		<input type="password" name="password">
		 <input type="submit"  value="确认"> 
		 <a href="register.jsp">注册</a>
	</form>
  </body>
</html>
