<#include "../BaseControl.ftl" encoding="utf-8">

<script type="text/jsx">
    var AddStduent = React.createClass({
        render: function(){
            return(
               <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 className="page-header">添加学生</h1>

    <form action="../student/saveAdd" className="form-horizontal" method="post">

        <div className="control-group">
            <label className="control-label'">学号</label>
            <div className="controls">
                <input type="text" name="id" />
            </div>
        </div>

        <div className="control-group">
            <label className="control-label'">姓名</label>
            <div className="controls">
                <input type="text" name="name" />
            </div>
        </div>

        <div className="control-group">
            <label className="control-label'">性别</label>
            <div className="controls">
                <input type="text" name="sex" />
            </div>
        </div>

        <div className="control-group">
            <label className="control-label'">学院编号</label>
            <div className="controls">
                <input type="text"name="school_id" />
            </div>
        </div>

                <div className="control-group">
            <label className="control-label'">班级编号</label>
            <div className="controls">
                <input type="text" name="classes_id"/>
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
         	<AddStduent/>
        </div>
        ,document.getElementById('main')
    );

</script>
