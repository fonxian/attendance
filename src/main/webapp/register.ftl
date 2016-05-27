
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="${rc.contextPath}/common/css/clicki.web.css?V=20120501" media="screen" />
<link rel="stylesheet" type="text/css" href="${rc.contextPath}/common/css/clicki.loginandreg.css?V=20120501" media="screen" />
<link rel="stylesheet" type="text/css" href="${rc.contextPath}/common/css/clicki.webkitanimation.css?V=20120501" media="screen" />


<title>科大点名系统</title>
<!--[if lte IE 9 ]><link rel="stylesheet" href="resources/styles/clicki.iehotfix.css?V=20120501" /><![endif]-->
<!--[if lte IE 9]>
<style>
body {background:#2f7fb2 url(resources/styles/images/topbg_01.png?V=20120501) top center no-repeat;}
html{height:100%;overflow:hidden;background:#2f7fb2 url(resources/styles/images/topbg_01.png?V=20120501) top center no-repeat;}
</style>
<![endif]-->
</head>
<body>

<div class="theCenterBox" style="">
  <style>
.theCenterBox{width:670px;}
</style>
  <div class="theLoginBox" style="width:657px">
    <div class="loginTxt">用户注册</div>
    <form id="leftForm" action="teacher/register" method="post">
      <div class="theLoginArea" id="loginBox">
      
        <p style="position: relative;">
          <label for="LoginForm_email">邮箱：</label>
          <input placeholder="请输入您的邮箱" name="username" id="LoginForm_email" type="text" maxlength="255" />
          <span>请输入您的邮箱</span> </p>
          
        <p style="position: relative;">
          <label for="LoginForm_password">密码：</label>
          <input placeholder="请输入您的密码" name="password" id="LoginForm_password" type="password" maxlength="16" />
          <span>请输入您的密码</span> </p>
          
        <p style="position: relative;">
          <label for="LoginForm_checksum">真实姓名：</label>
          <input placeholder="真实姓名" name="realname" id="LoginForm_checksum" type="text" value="" />
          <span>请输入您的真实姓名</span> </p>
          
          
          <p style="position: relative;">
          <label for="LoginForm_checksum">性别(男输入1，女输入2)：</label>
          <input placeholder="性别" type="text" value="" class="input-text-user noPic input-click" name="sex" id="sex">
          <span>请输入您的性别</span> </p>
          
          <p style="position: relative;">
          <label for="LoginForm_checksum">电话：</label>
          <input placeholder="电话" name="tel" id="LoginForm_checksum" type="text" value="" />
          <span>请输入您的电话</span> </p>
          
          <p style="position: relative;">
          <label for="LoginForm_checksum">学院编号：</label>
          <input placeholder="编号" name="school_id" id="LoginForm_checksum" type="text" value="" />
          <span>请输入您的编号</span> </p>
          
        <div class="loginSubmitBnt">
          <div class="reg_submit">
            <input name="userSubmit" class="theSubmitButton" value="" type="submit" />
          </div>
        </div>
      </div>
      <div class="theRegArea fixRegHeight" id="reg_reg">
        <h2>已经有账号？</h2>
        <br/>
        <a class="reg_login" href="index"></a> </div>
    </form>
  </div>
</div>
</body>
</html>
