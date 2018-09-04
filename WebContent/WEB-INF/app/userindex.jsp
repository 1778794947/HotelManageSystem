<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/app/js/jquery-3.2.1.js"></script>
<link
	href="${pageContext.request.contextPath}/app/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet" media="screen">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/app/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<title>欢迎您</title>
</head>
<body>
当前用户:${manager.mName}<a href="${pageContext.request.contextPath}/loginout">退出</a><br>

<table>
	<tr></tr>
</table>
</body>
</html>