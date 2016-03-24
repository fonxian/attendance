<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.attendance.util.BasePathUtil" %>
<jsp:include page="header.jsp"></jsp:include>
<% String contextPath = BasePathUtil.getBasePath(request);%>
<jsp:include page="header.jsp"></jsp:include>
 <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 class="page-header">个人信息</h1>

    <form  class="form-horizontal" method="post">
    
    	<div class="control-group">
        	<label class="control-label'">教师编号</label>
        	<div class="controls">
				<p>${teacher.id}</p>
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">姓名</label>
        	<div class="controls">
				<input type="text" name="realname" value="${teacher.realname}">
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">用户名</label>
        	<div class="controls">
				<p>${teacher.username}</p>
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">重置密码</label>
        	<div class="controls">
				<input type="text" name="password" >
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">联系电话</label>
        	<div class="controls">
				<input type="text" value="${teacher.tel}" >
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">学院编号</label>
        	<div class="controls">
				<input type="text" value="${teacher.school_id}" >
			</div>
		</div>
	
	
		<div class="control-group">
		    <div class="controls">
		 		<button type="submit"  class="btn">更新</button>
			 </div>
		</div>
		
	</form>
	</div>
	
	<script>
	$(document).ready(function(){
		
		$(".attend").click(function(){
			var password = 1;
			var tel = $(this).parent("td").prevAll('td').eq(2).text();
			var school_id = ${teacher.id}
			var realname ="实习";
			$.ajax({
				type:"POST",
				url : "<%=contextPath%>teacher/saveUpdate",
				data:{tel:tel,school_id:school_id,realname:realname,password:password},
		  		success:function(){
					alert("更新成功");
				}
		   });
		});
	});
		
		</script>

  </body>
</html>

