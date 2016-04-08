<#include "../BaseControl.ftl" encoding="utf-8">
<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 class="page-header">上课班级列表</h1>
 <h4><a href="../classes/addLessonClass">添加上课班级</a></h4>
   <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>班级编号</th>
                  <th>班级名</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
              <#list classesGroup as classes>
				<tr>
					<td>${classes.id}</td>
					<td><a href="../student/list?classid=${classes.id}">${classes.name}</a></td>
					<td><a href="../classes/delLessonClass?classesid=${classes.id}&lessonid=${lessonid}">删除</a></td>
				</tr>
				</#list>
              </tbody>
            </table>
          </div>
  </div>
  </body>
</html>