<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/app/js/jquery-3.2.1.js"></script>
<link href="${pageContext.request.contextPath}/app/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="${pageContext.request.contextPath}/app/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script>
function editManager(id) {
	$.ajax({
		type:"get",
		url:"${pageContext.request.contextPath}/editmanager",
		data:{"mId":id},
		success:function(data) {
		    $("#fill").show();
			$("#myform").show();
			$("#id").val(data.mId);
			$("#username").val(data.mName);
			
			$("#password").val(data.mPsd);
			
		},
		error:function(){alert("defeat");}
	});
}
function updateManager(form) {
	$.post("${pageContext.request.contextPath}/updatemanager",$(form).serialize(),function(data){
		if(data=='ok'){
			alert("客户更新成功！");
			window.location.reload();
		}
		else{
			alert("修改失败");
		}
	});
}

function deleteManager(mid) {
	if(confirm('确实要删除该客户吗?')) {
		var url="${pageContext.request.contextPath}/deletemanager";
		var args={"mId":mid};
		$.post(url,args,function(data){
			if(data=='ok'){
				alert("客户删除更新成功！");
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
	当前用户:${manager.mName}<a href="${pageContext.request.contextPath}/loginout">退出</a><br>
	<table class="table table-hover table-striped">
		<tr>
			<td>管理员ID</td>
			<td>管理员名称</td>
			<td>删除管理员</td>
			<td>修改密码</td>
			
		</tr>
		<c:forEach items="${requestScope.list}" var="manager">
			<tr>
				<td>${manager.mId }</td>
				<td>${manager.mName }</td>
				
				<td><a href="#" onclick="deleteManager(${manager.mId})">删除</a></td>
				<td><a href="#" onclick="editManager(${manager.mId})">修改</a></td>
			</tr>
		</c:forEach>
	</table>
	<div id="fill" style="width: 100%; height: 100%; background-color: #000; position: absolute; top: 0px; left: 0px; opacity: 0.3; display: none; z-index: 100"></div>
	<div id="myform" style="width: 100%; height: 100%; position: absolute; top: 0px; left: 0px; z-index: 101; display: none">
		<form action="" method="post" onsubmit="return updateManager(this)" id="form1">
			<table width="340" border="0"
				style="margin: 20% auto; background-color: #fff">
				
				<tr>
				<td><input type="text" name="mId"  id="id" readonly="readonly" /></td>
				</tr>
				
				<tr>
				<td><input type="text" name="mName"  id="username"/></td>
				</tr>
				
				<tr>
				<td><input type="password" name="mPsd"  id="password"/></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="保存修改"  /> </td>
					<td><input type="reset"
						value="重置" /></td>
				</tr>
			</table>
		</form>
		</div>
</body>
</html>