<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>学生成绩管理系统</title>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <jsp:include page="/pages/utils/commonslink.jsp"></jsp:include>
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    <a href="../../index2.html"><b>学生成绩</b>管理系统</a>
  </div>
  <!-- /.login-logo -->
  <div class="login-box-body">
    <p class="login-box-msg">管理员登录</p>

    <form action="LoginServlet" method="post">
      <div class="form-group has-feedback">
        <input type="text" name="name" class="form-control" placeholder="账号：">
      </div>
      <div class="form-group has-feedback">
        <input type="password" name="password" class="form-control" placeholder="密码：">
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="row">
        <div class="col-xs-8">
          <div class="checkbox icheck">
            <label>
              <input type="checkbox"> 记住密码
            </label>
          </div>
        </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
        </div>
        <!-- /.col -->
      </div>
    </form>

    <!-- /.social-auth-links -->

  </div>
</div>
<!-- /.login-box -->

<jsp:include page="/pages/utils/commondfoot.jsp"></jsp:include>
</body>
</html>