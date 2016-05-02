<#include "../BaseControl.ftl" encoding="utf-8">

<script type="text/jsx">
    var AddLessonModel = React.createClass({
        render: function(){
            return(
                <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
 <h1 class="page-header">添加课程</h1>

    <form action="../lesson/saveAdd" class="form-horizontal" method="post">

        <div class="control-group">
            <label class="control-label'">课程编号</label>
            <div class="controls">
                <input type="text" name="id" >
            </div>
        </div>

        <div class="control-group">
            <label class="control-label'">课程名</label>
            <div class="controls">
                <input type="text" name="name" >
            </div>
        </div>

        <div class="control-group">
            <label class="control-label'">任课老师编号</label>
            <div class="controls">
                <input type="text" name="teacher_id" value="${teacher.id}" >
            </div>
        </div>

        <div class="control-group">
            <label class="control-label'">任课老师姓名</label>
            <div class="controls">
                <input type="text" value="${teacher.realname}" >
            </div>
        </div>

        <div class="control-group">
            <div class="controls">
                <button type="submit"  class="btn">添加</button>
             </div>
        </div>

    </form>
    </div>
              );
            }

        });

    React.render(
        <div className="row">
         <AddLessonModel/>
         <LessonModel/>
        </div>
        ,document.getElementById('main')
    );

</script>

