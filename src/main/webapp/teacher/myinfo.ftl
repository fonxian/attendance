<#include "../BaseControl.ftl" encoding="utf-8">
<script type="text/jsx">
var InfoModel = React.createClass({
        render: function(){
            return(
                <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 className="page-header">个人信息</h1>

    <form  action="../teacher/saveUpdate" className="form-horizontal" method="post">

        <div className="control-group">
            <label className="control-label'">教师编号</label>
            <div className="controls">
                <p>${teacher.id}</p>
            </div>
        </div>

        <div className="control-group">
            <label className="control-label'">姓名</label>
            <div className="controls">
                <input type="text"  name="realname" value="${teacher.realname}"/>
            </div>
        </div>

        <div className="control-group">
            <label className="control-label'">用户名</label>
            <div className="controls">
                <p>${teacher.username}</p>
            </div>
        </div>

        <div className="control-group">
            <label className="control-label'">重置密码</label>
            <div className="controls">
                <input type="text"  name="password" />
            </div>
        </div>

        <div className="control-group">
            <label className="control-label'">联系电话</label>
            <div className="controls">
                <input type="text" name= "tel" value="${teacher.tel}" />
            </div>
        </div>

        <div className="control-group">
            <label className="control-label'">学院编号</label>
            <div className="controls">
                <input type="text"name = "school_id"  value="${teacher.school_id}" />
            </div>
        </div>


        <div className="control-group">
            <div className="controls">
                <button type="submit"  className="btn">更新</button>
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
         <InfoModel/>
        </div>
        ,document.getElementById('main')
    );

</script>



