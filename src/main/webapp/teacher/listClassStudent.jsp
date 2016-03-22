<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp"></jsp:include>
	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 		<h1 class="page-header">班级学生列表</h1>
   		<div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>学号</th>
                  <th>姓名</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
              	<c:forEach items="${classStudentGroup}" var="s">
				<tr>
					<td>${s.id}</td>
					<td>${s.name}</td>
					<td><a href="student/del?studentid=${s.id}">删除</a></td>
				</tr>
				</c:forEach>
              </tbody>
            </table>
          </div>
       </div>
	
  </body>
</html>
