<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.zhou.bean.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>学生成绩管理系统</title>
 <jsp:include page="/pages/utils/commonslink.jsp"/>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

 <jsp:include page="/pages/utils/commonhead.jsp"/>
 <jsp:include page="/pages/utils/commonleftaside.jsp"/>       
   <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        成绩管理
        <small>advanced tables</small>
      </h1>
    </section>


    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">学生信息管理</h3>
            </div>
            
            <table id="example2" class="table table-bordered table-hover">
            	
              <!-- 学号搜索 -->
            	<tr>
			      <form action="<%=request.getContextPath()%>/studentscorecontroller/getssbbynum" method="get" class="sidebar-form">
			        <div class="input-group">
			         <td>
			         	<input type="text" name="stuNum" class="form-control" placeholder="学号搜索...">
			         </td>
			         
			         <td>
			         	   <span class="input-group-btn">
			                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
			                </button>
			              </span>
			         </td>
			        </div>
			      </form>
            	</tr>
               
                <!-- ctcid搜索 -->
               	<tr>
			      <form action="<%=request.getContextPath()%>/studentscorecontroller/getssbbynum" method="get" class="sidebar-form">
			        <div class="input-group">
			          <td>
			          	 <input type="text" name="ctcid" class="form-control" placeholder="ctcid搜索...">
			          </td>
			          
			     	  <td>
			          	  <span class="input-group-btn">
			                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
			                </button>
			              </span>
			          </td>
			        </div>
			      </form>
            	</tr>
        		<tr>
            	<form action="<%=request.getContextPath()%>/studentscorecontroller/getallssb" method="post" class="sidebar-form">
            		<td>
            			<input type="submit" class="btn btn-block btn-info" value="显示全部学生信息">
            		</td>
            	</form>
            	</tr>
            </table>
 
            
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example2" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>学号</th>
                  <th>ctcid</th>
                  <th>分数</th>
                  <th>学期</th>
                  <th>操作</th>>
                </tr>
                </thead>
				<tbody>
				<c:forEach items="${studentScoreBis}" var="ssb">
				<tr>
                  <th>${ssb.stuNum}</th>
                  <th>${ssb.ctcid}</th>
                  <th>${ssb.score}</th>
                  <th>${ssb.term}</th>
                  <th>
                  	<a href="<%=request.getContextPath()%>/studentscorecontroller/dispatchupdate?stuNum=${ssb.stuNum}&&ctcid=${ssb.ctcid}">修改</a>
                  	<a href="<%=request.getContextPath()%>/studentscorecontroller/deletessb?stuNum=${ssb.stuNum}&&ctcid=${ssb.ctcid}">删除</a>
                  </th>>
                </tr>
				
				</c:forEach>

				</tbody>
              </table>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
          
          </div>
          <!-- /.box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  
 </div>
 <jsp:include page="/pages/utils/commondfoot.jsp"></jsp:include>
</body>
</html>