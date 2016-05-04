<#include "../BaseControl.ftl" encoding="utf-8">

<script type="text/jsx">
    var HelpModel = React.createClass({
        render: function(){
            return(
                <div className="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                    <h1 className="page-header">欢迎${teacher.realname}</h1>
                    <div className="row placeholders">
                    <h3>帮助</h3>
                    <p>使用方法：xxxxxx</p>
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