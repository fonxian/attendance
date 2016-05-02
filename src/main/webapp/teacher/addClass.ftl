<#include "../BaseControl.ftl" encoding="utf-8">

<script type="text/jsx">
    var AddClassModel = React.createClass({
        render: function(){
            return(
                 <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 className="page-header">添加课程</h1>

    <form action="../lesson/saveAdd" className="form-horizontal" method="post">

        <div className="control-group">
            <label className="control-label'">课程编号</label>
            <div className="controls">
                <input type="text" name="id" />
            </div>
        </div>

        <div className="control-group">
            <label className="control-label'">课程名</label>
            <div className="controls">
                <input type="text" name="name" />
            </div>
        </div>

        <div className="control-group">
            <label className="control-label'">任课老师编号</label>
            <div className="controls">
                <input type="text" name="teacher_id" value="${teacher.id}" />
            </div>
        </div>

        <div className="control-group">
            <label className="control-label'">任课老师姓名</label>
            <div className="controls">
                <input type="text" value="${teacher.realname}" />
            </div>
        </div>

        <div className="control-group">
            <div className="controls">
                <button type="submit"  className="btn">添加</button>
             </div>
        </div>

    </form>
    </div>
              );
            }

        });

    React.render(
        <div className="row">
          <MenuModel/>
         <AddClassModel/>
        </div>
        ,document.getElementById('main')
    );

</script>

