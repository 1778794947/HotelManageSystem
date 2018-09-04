<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>注册</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Mattress Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.useso.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'><!--//fonts-->
<!-- start menu -->
<link href="css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>
<script src="js/simpleCart.min.js"> </script>
</head>
<body>
<!--header-->
<div class="header">
	
		<div class="container">
			<div class="head-top">
				<div class="logo">
					<a href="index.html"><img src="images/logo.png.png" height="55px"/></a>
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
										<li><a href="products.html">Bedskirt</a></li>
										<li><a href="products.html">Blanket/Throw</a></li>
										<li><a href="products.html">Collection/Duvet</a></li>
										<li><a href="products.html">Comforter</a></li>
										<li><a href="products.html">Comforter Set</a></li>
										<li><a href="products.html">Decorative Pillow</a></li>
										<li><a href="products.html">Mattress Pad </a></li>
										<li><a href="products.html">Mattress Topper</a></li>
										<li><a href="products.html">Pillow</a></li>
										<li><a href="products.html">Pillow Protector</a></li>
										
									</ul>	
								</div>							
							</div>
							
						  </div>
						</div>
					</li>
				  <li>
			     <c:if test="${ not empty user.name }"><a id="allogin" href="${pageContext.request.contextPath}/userloginout">${user.name}:退出</a></c:if>
			     <c:if test="${ empty user.name}"><a  id="unlogin" class="color4" href="login.html">登陆</a></c:if>
			     </li>
						
				<li><a class="color6" href="contact.html">联系我们</a></li>
			  </ul> 
			</div>
				
				<div class="clearfix"> </div>
		</div>
		</div>
	</div>
	<!-- grow -->
	<div class="grow">
		<div class="container">
			<h2>注册</h2>
		</div>
	</div>
	<!-- grow -->
<!--content-->
<div class=" container">
<div class=" register">
	
		  	  <form action="${ pageContext.request.contextPath}/userregister" method="post"> 
				 <div class="col-md-6 register-top-grid">
					<h3>个人信息</h3>
					 <div>
						<span>账户名：</span>
						<input type="text" name="name"/> 
					 </div>
					 <div>
						<span>真实姓名：</span>
						<input type="text" name="truename"> 
					 </div>
					 <div>
						 <span>身份证号：</span>
						 <input type="text" name="idcard"> 
					 </div>
					 
					 </div>
				     <div class="col-md-6 register-bottom-grid">
						    <h3>安全设置</h3>
							 <div>
								<span>密码：</span>
								<input type="password" name="password">
							 </div>
							 <div>
								<span>确认密码：</span>
								<input type="password" name="confirm_password">
							 </div>
							 <input type="submit" value="注册">
							
					 </div>
					 <div class="clearfix"> </div>
				</form>
			</div>
</div>

<!--//content-->
<div class="footer"  style="margin-top: 51px;">
		<div class="footer-class">
		<p>Powered By &copy; HuangYuLong 2018. All rights reserved. </p>
		</div>
		</div>
</body>
</body>
</html>
			