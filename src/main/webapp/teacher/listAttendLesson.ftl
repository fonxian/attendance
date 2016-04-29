<#include "../BaseControl.ftl" encoding="utf-8">


<script type="text/jsx">
    var LessonModel = React.createClass({
        render: function(){
            return(
                 <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                    <h1 className="page-header">课程列表</h1>
                    <div className="table-responsive">
                      <table className="table table-striped">
                          <thead>
                            <tr>
                              <th>课程编号</th>
                              <th>课程名</th>
                              <th>考勤</th>
                              <th>考勤情况</th>
                            </tr>
                          </thead>
                      <tbody>
                       <#list lessonGroup as lesson>
                            <tr>
                              <td>${lesson.id}</td>
                              <td><a href="../classes/list?lessonid=${lesson.id}">${lesson.name}</a></td>
                              <td><a href="../student/listLessonStudent?lessonId=${lesson.id}">上课学生名单</a></td>
                              <td><a href="../attend/listLessonAttend">考勤情况</a></td>
                            </tr>
                       </#list>
                      </tbody>
                      </table>
                    </div>
                 </div>
              );
            }

        });

    React.render(
        <div className="row">
         <MenuModel/>
         <LessonModel/>
        </div>
        ,document.getElementById('main')
    );

</script>
