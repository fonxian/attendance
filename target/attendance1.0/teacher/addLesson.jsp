<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp"></jsp:include>
 <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 class="page-header">添加课程</h1>

    <form action="../lesson/saveAdd" class="form-horizontal" method="post">
    
    	<div class="control-group">
        	<label class="control-label'">课程编号</label>
        	<div class="controls">
				<input type="text" name="id" >
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">课程名</label>
        	<div class="controls">
				<input type="text" name="name" >
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">任课老师编号</label>
        	<div class="controls">
				<input type="text" name="teacher_id" value="${teacher.id}" >
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">任课老师姓名</label>
        	<div class="controls">
				<input type="text" value="${teacher.realname}" >
			</div>
		</div>
	
		<div class="control-group">
		    <div class="controls">
		 		<button type="submit"  class="btn">添加</button>
			 </div>
		</div>
		
	</form>
	</div>

  </body>
</html>
