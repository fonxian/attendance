<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>登录-科大课堂点名系统</title>


    <link href="${rc.contextPath}/common/css/bootstrap.min.css" rel="stylesheet">


    <link href="${rc.contextPath}/common/css/signin.css" rel="stylesheet">


    <script src="${rc.contextPath}/common/js/ie-emulation-modes-warning.js"></script>

  </head>

  <body>

    <div class="container">

      <form action="teacher/login" method="post" class="form-signin">
        <h2 class="form-signin-heading">请登录</h2>
        <label for="inputEmail" class="sr-only">用户名</label>
        <input type="email" id="inputEmail" name="username" class="form-control" placeholder="用户名（邮箱）" required autofocus>
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="密码" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 记住密码
          </label>
        </div>
        <button id="login" class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form>
    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="common/js/ie10-viewport-bug-workaround.js"></script>
  </body>
  	<script>
	$(document).ready(function(){
		$("#login").click(function(){
			var username = $('#inputEmail').val();
			var password = $('#inputPassword').val();
			$.ajax({
				type:"POST",
				url : "${rc.contextPath}/login",
				data:{username:username,password:password},
		  		success:function(){
				    alert("登录成功！");
				}
			});
		});
	});




</script>
</html>
