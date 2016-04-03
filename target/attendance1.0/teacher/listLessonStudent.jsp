<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.attendance.util.BasePathUtil" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% String contextPath = BasePathUtil.getBasePath(request);%>
<jsp:include page="header.jsp"></jsp:include>
	
	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 		<h1 class="page-header">课程列表</h1>
 		<button class="namelist">全部点名</button>
   		<div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>学号</th>
			      <th>姓名</th>
			      <th>班级编号</th>
			      <th>考勤操作</th>
			      <th>考勤情况 | 事由</th>
                </tr>
              </thead>
              <tbody>
              <c:forEach items="${lessonStudentGroup}" var="s">
			<tr>
				<td>${s.id}</td>
				<td class="name">${s.name}</td>
				<td>${s.classes_id}</td>
				<td>
					<button class="attend" name="1">正常</button> |
					<button class="attend"  name="2">缺勤</button> |
					<button  class="attend" name="3">请假</button> |
					<button class="attend"  name = "4">迟到</button>
				</td>
				<td><label class="solution">未点名</label> | <input name="result"/></td>
			</tr>
		</c:forEach>
              </tbody>
            </table>
          </div>
	</div>

	<script>
	$(document).ready(function(){
		//点名记录
		$(".attend").click(function(){
			var lesson_id = 1;
			var student_id = $(this).parent("td").prevAll('td').eq(2).text();
			var teacher_id = ${teacher.id}
			var reason =$(this).parent("td").next().find("input").val();
			var classes_id=$(this).parent("td").prevAll('td').eq(0).text();
			var status_id = $(this).attr("name");
			var status_name = $(this).text();
			$.ajax({
				type:"POST",
				url : "<%=contextPath%>attend/add",
				data:{lesson_id:lesson_id,student_id:student_id,teacher_id:teacher_id,status_id:status_id,reason:reason,classes_id:classes_id},
		  		success:function(){
				var test = $(this).parent("td").next().find("p").val();
				alert(test);
				}
			});
		});
		//姓名朗读
		$(".name").click(function(){
			var name =$(this).text();
			$.ajax({
				type:"POST",
				url : "<%=contextPath%>attend/read",
				data:{name:name},
		  		success:function(){
				}
		   });
		});
		//姓名列表朗读
		$(".namelist").click(function(){
			$.ajax({
				type:"POST",
				url : "<%=contextPath%>student/readAll ",
				data:{lessonId:1},
		  		success:function(){
				}
		   });
		});
		
	});
		
		</script>
	
  </body>
</html>
