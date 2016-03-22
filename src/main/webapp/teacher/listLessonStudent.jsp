<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.attendance.util.BasePathUtil" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% String contextPath = BasePathUtil.getBasePath(request);%>
<jsp:include page="header.jsp"></jsp:include>
	
	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 		<h1 class="page-header">课程列表</h1>
   		<div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>学号</th>
			      <th>姓名</th>
			      <th>班级编号</th>
			      <th>考勤操作</th>
			      <th>事由</th>
                </tr>
              </thead>
              <tbody>
              <c:forEach items="${lessonStudentGroup}" var="s">
			<tr>
				<td id="studentid">${s.id}</td>
				<td>${s.name}</td>
				<td>${s.classes_id}</td>
				<td>
				<a id="normal"href="#">正常</a> |
				<a id="absent"href="#">缺勤</a> |
				<a id="leave"href="#">请假</a> |
				<a id="late"href="#">迟到</a></td>
				<td><input name="result" /></td>
			</tr>
		</c:forEach>
              </tbody>
            </table>
            	<button id="btn1" type="button">提交内容</button>
          </div>
	</div>

	<script>
	//$("#normal").click(function(){
	$(document).ready(function(){
		
		$("#btn1").click(function(){
			var lesson_id = 1;
			var student_id=1205010106; 
			//= $("#studentid").val();
			var teacher_id = 1000;
			var reason ="实习";
			var classes_id="12050101";
			var status_id = 1;
			$.ajax({
				type:"POST",
				url : "<%=contextPath%>attend/add",
				data:{lesson_id:lesson_id,student_id:student_id,teacher_id:teacher_id,status_id:status_id,reason:reason,classes_id:classes_id},
				success:function(){
					alert("success");
				}
			});
		});
	});
		
		</script>
	
  </body>
</html>
