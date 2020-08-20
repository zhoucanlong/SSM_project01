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
       
       <!--学生信息管理  -->
        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>学生信息管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
          	<li><a href="<%=request.getContextPath()%>/pages/student/student.jsp"><i class="fa fa-circle-o"></i>学生信息查询/删除</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/student/update.jsp"><i class="fa fa-circle-o"></i>学生信息修改</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/student/add.jsp"><i class="fa fa-circle-o"></i>学生信息添加</a></li>
          </ul>
        </li>
        
        
        <!--班级信息管理  -->
        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>班级信息管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
         	<li><a href="<%=request.getContextPath()%>/pages/class/class.jsp"><i class="fa fa-circle-o"></i>班级信息查询/删除</a></li>
         	<li><a href="<%=request.getContextPath()%>/pages/class/add.jsp"><i class="fa fa-circle-o"></i>班级信息添加</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/class/update.jsp"><i class="fa fa-circle-o"></i>班级信息修改</a></li>       
          </ul>
        </li>
        
        <!--课程信息管理  -->
        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>课程信息管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="<%=request.getContextPath()%>/pages/course/course.jsp"><i class="fa fa-circle-o"></i>课程信息查询/删除</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/course/add.jsp"><i class="fa fa-circle-o"></i>课程信息添加</a></li>          
            <li><a href="<%=request.getContextPath()%>/pages/course/update.jsp"><i class="fa fa-circle-o"></i>课程信息修改</a></li>          
         	
          </ul>
        </li>
        
        <!--教师信息管理  -->
        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>教师信息管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="<%=request.getContextPath()%>/pages/teacher/teacher.jsp"><i class="fa fa-circle-o"></i>课程信息查询/删除</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/teacher/addAndUpdate.jsp"><i class="fa fa-circle-o"></i>课程信息添加/修改</a></li>                 </ul>
        </li>
        
        <!--课程-教师-班级信息管理（必修）  -->
        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>课程-教师-班级（必修）</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="<%=request.getContextPath()%>/pages/ctcbi/ctcbi.jsp"><i class="fa fa-circle-o"></i>课程-教师-班级查询/删除</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/ctcbi/addAndUpdate.jsp"><i class="fa fa-circle-o"></i>课程-教师-班级添加/修改</a></li>                
          </ul>
        </li>
        
       <!--学生课程成绩信息管理（必修）  -->
        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>学生课程成绩（必修）</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="<%=request.getContextPath()%>/pages/studentScoreBi/studentscorebi.jsp"><i class="fa fa-circle-o"></i>课程-教师-班级查询/删除</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/studentScoreBi/addAndUpdate.jsp"><i class="fa fa-circle-o"></i>课程-教师-班级添加/修改</a></li>   
          </ul>
        </li>
        
        <!--课程-教师-学生信息管理 （选修） -->
        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>课程-教师-学生（选修）</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="<%=request.getContextPath()%>/pages/ctsxuan/ctsxuan.jsp"><i class="fa fa-circle-o"></i>课程-教师-学生查询/删除</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/ctsxuan/addAndUpdate.jsp"><i class="fa fa-circle-o"></i>课程-教师-学生添加/修改</a></li>   
          </ul>
        </li>
        
         <!-- 学生课程成绩信息管理（选修） -->
        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>学生课程成绩（选修）</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="<%=request.getContextPath()%>/pages/studentScoreXuan/studentScoreXuan.jsp"><i class="fa fa-circle-o"></i>课程-教师-学生查询/删除</a></li>
            <li><a href="<%=request.getContextPath()%>/pages/studentScoreXuan/addAndUpdate.jsp"><i class="fa fa-circle-o"></i>课程-教师-学生添加/修改</a></li>   
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