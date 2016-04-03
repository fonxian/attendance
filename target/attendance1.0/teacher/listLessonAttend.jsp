<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.attendance.util.BasePathUtil" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% String contextPath = BasePathUtil.getBasePath(request);%>
<jsp:include page="header.jsp"></jsp:include>
	
	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 		<h1 class="page-header">课程考勤情况</h1>
   		<div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>学号</th>
			      <th>姓名</th>
			      <th>班级编号</th>
			       <th>正常</th>
			        <th>缺勤</th>
			         <th>请假</th>
			          <th>迟到</th>
                </tr>
              </thead>
              <tbody>
              <c:forEach items="${attendTempGroup}" var="s">
			<tr>
				<td>${s.student_id}</td>
				<td class="name">${s.name}</td>
				<td>${s.classes_id}</td>
				<td>
					<label >${s.normal}</label> 
				</td>
				<td>
					<label  >${s.absent}</label> 
				</td>
				<td>
					<label>${s.leave}</label>
				</td>
					<td>
					<label>${s.late}</label>
				</td>
	
			</tr>
		</c:forEach>
              </tbody>
            </table>
          </div>
	</div>

  </body>
</html>