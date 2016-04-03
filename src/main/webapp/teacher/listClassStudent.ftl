<#include "../BaseControl.ftl" encoding="utf-8">
	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 		<h1 class="page-header">班级学生列表</h1>
 		 <h4><a href="../student/add">添加学生</a></h4>
   		<div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>学号</th>
                  <th>姓名</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
                <#list classesStudentGroup as student>
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td><a href="student/del?studentid=${student.id}">删除</a></td>
				</tr>
				 </#list>
              </tbody>
            </table>
          </div>
       </div>
	
  </body>
</html>
