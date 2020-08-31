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
 <jsp:include page="/pages/utils/teachercommonleftaside.jsp"/>       
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
              <h3 class="box-title">必修课信息</h3>
            </div>
            
            <table id="example2" class="table table-bordered table-hover">
            	
            	<tr>
			      <form action="<%=request.getContextPath()%>/utb/getutbbynum" method="post" class="sidebar-form">
			        <div class="input-group">
			         <td>
			         	<input type="text" name="courseNum" class="form-control" placeholder="课程号搜索...">
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
               
                <!-- 学生名搜索 -->
               	<tr>
			      <form action="<%=request.getContextPath()%>/utb/getutbbynum" method="post" class="sidebar-form">
			        <div class="input-group">
			          <td>
			          	 <input type="text" name="stuName" class="form-control" placeholder="学生名搜索...">
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
        		
        		<!--班级号搜索  -->
               	<tr>
		            <form action="<%=request.getContextPath()%>/utb/getutbbynum" method="post" class="sidebar-form">
				        <div class="input-group">
				          <td>
				          	  <input type="text" name="classNum" class="form-control" placeholder="班级号搜索...">
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
            	  <form action="<%=request.getContextPath()%>/utx/getallutb" method="post" class="sidebar-form">
            		<td>
            			<input type="submit" class="btn btn-block btn-info" value="显示全部必修信息">
            		</td>
            	</form>
            	</tr>
            </table>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example2" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>课程号</th>
                  <th>课程名</th>
                  <th>班级号</th>
                  <th>学生名</th>
                  <th>学生号</th>
                  <th>成绩</th>
                  <th>操作</th>
                  <th>学分</th>
                  <th>学期</th>
                </tr>
                </thead>
				<tbody>
				<c:forEach items="${utbs}" var="utb">
					<tr>
	                  <th>${utb.courseNum}</th>
	                  <th>${utb.courseName}</th>
	                  <th>${utb.classNum}</th>
	                  <th>${utb.stuName}</th>
	                  <th>${utb.stuNum}</th>
	                  <form action="<%=request.getContextPath()%>/utb/updatescore" method="post">
	                  	 <input type="hidden" name="courseNum" value="${utb.courseNum}"/>
	            		 <input type="hidden" name="courseName" value="${utb.courseName}"/>
	            		 <input type="hidden" name="classNum" value="${utb.classNum}"/>
	            		 <input type="hidden" name="stuName" value="${utb.stuName}"/>
	            		 <input type="hidden" name="stuNum" value="${utb.stuNum}"/>
	            		 <input type="hidden" name="courseCredit" value="${utb.courseCredit}"/>
	            		 <input type="hidden" name="term" value="${utb.term}"/>
	              		 <th><input type="text" name="score" class="form-control" value="${utb.score}"></th>
	                  	 <th><input type="submit" class="btn btn-block btn-info" value="修改"></th>
	                  </form>
	                  <th>${utb.courseCredit}</th>
	                  <th>${utb.term}</th><th>
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