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
              <h3 class="box-title">班级信息管理</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
           	  <form action="<%=request.getContextPath()%>/class/addclass" method="post">
           	        <table id="example2" class="table table-bordered table-hover">
           	        <tr>
	                  <th><input type="text" class="form-control" name="classNum" placeholder="班级号:"></th>
	                  <th><input type="text" class="form-control" name="className" placeholder="班级名:"></th>
	                </tr>
	                <tr>
	                  <th><input type="text" class="form-control" name="classYear" placeholder="年级:"></th>
	                  <th><input type="text" class="form-control" name="classCount" placeholder="班级人数:"></th>
	                </tr>
	                <tr>
                      <th><input type="submit" class="btn btn-block btn-info" value="添加/修改"></th>
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