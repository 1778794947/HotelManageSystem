<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>登陆</title>
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
				    
				<li><a class="color4" href="login.html">登陆</a></li>				
				<li><a class="color6" href="contact.html">联系我们</a></li>
			  </ul> 
			</div>
				
				<div class="clearfix"> </div>
		</div>
		</div>
	</div>
<div class="grow">
		<div class="container">
			<h2>登陆</h2>
		</div>
	</div>
<!--content-->
<div class="container">
		<div class="account">
		<div class="account-pass">
		<div class="col-md-8 account-top" style="top: 150px;">
			<form action="${ pageContext.request.contextPath}/userlogin" method="post">
				
			<div> 	
				<span>账号</span>
				<input type="text" name="name"> 
			</div>
			<div> 
				<span >密码</span>
				<input type="password" name="password">
			</div>				
				<input type="submit" value="登陆"> 
			</form>
		</div>
		<div class="col-md-4 left-account ">
			<a href="single.html"><img class="img-responsive " src="images/s1.jpg" alt=""></a>
			<div class="five">
			<h2>八 </h2><span>折</span>
			</div>
			<a href="register.html" class="create">注册一个账户来登陆</a>
<div class="clearfix"> </div>
		</div>
	<div class="clearfix"> </div>
	</div>
	</div>

</div>

<!--//content-->
<div class="footer"  style="margin-top: 51px;">
		<div class="footer-class">
		<p>Powered By &copy; HuangYuLong 2018. All rights reserved. </p>
		</div>
		</div>
</body>
</html>
			