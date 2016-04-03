<#include "../BaseControl.ftl" encoding="utf-8">
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
				<input type="text" id = "realname" name="realname" value="${teacher.realname}">
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
				<input type="text" id="password" name="password" >
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">联系电话</label>
        	<div class="controls">
				<input type="text" id = "tel" value="${teacher.tel}" >
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">学院编号</label>
        	<div class="controls">
				<input type="text" id = "schoolid" value="${teacher.school_id}" >
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
			var password =  $("#password").val();;
			var tel =  $("#tel").val();
			var school_id = $("#schoolid").val();
			var realname = $("#realname").val();;
			$.ajax({
				type:"POST",
				url : "${rc.contextPath}/teacher/saveUpdate",
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

