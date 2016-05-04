<#include "../BaseControl.ftl" encoding="utf-8">

<script type="text/jsx">
    var LessonModel = React.createClass({
        render: function(){
            return(
                 <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 className="page-header">课程管理</h1>
 <button type="button"className="btn btn-primary btn-sm"  onClick={this.handleClick} > 添加课程</button>
   <div className="table-responsive">
            <table className="table table-striped">
              <thead>
                <tr>
                  <th>课程编号</th>
                  <th>课程名</th>
                  <th>任课老师编号</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
              <#list lessonGroup as lesson>
        <tr>
          <td>${lesson.id}</td>
          <td><a href="../classes/list?lessonid=${lesson.id}">${lesson.name}</a></td>
          <td>${lesson.teacher_id}</td>
          <td><a href="../lesson/del?lessonid=${lesson.id}">删除</a></td>
        </tr>
        </#list>
              </tbody>
            </table>
          </div>
  </div>
              );
            },
    	handleClick: function (event) {
   	  	 	window.location.href = '../lesson/add';
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