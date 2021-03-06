<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>房间管理</title>

<meta name="description" content="" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<!-- bootstrap & fontawesome -->
<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="assets/font-awesome/4.5.0/css/font-awesome.min.css" />

<!-- page specific plugin styles -->

<!-- text fonts -->
<link rel="stylesheet" href="assets/css/fonts.googleapis.com.css" />

<!-- ace styles -->
<link rel="stylesheet" href="assets/css/ace.min.css"
	class="ace-main-stylesheet" id="main-ace-style" />

<!--[if lte IE 9]>
			<link rel="stylesheet" href="assets/css/ace-part2.min.css" class="ace-main-stylesheet" />
		<![endif]-->
<link rel="stylesheet" href="assets/css/ace-skins.min.css" />
<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />

<!--[if lte IE 9]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

<!-- inline styles related to this page -->

<!-- ace settings handler -->
<script src="assets/js/ace-extra.min.js"></script>

<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

<!--[if lte IE 8]>
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
<script type="text/javascript">
function editRoom(id) {
	$.ajax({
		type:"get",
		url:"${pageContext.request.contextPath}/editRoom",
		data:{"id":id},
		success:function(data) {
		    $("#fill").show();
			$("#myform").show();
			$("#roomnum").val(data.roomnum);
			$("#roomtype").val(data.roomtype);
			$("#price").val(data.price);
			$("#status").val(data.status);
			
		}
	});
}
function updateRoom(form) {
	$.post("${pageContext.request.contextPath}/updateRoom",$(form).serialize(),function(data){
		if(data=='ok'){
			alert("房间更新成功！");
			window.location.reload();
		}
		else{
			alert("房间修改失败");
		}
	});
}

function deleteRoom(id) {
	if(confirm('确实要删除该房间吗?')) {
		var url="${pageContext.request.contextPath}/deleteRoom";
		var args={"id":id};
		$.post(url,args,function(data){
			if(data=='ok'){
				alert("房间删除更新成功！");
				window.location.reload();
			}
			else{
				alert("删除失败");
			}
			
		});
	}
}

</script>
</head>

