<#include "../BaseControl.ftl" encoding="utf-8">

    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
        <h1 class="page-header">学生考勤情况</h1>
        <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>课程编号</th>
                  <th>学号</th>
                  <th>考勤备注</th>
                   <th>考勤日期</th>
                    <th>考勤操作</th>
                </tr>
              </thead>
              <tbody>
              <#list attendList as attend>
            <tr>
                <td>${attend.lesson_id}</td>
                <td>${attend.student_id}</td>
                <td>${attend.reason}</td>
                <td>${attend.date?string("yyyy-MM-dd")}</td>
                <td><a href="../attend/updateAttend?attend_id=${attend.id}">修改</a> | <a href="../attend/delAttend?attend_id=${attend.id}">删除</a></td>
            </tr>
        </#list>
              </tbody>
            </table>
          </div>
    </div>

  </body>
</html>