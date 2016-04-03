<#include "../BaseControl.ftl" encoding="utf-8">

	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 		<h1 class="page-header">课程考勤情况</h1>
   		<div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>学号</th>
			      <th>姓名</th>
			      <th>班级编号</th>
			       <th>正常</th>
			        <th>缺勤</th>
			         <th>请假</th>
			          <th>迟到</th>
                </tr>
              </thead>
              <tbody>
              <#list attendTempGroup as student>
			<tr>
				<td>${student.student_id}</td>
				<td class="name">${student.name}</td>
				<td>${student.classes_id}</td>
				<td>
					<label >${student.normal}</label> 
				</td>
				<td>
					<label  >${student.absent}</label> 
				</td>
				<td>
					<label>${student.leave}</label>
				</td>
					<td>
					<label>${student.late}</label>
				</td>
	
			</tr>
		</#list>
              </tbody>
            </table>
          </div>
	</div>

  </body>
</html>