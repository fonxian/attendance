<html>
  <head>
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">


  </head>
  
  <body>
  注册
    <form action="teacher/register" method="post">
		<label>账号</label>
		<input type="text" name="username"> 
		<label>密码</label>
		<input type="password" name="password">
		<label>真实姓名</label>
		<input type="text" name="realname"> 
		<label>性别</label>
		<input type="text" name="sex">
		<label>电话</label>
		<input type="text" name="tel">
		<label>学院编号</label>
		<input type="text" name="school_id">
		 <input type="submit"  value="确认"> 
	</form>
  </body>
</html>
