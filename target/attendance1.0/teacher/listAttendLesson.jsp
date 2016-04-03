<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp"></jsp:include>

 <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 class="page-header">课程列表</h1>
   <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>课程编号</th>
                  <th>课程名</th>
                  <th>考勤</th>
                  <th>考勤情况</th>
                </tr>
              </thead>
              <tbody>
                <c:forEach items="${lessonGroup}" var="s">
				<tr>
					<td>${s.id}</td>
					<td><a href="../classes/list?lessonid=${s.id}">${s.name}</a></td>
					<td><a href="../student/listLessonStudent?lessonId=${s.id}">上课学生名单</a></td>
					<td><a href="../attend/listLessonAttend">考勤情况</a></td>
				</tr>
				</c:forEach>
              </tbody>
            </table>
          </div>
  </div>
</body>
</html>
