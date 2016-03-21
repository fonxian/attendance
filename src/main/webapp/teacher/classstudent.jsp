<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <p>${user.realname}</p>
    <title>班级学生列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">


  </head>
  
  <body>
    <p>班级学生列表</p>
    <a href="student/add">添加上课学生</a>
    <a href="#">删除上课学生</a>
	<table>
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${classStudentGroup}" var="s">
			<tr>
				<td>${s.id}</td>
				<td>${s.name}</td>
				<td><a href="student/del?studentid=${s.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
  </body>
</html>
