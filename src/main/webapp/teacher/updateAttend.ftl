<#include "../BaseControl.ftl" encoding="utf-8">
 <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 class="page-header">添加课程</h1>

    <form action="../attend/saveUpdateAttend" class="form-horizontal" method="post">
 
		<input type="hidden" name="attend_id" value="${attend_id}"/>
		
		<div class="control-group">
        	<label class="control-label'">考勤状态</label>
        	<div class="controls">
				<select name="status_id">
  					<option value ="1">正常</option>
  					<option value ="2">缺勤</option>
  					<option value="3">请假</option>
  					<option value="4">迟到</option>
				</select>
			</div>
		</div>
		
		<div class="control-group">
        	<label class="control-label'">理由</label>
        	<div class="controls">
				<input type="text" name="reason"/ >
			</div>
		</div>
	
		<div class="control-group">
		    <div class="controls">
		 		<button type="submit"  class="btn">更新</button>
			 </div>
		</div>
		
	</form>
	</div>

  </body>
</html>