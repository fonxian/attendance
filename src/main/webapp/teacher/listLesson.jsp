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

<title>课程列表</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


</head>

<body>
	<p>课程列表</p>
	<table>
		<tr>
			<th>课程编号</th>
			<th>课程名</th>

		</tr>
		<c:forEach items="${lessonGroup}" var="s">
			<tr>
				<td>${s.id}</td>
				<td><a href="classes/list?lessonid=${s.id}">${s.name}</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
