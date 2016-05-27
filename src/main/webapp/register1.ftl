<!DOCTYPE html>
<html>
<head>
<title>科大点名系统-注册</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<meta name="keywords" content="科大点名系统">
<meta name="description" content="科大点名系统">
<link rel="shortcut icon" href="${rc.contextPath}/common/img/favicon.ico" />
<link href="${rc.contextPath}/common/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body class="loginbody">
<div class="dataEye">
	<div class="loginbox registbox">
		<div class="logo-a">
			<a href="login.jsp" title="js代码网">
				<img src="${rc.contextPath}/common/img/logo-a.png">
			</a>
		</div>
		<div class="login-content reg-content">
			<div class="loginbox-title">
				<h3>注册</h3>
			</div>
			<form id="signupForm" action="teacher/register" method="post">
			<div class="login-error"></div>
			<div class="row">
				<label class="field" for="email">注册邮箱</label>
				<input type="text" value="" class="input-text-user noPic input-click" name="username" id="username">
			</div>
			<div class="row">
				<label class="field" for="password">密码</label>
				<input type="password" value="" class="input-text-password noPic input-click" name="password" id="password">
			</div>
			<div class="row">
				<label class="field" for="passwordAgain">确认密码</label>
				<input type="password" value="" class="input-text-password noPic input-click" name="passwordAgain" id="passwordAgain">
			</div>
			<div class="row">
				<label class="field" for="contact">真实姓名</label>
				<input type="text" value="" class="input-text-user noPic input-click" name="realname" id="realname">
			</div>
			<div class="row">
				<label class="field" for="company">性别 (男输入1，女输入2)</label>
				<input type="text" value="" class="input-text-user noPic input-click" name="sex" id="sex">
			</div>
			<div class="row">
				<label class="field" for="tel">电话</label>
				<input type="text" value="" class="input-text-user noPic input-click" name="tel" id="tel">
			</div>
			<div class="row">
				<label class="field" for="qq">学院编号</label>
				<input type="text" value="" class="input-text-user noPic input-click" name="school_id" >
			</div>
			<div class="row tips">
				<input type="checkbox" id="checkBox">
				<label>
				我已阅读并同意
				<a href="#" target="_blank">隐私政策、服务条款</a>
				</label>
			</div>
			<div class="row btnArea">
				<button class="login-btn" type="submit" id="submit">注册</a>
			</div>
			</form>
		</div>
		<div class="go-regist">
			已有帐号,请<a href="index" class="link">登录</a>
		</div>
	</div>
	
<div id="footer">
	<div class="dblock">
		<div class="inline-block"><img src="${rc.contextPath}/common/img/logo-gray.png"></div>
		<div class="inline-block copyright">
			<p><a href="#">关于我们</a> | <a href="#">微博</a> | <a href="#">隐私政策</a> | <a href="#">人员招聘</a></p>
			<p> Copyright © 2016 yanghongsong</p>
		</div>
	</div>
</div>
</div>
</body>
</html>

