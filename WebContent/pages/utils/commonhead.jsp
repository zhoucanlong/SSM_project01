 <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
  <header class="main-header">
    <!-- Logo -->
    <a href="../../index2.html" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>STUDENT</b>SYSTEM</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>STUDENT</b>SYSTEM</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </a>
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- User Account: style can be found in dropdown.less -->
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <img src="../../assert/dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
              <span class="hidden-xs">周灿隆</span>
            </a>
            <ul class="dropdown-menu">
              <!-- User image -->
              <li class="user-header">
                <img src="<%=request.getContextPath()%>/assert/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                <p>
                                      欢迎使用学生管理系统
                  <small>Member since July. 2020</small>
                </p>
              </li>
              <!-- Menu Body -->

              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-right">
                  <a href="login.jsp" class="btn btn-default btn-flat">退出登录</a>
                </div>
              </li>
            </ul>
          </li>
          <!-- Control Sidebar Toggle Button -->
          <li>
            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
          </li>
        </ul>
      </div>
    </nav>
</header>