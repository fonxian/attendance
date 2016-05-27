<#include "../BaseControl.ftl" encoding="utf-8">


<script type="text/jsx">
var InfoModel = React.createClass({
        render: function(){
            return(
                  <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 className="page-header">班级学生列表</h1>
       <button type="button"className="btn btn-primary btn-sm"  onClick={this.handleClick} > 添加学生</button>
     <label className="import">导入学生</label>
      <form action="../student/importStudent" class="form-horizontal" method="post">
          <input name = "path" type="file" id = "import" />
          <button type="submit">导入</button>
        </form>
      <div className="table-responsive">
            <table className="table">
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
          <td><a href="../student/del?studentid=${student.id}">删除</a></td>
        </tr>
         </#list>
              </tbody>
            </table>
          </div>
       </div>
              );
            },
    	handleClick: function (event) {
   	  	 	window.location.href = '"../student/add';
  	  }

        });

    React.render(
        <div className="row">
         <MenuModel/>
         <InfoModel/>
        </div>
        ,document.getElementById('main')
    );

</script>
