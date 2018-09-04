<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<title>全部订单</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Mattress Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>

<!-- start menu -->
<link href="${pageContext.request.contextPath}/css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>
<script src="${pageContext.request.contextPath}/js/simpleCart.min.js"> </script>
<script type="text/javascript">
function editReserve(id) {
	$.ajax({
		type:"get",
		url:"${pageContext.request.contextPath}/editReserve",
		data:{"id":id},
		success:function(data) {
		    $("#fill").show();
			$("#myform").show();
			$("#id").val(data.id);
			$("#name").val(data.name);
			$("#phone").val(data.phone);
			$("#roomtype").val(data.roomtype);
			$("#arraytime").val(data.arraytime);
			$("#leavetime").val(data.leavetime);
		}
	});
}
function updateReserve(form) {
	$.post("${pageContext.request.contextPath}/updateReserve",$(form).serialize(),function(data){
		if(data=='ok'){
			alert("订单更新成功！");
			window.location.reload();
		}
		else{
			alert("订单修改失败");
		}
	});
}

function deleteReserve(id) {
	if(confirm('确实要删除该订单吗?')) {
		var url="${pageContext.request.contextPath}/deleteReserve";
		var args={"id":id};
		$.post(url,args,function(data){
			if(data=='ok'){
				alert("订单删除更新成功！");
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
<body>
	<div class="header">

		<div class="container">
			<div class="head-top">
				<div class="logo">
					<a href="index.html"><img src="images/logo.png.png"
						height="55px" /></a>
				</div>
				<div class=" h_menu4">
					<ul class="memenu skyblue">
						<li><a class="color8" href="index.html">我的订单</a></li>
						<li><a class="color1" href="#">全部房型</a>
							<div class="mepanel">
								<div class="row">
									<div class="col1">
										<div class="h_nav">
											<ul>
												<li><a href="products.html">标准间</a></li>
												<li><a href="products.html">单人间</a></li>
												<li><a href="products.html">顶级套房</a></li>
												<li><a href="products.html">主题套房</a></li>
												<li><a href="products.html">长期租房</a></li>

											</ul>
										</div>
									</div>

								</div>
							</div></li>
						<li><c:if test="${ not empty user.name }">
								<a id="allogin"
									href="${pageContext.request.contextPath}/userloginout">${user.name}:退出</a>
							</c:if> <c:if test="${ empty user.name}">
								<a id="unlogin" class="color4" href="login.html">登陆</a>
							</c:if></li>

						<li><a class="color6" href="contact.html">联系我们</a></li>
					</ul>
				</div>

				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<div class="grow">
		<div class="container">
			<h2>预定信息</h2>
		</div>
	</div>
	<!--content-->
	<div class="container">
		<div class="account">
			<div class="account-pass">
				<table class="table table-responsive table-bordered table-hover">
					<tr>
						<th>预定姓名</th>
						<th>手机号</th>
						<th>预定房间</th>
						<th>到店时间</th>
						<th>离店时间</th>
						<th>订单操作</th>
					</tr>

					<c:forEach items="${requestScope.reserves}" var="reserve">
						<tr>
							<td>${reserve.name }</td>
							<td>${reserve.phone }</td>
							<td>${reserve.roomtype }</td>
							<td><fmt:formatDate value="${reserve.arraytime }" pattern="yyyy-MM-dd"/>
							</td>
							<td><fmt:formatDate value="${reserve.leavetime }" pattern="yyyy-MM-dd"/></td>
							<td><a href="#" onclick="deleteReserve(${reserve.id})">删除</a>/<a
								href="#" onclick="editReserve(${reserve.id})">修改</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>

		<div id="fill"
			style="width: 100%; height: 100%; background-color: #000; position: absolute; top: 0px; left: 0px; opacity: 0.3; display: none; z-index: 100"></div>
		<div id="myform"
			style="width: 100%; height: 100%; position: absolute; top: 0px; left: 0px; z-index: 101; display: none; background:#FFF">
			<form action="" method="post" onsubmit="return updateReserve(this)"
				id="form1">
				<table class="table table-responsive table-bordered table-hover"
					style="width: 60%;  background:#FFF  margin: 20% auto;">
					<tr>
						<td><input type="text" name="id" id="id" readonly="readonly" /></td>
					</tr>
					<tr>
						<td><input type="text" name="name" id="name" /></td>
					</tr>
					<tr>
						<td><input type="text" name="phone" id="phone" /></td>
					</tr>
					<tr>
						<td><input type="text" name="roomtype" id="roomtype" /></td>
					</tr>
					<tr>
						<td><input type="date" name="arraytime" id="arraytime" /></td>
					</tr>
					<tr>
						<td><input type="date" name="leavetime" id="leavetime" /></td>
					</tr>
					<tr>
						
						<td><input class="btn btn-default" type="submit" value="保存修改" /> <input class="btn btn-default" type="reset"
							value="重置" /></td>
					</tr>
				</table>
			</form>
		</div>
		
	</div>
	<!--//content-->
	<div class="footer" style="margin-top: 51px;">
		<div class="footer-class">
			<p>Powered By &copy; HuangYuLong 2018. All rights reserved.</p>
		</div>
	</div>
</body>
</html>
