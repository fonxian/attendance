<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
        <meta charset="UTF-8">
        <script src="${rc.contextPath}/common/js/react.js"></script>
        <script src="${rc.contextPath}/common/js/JSXTransformer.js"></script>
        <link href="${rc.contextPath}/common/css/bootstrap.css" rel="stylesheet">
        <link href="${rc.contextPath}/common/css/bootstrap.min.css" rel="stylesheet">
        <link href="${rc.contextPath}/common/css/dashboard.css" rel="stylesheet">
        <script src="${rc.contextPath}/common/js/bootstrap.min.js"></script>
        <script src="${rc.contextPath}/common/js/jquery-1.12.2.js"></script>
        <script src="${rc.contextPath}/common/js/bootstrap.js"></script>
        <script type="text/jsx">

          var NavModel1 = React.createClass({

            render: function(){
              return(
              <div className ="navbar-header">
                 <button type="button" className="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                 <span className="sr-only">Toggle navigation</span>
                 <span className="icon-bar"></span>
                 <span className="icon-bar"></span>
                 <span className="icon-bar"></span>
                 </button>
                 <a className="navbar-brand" href="#">科大课堂点名系统</a>
              </div>);
            }

        });

          var Input =  React.createClass({
           render: function () {
               return (
                  <input type="text" className="form-control" placeholder="查找"/>
               );
            }
       });

        var NavModel2 = React.createClass({
          render:function(){
            return(
              <div id="navbar" className="navbar-collapse collapse">
                <ul className="nav navbar-nav navbar-right">
                  <li><a href="#">首页</a></li>
                  <li><a href="#">设置</a></li>
                  <li><a href="#">帮助</a></li>
                </ul>
                <form className="navbar-form navbar-right">
                  <Input/>
                </form>
              </div>
            );
          }
        });

        var NavModel = React.createClass({
          render:function(){
            return(
              <div className ="container-fluid">
                <NavModel1/>
                <NavModel2/>
              </div>
            );
          }
        });

        React.render(
            <NavModel/>
            ,document.getElementById('nav')
        );

        var MenuModel = React.createClass({

            render: function(){
              return(
                <div className="col-sm-3 col-md-2 sidebar">
                   <ul className="nav nav-sidebar">
                      <li className="active"><a href="../teacher/index">系统概览 <span className="sr-only">(current)</span></a></li>
                      <li><a href="../teacher/update">个人信息管理</a></li>
                      <li><a href="../lesson/list">课程管理</a></li>
                      <li><a href="../attend/index">考勤管理</a></li>
                   </ul>
                </div>
              );
            }

        });


        </script>
</head>
<body>

<nav id ="nav" class="navbar navbar-inverse navbar-fixed-top">

</nav>

<div id = "main" class="container-fluid">

</div>

</body>
</html>