<body class="no-skin">
	<div id="navbar" class="navbar navbar-default          ace-save-state">
		<div class="navbar-container ace-save-state" id="navbar-container">
			<button type="button" class="navbar-toggle menu-toggler pull-left"
				id="menu-toggler" data-target="#sidebar">
				<span class="sr-only">Toggle sidebar</span> <span class="icon-bar"></span>

				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>

			<div class="navbar-header pull-left">
				<a href="index.html" class="navbar-brand"> <small> <i
						class="fa fa-leaf"></i> Peace Admin
				</small>
				</a>
			</div>

			<div class="navbar-buttons navbar-header pull-right"
				role="navigation">
				<ul class="nav ace-nav">
					<li class="light-blue dropdown-modal"><a
						data-toggle="dropdown" href="#" class="dropdown-toggle"> <img
							class="nav-user-photo" src="assets/images/avatars/user.jpg"
							alt="Jason's Photo" /> <span class="user-info"> <small>欢迎您！</small>
								${manager.mName}
						</span> <i class="ace-icon fa fa-caret-down"></i>
					</a>

						<ul
							class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
							<li><a href="#"> <i class="ace-icon fa fa-cog"></i>
									Settings
							</a></li>

							<li><a href="profile.html"> <i
									class="ace-icon fa fa-user"></i> Profile
							</a></li>

							<li class="divider"></li>

							<li><a href="${pageContext.request.contextPath}/loginout">
									<i class="ace-icon fa fa-power-off"></i> Logout
							</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<!-- /.navbar-container -->
	</div>

	<div class="main-container ace-save-state" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.loadState('main-container')
			} catch (e) {
			}
		</script>

		<div id="sidebar"
			class="sidebar                  responsive                    ace-save-state">
			<script type="text/javascript">
				try {
					ace.settings.loadState('sidebar')
				} catch (e) {
				}
			</script>


			<ul class="nav nav-list">


				<li class=""><a href="#" class="dropdown-toggle"> <i
						class="menu-icon fa fa-desktop"></i> <span class="menu-text">
							订单管理 </span>
				</a></li>

				<li class=""><a href="#" class="dropdown-toggle"> <i
						class="menu-icon fa fa-list"></i> <span class="menu-text">
							预定管理 </span>
				</a></li>

				<li class=""><a href="#" class="dropdown-toggle"> <i
						class="menu-icon fa fa-pencil-square-o"></i> <span
						class="menu-text"> 员工管理 </span>
				</a></li>

				<li class=""><a href="widgets.html"> <i
						class="menu-icon fa fa-list-alt"></i> <span class="menu-text">
							房间管理 </span>
				</a> <b class="arrow"></b></li>

				<li class=""><a href="calendar.html"> <i
						class="menu-icon fa fa-calendar"></i> <span class="menu-text">
							收入管理 </span>
				</a></li>

				<li class=""><a href="gallery.html"> <i
						class="menu-icon fa fa-picture-o"></i> <span class="menu-text">
							支出管理 </span>
				</a></li>

				<li class=""><a href="#" class="dropdown-toggle"> <i
						class="menu-icon fa fa-tag"></i> <span class="menu-text">
							日常维护 </span>
				</a></li>


			</ul>
			<!-- /.nav-list -->

			<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
				<i id="sidebar-toggle-icon"
					class="ace-icon fa fa-angle-double-left ace-save-state"
					data-icon1="ace-icon fa fa-angle-double-left"
					data-icon2="ace-icon fa fa-angle-double-right"></i>
			</div>
		</div>

		<div class="main-content">
			<div class="main-content-inner">

				<div class="page-content">


					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
								<table class="table table-responsive table-bordered table-hover">
									<tr>
										<th>房间号</th>
										<th>房间类型</th>
										<th>房间价格</th>
										<th>房间状态</th>
										
										<th>房间操作</th>
									</tr>
				
									<c:forEach items="${requestScope.rooms}" var="room">
										<tr>
											<td>${room.roomnum}</td>
											<td>${room.roomtype }</td>
											<td>${room.price }</td>
											<td>${room.status }
											</td>
											
											<td><a href="#" onclick="deleteRoom(${room.roomnum})">删除</a>/<a
												href="#" onclick="editRoom(${room.roomnum})">修改</a></td>
										</tr>
									</c:forEach>
								</table>
								<div id="fill"
			style="width: 100%; height: 100%; background-color: #000; position: absolute; top: 0px; left: 0px; opacity: 0.3; display: none; z-index: 100">
		<div id="myform"
			style="width: 100%; height: 100%; position: absolute; top: 0px; left: 0px; z-index: 101; display: none; background:#FFF">
			<form action="" method="post" onsubmit="return updateRoom(this)"
				id="form1">
				<table class="table table-responsive table-bordered table-hover"
					style="width: 60%;  background:#FFF  margin: 20% auto;">
					<tr>
						<td><input type="text" name="roomnum" id="roomnum" readonly="readonly" /></td>
					</tr>
					<tr>
						<td><input type="text" name="roomtype" id="roomtype" /></td>
					</tr>
					<tr>
						<td><input type="text" name="price" id="price" /></td>
					</tr>
					<tr>
						<td><input type="text" name="status" id="status" /></td>
					</tr>
					
					<tr>
						
						<td><input class="btn btn-default" type="submit" value="保存修改" /> <input class="btn btn-default" type="reset"
							value="重置" /></td>
					</tr>
				</table>
			</form>
		</div>
		</div>
							<!-- PAGE CONTENT ENDS -->
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.page-content -->
			</div>
		</div>
		<!-- /.main-content -->

		<div class="footer">
			<div class="footer-inner">
				<div class="footer-content">
					<span class="bigger-120"> <span class="blue bolder">Peace
							Hotel</span> Application &copy; 2017-2018
					</span>
				</div>
			</div>
		</div>

		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse"> <i
			class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
	</div>


	<script src="assets/js/jquery-2.1.4.min.js"></script>


	<script type="text/javascript">
		if ('ontouchstart' in document.documentElement)
			document
					.write("<script src='assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"/script>");
	</script>
	<script src="assets/js/bootstrap.min.js"></script>


	<script src="assets/js/ace-elements.min.js"></script>
	<script src="assets/js/ace.min.js"></script>


</body>
</html>
