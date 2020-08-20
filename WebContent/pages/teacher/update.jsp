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
              <h3 class="box-title">教师信息管理</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
           	  <form action="<%=request.getContextPath()%>/teacher/updateteacher" method="post">
           	        <table id="example2" class="table table-bordered table-hover">
           	        <tr>
	                  <th><input type="text" class="form-control" name="teacherNum" placeholder="教师号:" value="${teacher.teacherNum}"></th>
	                  <th><input type="text" class="form-control" name="teacherName" placeholder="教师姓名:" value="${teacher.teacherName}"></th>
	                </tr>
	                <tr>
	                  <th><input type="text" class="form-control" name="teacherPro" placeholder="教师职称:" value="${teacher.teacherPro}"></th>
	                  <th><input type="text" class="form-control" name="teacherSalary" placeholder="教师工资:" value="${teacher.teacherSalary}"></th>
	                </tr>
	                <tr>
	                  <th><input type="text" class="form-control" name="teacherYear" placeholder="教师任教年限:" value="${teacher.teacherYear}"></th>
  	                  <th><input type="text" class="form-control" name="teacherBirth" placeholder="教师生日:（格式：1982-03-03）" value="${teacher.teacherBirth}"></th>
                    </tr>
                    <tr>
                  	   <th><input type="submit" class="btn btn-block btn-info" value="修改"></th>
                    </tr>
           	        </table>
           	  </form>
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