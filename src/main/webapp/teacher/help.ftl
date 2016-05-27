<#include "../BaseControl.ftl" encoding="utf-8">

<script type="text/jsx">
    var HelpModel = React.createClass({
        render: function(){
            return(
                <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                    <h1 className="page-header">欢迎${teacher.realname}</h1>
                    <div className="row placeholders">
                    <h2>帮助</h2>
                    <h4>使用方法：</h4><br/>
                    <h4>1、添加学生</h4><br/>
                    <p>在课程管理中选中课程，选中上课班级，可以添加单个学生或通过Excel导入学生</p><br/>
                    <h4>2、修改考勤记录</h4><br/>
                    <p>考勤管理——考勤情况——选中修改修改的考勤记录</p><br/>
                    </div>
                </div>
              );
            }

        });

    React.render(
        <div className="row">
           <MenuModel/>
           <HelpModel/>
        </div>
        ,document.getElementById('main')
    );

</script>