<#include "../BaseControl.ftl" encoding="utf-8">

<script type="text/jsx">
    var AddLessonClassModel = React.createClass({
        render: function(){
            return(
                <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 className="page-header">添加上课班级</h1>

    <form action="../classes/saveLessonClass" className="form-horizontal" method="post">

        <div className="control-group">
            <label className="control-label'">课程编号</label>
            <div className="controls">
                <input type="text" name="lessonid"/>
            </div>
        </div>


        <div className="control-group">
            <label className="control-label'">上课班级编号</label>
            <div className="controls">
                <input type="text" name="classes_id" />
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
         	  <AddLessonClassModel/>
        </div>
        ,document.getElementById('main')
    );

</script>



