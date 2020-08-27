<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="<%=request.getContextPath()%>/assert/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>周灿隆</p>
          <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
        </div>
      </div>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">功能菜单</li>
       
       <!--必修课信息  -->
        <li class="treeview">
          <a href="<%=request.getContextPath()%>/userStudent/userStudent.jsp">
            <i class="fa fa-dashboard"></i> <span>必修课信息</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
            <ul class="treeview-menu">
          	<li><a href="<%=request.getContextPath()%>/usb/getallusb"><i class="fa fa-circle-o"></i>必修课信息</a></li>            
          </ul>
        </li>
        
        
        <!--选修课信息  -->
        <li class="treeview">
          <a href="<%=request.getContextPath()%>/userStudent/selectmessage.jsp">
            <i class="fa fa-dashboard"></i> <span>选修课信息</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
               <li><a href="<%=request.getContextPath()%>/usx/getallusx"><i class="fa fa-circle-o"></i>选修课信息</a></li>
          </ul>
        </li>
        
        <!--课程信息管理  -->
        <li class="treeview">
          <a href="<%=request.getContextPath()%>/userStudent/selectcenter.jsp">
            <i class="fa fa-dashboard"></i> <span>选课中心</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
             <li><a href="<%=request.getContextPath()%>/usc/getallusc"><i class="fa fa-circle-o"></i>选课中心</a></li>
          </ul>
        </li>
         
		<!--数据保护操作 -->
        <li class="header">数据保护</li>
        <li><a href="#"><i class="fa fa-circle-o text-blue"></i> <span>数据备份</span></a></li>
        <li><a href="#"><i class="fa fa-circle-o text-green"></i> <span>数据恢复</span></a></li> 
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>