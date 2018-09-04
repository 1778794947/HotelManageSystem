<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
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
					  <li><a class="color8" href="${pageContext.request.contextPath}/reserveList">我的订单</a></li>	
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
	<div class="grow">
		<div class="container">
			<h2>欢迎您！</h2>
		</div>
	</div>
	<div class="banner">
		<div class="container">
			  <script src="js/responsiveslides.min.js"></script>
  <script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
  
  </script>
			<div  id="top" class="callbacks_container">
			<ul class="rslides" id="slider">
			    <li>
					
						<div class="banner-text">
							<h3>情侣主题套房 </h3>
						<p>情侣主题套房（不含早餐），单人间，隔音好，环境舒适，卫生整洁，设施齐全，欢迎入住</p>
						
						</div>
				
				</li>
				<li>
					
						<div class="banner-text">
							<h3>商务标准间  </h3>
						<p>商务标准间，双人间，空间大，隔音好，环境舒适，卫生整洁，设施齐全，欢迎入住</p>
												

						</div>
					
				</li>
				<li>
						<div class="banner-text">
							<h3>三人间</h3>
						<p>三人间，三张床，独卫，环境舒适，卫生整洁，设施齐全，地理环境优越，拎包入住</p>
								

						</div>
					
				</li>
			</ul>
		</div>

	</div>
	</div>

<!--content-->
<div class="container">
	<div class="cont">
		<div class="content">
			<div class="content-top-bottom">
				<h2>优秀房型</h2>
				<div class="col-md-6 men">
					<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/t1.jpg" alt="">
						<div class="b-wrapper">
											<h3 class="b-animate b-from-top top-in   b-delay03 ">
												<span>大床房</span>	
											</h3>
										</div>
					</a>
					
					
				</div>
				<div class="col-md-6">
					<div class="col-md1 ">
						<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/t2.jpg" alt="">
							<div class="b-wrapper">
											<h3 class="b-animate b-from-top top-in1   b-delay03 ">
												<span>情侣主题套间</span>	
											</h3>
										</div>
						</a>
						
					</div>
					<div class="col-md2">
						<div class="col-md-6 men1">
							<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/t3.jpg" alt="">
									<div class="b-wrapper">
											<h3 class="b-animate b-from-top top-in2   b-delay03 ">
												<span>豪华标准间</span>	
											</h3>
										</div>
							</a>
							
						</div>
						<div class="col-md-6 men2">
							<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/t4.jpg" alt="">
									<div class="b-wrapper">
											<h3 class="b-animate b-from-top top-in2   b-delay03 ">
												<span>经济标间</span>	
											</h3>
										</div>
							</a>
							
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="content-top">
				<h1>最新上架</h1>
				<div class="grid-in">
					<div class="col-md-3 grid-top simpleCart_shelfItem">
						<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/pi.jpg" alt="">
							<div class="b-wrapper">
								<h3 class="b-animate b-from-left    b-delay03 ">
									<span>实惠钟点房</span>
									
								</h3>
							</div>
						</a>
				

					<p><a href="single.html">豪华总统套房</a></p>
					<a href="#" class="item_add"><p class="number item_price"><i> </i>$500.00</p></a>
					</div>
					<div class="col-md-3 grid-top simpleCart_shelfItem">
						<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/pi1.jpg" alt="">
							<div class="b-wrapper">
											<h3 class="b-animate b-from-left    b-delay03 ">
												<span>北欧极简风</span>	
											</h3>
										</div>
						</a>
					<p><a href="single.html">北欧极简风</a></p>
					<a href="#" class="item_add"><p class="number item_price"><i> </i>$500.00</p></a>
					</div>
					<div class="col-md-3 grid-top simpleCart_shelfItem">
						<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/pi2.jpg" alt="">
							<div class="b-wrapper">
											<h3 class="b-animate b-from-left    b-delay03 ">
												<span>古典风</span>	
											</h3>
										</div>
						</a>
					<p><a href="single.html">古典风</a></p>
					<a href="#" class="item_add"><p class="number item_price"><i> </i>$500.00</p></a>
					</div>
					<div class="col-md-3 grid-top">
						<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="images/pi4.jpg" alt="">
							<div class="b-wrapper">
											<h3 class="b-animate b-from-left    b-delay03 ">
												<span>小家居</span>	
											</h3>
										</div>
						</a>
					<p><a href="single.html">小家居</a></p>
					<a href="#" class="item_add"><p class="number item_price"><i> </i>$500.00</p></a>
					</div>
							<div class="clearfix"> </div>
				</div>
			</div>
		</div>
	<!----->
	</div>
	<!---->
</div>
<div class="footer" style="margin-top: 51px;">
		<div class="footer-class">
		<p>Powered By &copy; HuangYuLong 2018. All rights reserved. </p>
		</div>
		</div>
</body>
</html>
			