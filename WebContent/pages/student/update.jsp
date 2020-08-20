<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
            <!-- /.box-header -->
            <div class="box-body">
            <table id="example2" class="table table-bordered table-hover">
           	  <form action="<%=request.getContextPath()%>/student/updateFinish" method="post">
           	        
           	        <tr>
	                  <th><input type="text" class="form-control" name="stuNum" placeholder="学号:" value="${student.stuNum}"></th>
	                  <th><input type="text" class="form-control" name="stuName" placeholder="姓名:" value="${student.stuName}"></th>
	                </tr>
	                <tr>
	                  <th><input type="text" class="form-control" name="birth" placeholder="出生日期:（如：2017-03-20）" value="${student.birth}"></th>
	                  <th><input type="text" class="form-control" name="sex" placeholder="性别:" value="${student.sex}"></th>
	                </tr>
	                <tr>
	                  <th><input type="text" class="form-control" name="classNum" placeholder="班级:" value="${student.classNum}"></th>
                      <th><input type="submit" class="btn btn-block btn-info" value="修改"></th>
                    </tr>
           	  </form>
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