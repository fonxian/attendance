<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="X-UA-Compatible" content="IE=Edge">
        <meta charset="UTF-8">
		<link href="${rc.contextPath}/common/css/bootstrap.css" rel="stylesheet">
		<link href="${rc.contextPath}/common/css/bootstrap.min.css" rel="stylesheet">
		<link href="${rc.contextPath}/common/css/dashboard.css" rel="stylesheet">
        <script src="${rc.contextPath}/common/js/bootstrap.min.js"></script>
         <script src="${rc.contextPath}/common/js/jquery-1.12.2.js"></script>
        <script src="${rc.contextPath}/common/js/bootstrap.js"></script>

</head>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">科大课堂点名系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">首页</a></li>
            <li><a href="#">设置</a></li>
            <li><a href="#">帮助</a></li>
          </ul>
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="查找">
          </form>
        </div>
      </div>
    </nav>
    
      <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="../teacher/index">系统概览 <span class="sr-only">(current)</span></a></li>
            <li><a href="../teacher/update">个人信息管理</a></li>
            <li><a href="../lesson/list">课程管理</a></li>
            <li><a href="../attend/index">考勤管理</a></li>
          </ul>
        </div>