<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp"></jsp:include>

<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 class="page-header">上课班级列表</h1>
 <h4><a href="../classes/addLessonClass">添加上课班级</a></h4>
   <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>班级编号</th>
                  <th>班级名</th>
                </tr>
              </thead>
              <tbody>
				<c:forEach items="${classesGroup}" var="s">
				<tr>
					<td>${s.id}</td>
					<td><a href="../student/list?classid=${s.id}">${s.name}</a></td>
				</tr>
				</c:forEach>
              </tbody>
            </table>
          </div>
  </div>
  </body>
</html>
