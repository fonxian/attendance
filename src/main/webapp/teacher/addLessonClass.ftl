<#include "../BaseControl.ftl" encoding="utf-8">

 <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 class="page-header">添加上课班级</h1>

    <form action="../classes/saveLessonClass" class="form-horizontal" method="post">
    
    	<div class="control-group">
        	<label class="control-label'">课程编号</label>
        	<div class="controls">
				<input type="text" name="lessonid">
			</div>
		</div>
		
		
		<div class="control-group">
        	<label class="control-label'">上课班级编号</label>
        	<div class="controls">
				<input type="text" name="classes_id" >
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