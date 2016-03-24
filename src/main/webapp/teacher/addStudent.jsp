<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp"></jsp:include>
 <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 class="page-header">添加学生</h1>

    <form action="../student/saveAdd" class="form-horizontal" method="post">
    
    	<div class="control-group">
        	<label class="control-label'">学号</label>
        	<div class="controls">
				<input type="text" name="id" >
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">姓名</label>
        	<div class="controls">
				<input type="text" name="name" >
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">性别</label>
        	<div class="controls">
				<input type="text" name="sex" >
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">学院编号</label>
        	<div class="controls">
				<input type="text"name="school_id" >
			</div>
		</div>
		
				<div class="control-group">
        	<label class="control-label'">班级编号</label>
        	<div class="controls">
				<input type="text" name="classes_id">
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
