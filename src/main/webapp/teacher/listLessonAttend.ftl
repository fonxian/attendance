<#include "../BaseControl.ftl" encoding="utf-8">

<script type="text/jsx">
    var LessonAttendModel = React.createClass({
        render: function(){
            return(
                <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
        <h1 className="page-header">课程考勤情况</h1>
        <div className="table-responsive">
            <table className="table">
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
                <td className="name">${student.name}</td>
                <td>${student.classes_id}</td>
                <td>
                    <label ><a href="../attend/studentAttend?lesson_id=1&student_id=${student.student_id}&status_id=1">${student.normal}</a></label>
                </td>
                <td>
                    <label><a href="../attend/studentAttend?lesson_id=1&student_id=${student.student_id}&status_id=2">${student.absent}</a></label>
                </td>
                <td>
                    <label><a href="../attend/studentAttend?lesson_id=1&student_id=${student.student_id}&status_id=3">${student.leave}</a></label>
                </td>
                    <td>
                    <label><a href="../attend/studentAttend?lesson_id=1&student_id=${student.student_id}&status_id=4">${student.late}</a></label>
                </td>

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
         <LessonAttendModel/>
        </div>
        ,document.getElementById('main')
    );

</script>


