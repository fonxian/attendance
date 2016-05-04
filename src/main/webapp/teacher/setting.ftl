<#include "../BaseControl.ftl" encoding="utf-8">

<script type="text/jsx">
    var SettingModel = React.createClass({
        render: function(){
            return(
                <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                    <h1 className="page-header">欢迎${teacher.realname}</h1>
                    <div className="row placeholders">
                    <h3>设置</h3>
                    <p>。。。。。。</p>
                    </div>
                </div>
              );
            }

        });

    React.render(
        <div className="row">
           <MenuModel/>
           <SettingModel/>
        </div>
        ,document.getElementById('main')
    );

</script>