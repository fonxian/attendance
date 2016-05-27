<!DOCTYPE html>
<html class="login-alone">
    <head>
        <title>科大课堂点名系统-登录</title>
		<meta name="keywords" content="科大课堂点名系统" />
		<meta name="description" content="科大课堂点名系统" />
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
        <link rel="shortcut icon" type="image/x-icon" href="${rc.contextPath}/common/img/favicon.ico?v=3.9" />
        <link href="${rc.contextPath}/common/css/screen.css?v=3.9" media="screen, projection" rel="stylesheet" type="text/css" >
        <link rel="stylesheet" type="text/css" href="${rc.contextPath}/common/css/base.css?v=3.9">
        <link rel="stylesheet" type="text/css" href="${rc.contextPath}/common/css/login.css?v=3.9">
        <!--[if lt IE 9]>
        <script>
        window.location="homepage/support";
        </script>
        <![endif]-->
    </head>
    <body>
        <div class="logina-logo" style="height: 55px">
            <a href="">
                <img src="${rc.contextPath}/common/img/toplogo.png?v=3.9" height="60" alt="">
            </a>
        </div>
        <div class="logina-main main clearfix">
            <div class="tab-con">
                <form id="form-login" method="post" action="teacher/login">
                    <div id='login-error' class="error-tip"></div>
                    <table border="0" cellspacing="0" cellpadding="0">
                        <tbody>
                            <tr>
                                <th>账户</th>
                                <td width="245">
                                    <input id="email" type="text" name="username" placeholder="电子邮箱" autocomplete="off" value=""></td>
                                <td>
                                </td>
                            </tr>
                            <tr>
                                <th>密码</th>
                                <td width="245">
                                    <input id="password" type="password" name="password" placeholder="请输入密码" autocomplete="off">
                                </td>
                                <td>
                                </td>
                            </tr>
                            <tr id="tr-vcode" style="display:none;" >
                                <th>验证码</th>
                                <td width="245">
                                    <div class="valid">
                                        <input type="text" name="vcode"><img class="vcode" src="${rc.contextPath}/common/img/vcode?_=1411476793" width="85" height="35" alt="">
                                    </div>
                                </td>
                                <td>
                                </td>
                            </tr>
                            <tr class="find">
                                <th></th>
                                <td>
                                    <div>
                                        <label class="checkbox" for="chk11"><input style="height: auto;" id="chk11" type="checkbox" name="remember_me" >记住我</label>
                                        <a href="passport/forget-pwd">忘记密码？</a>
                                    </div>
                                </td>
                                <td></td>
                            </tr>
                            <tr>
                                <th></th>
                                <td width="245"><input class="confirm" type="submit" value="登  录"></td>
                                <td></td>
                            </tr>
                        </tbody>
                    </table>
                    <input type="hidden" name="refer" value="site/">
                </form>
            </div>
            <div class="reg">
                <p>还没有账号？<br>赶快免费注册一个吧！</p>
                <a class="reg-btn" href="register">立即免费注册</a>
            </div>
        </div>
        <div id="footer">
            <div class="copyright">Copyright © 2016 yanghongsong.cn. All Rights Reserved. Hongsong Yang 版权所有</div>
        </div>
        <script src="${rc.contextPath}/common/js/jquery-1.12.2.js"></script>
    </body>
</html>
