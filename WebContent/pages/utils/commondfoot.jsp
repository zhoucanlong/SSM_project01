<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 1.0.0
    </div>
    <strong>Copyright &copy; 2020-2025 <a href="https://adminlte.io">周灿隆</a>.</strong> All rights
    reserved.
  </footer>
<!-- jQuery 3 -->
<script src="<%=request.getContextPath()%>/assert/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="<%=request.getContextPath()%>/assert/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="<%=request.getContextPath()%>/assert/plugins/iCheck/icheck.min.js"></script>

 <!-- jQuery 3 -->
<script src="<%=request.getContextPath()%>/assert/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="<%=request.getContextPath()%>/assert/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- DataTables -->
<script src="<%=request.getContextPath()%>/assert/bower_components/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="<%=request.getContextPath()%>/assert/bower_components/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
<!-- SlimScroll -->
<script src="<%=request.getContextPath()%>/assert/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="<%=request.getContextPath()%>/assert/bower_components/fastclick/lib/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="<%=request.getContextPath()%>/assert/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="<%=request.getContextPath()%>/assert/dist/js/demo.js"></script>
<!-- page script -->
<script>
  $(function () {
    $('#example1').DataTable()
    $('#example2').DataTable({
      'paging'      : true,
      'lengthChange': false,
      'searching'   : false,
      'ordering'    : true,
      'info'        : true,
      'autoWidth'   : false
    })
  })
</script>
<script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' /* optional */
    });
  });
</script>