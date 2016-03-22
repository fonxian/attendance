<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp"></jsp:include>

    	<p>上课学生列表</p>
	<table>
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>考勤操作</th>
			<th>事由</th>
		</tr>
		<c:forEach items="${lessonStudentGroup}" var="s">
			<tr>
				<td>${s.id}</td>
				<td>${s.name}</td>
				<td><a href="#">正常</a><a href="#">缺勤</a><a href="#">请假</a><a href="#">迟到</a></td>
				<td>事由</td>
			</tr>
		</c:forEach>
	</table>
  </body>
</html>
