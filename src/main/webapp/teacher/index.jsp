<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>

	 <p>欢迎${teacher.realname}</p>
	 <ul>
	 	<li><a href="../lesson/list?teacherId=${teacher.id}">课程管理</a></li>
	 	<li><a>个人信息管理</a></li>
	 	<li><a>考勤管理</a></li>
	 </ul>
</body>
</html>