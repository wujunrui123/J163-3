<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>交接班</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" type="text/css" href="common/layui/css/layui.css"
	media="all">
<link rel="stylesheet" type="text/css"
	href="common/bootstrap/css/bootstrap.css" media="all">
<link rel="stylesheet" type="text/css" href="common/global.css"
	media="all">
<link rel="stylesheet" type="text/css" href="css/personal.css"
	media="all">
<script type="text/javascript" src="../jquery-2.1.4.js"></script>
<script type="text/javascript">

</script>
<style type="text/css">
.sel {
	height: 36px;
	width: 123px;
}

.qqq {
	font-size: 18px;
	text-align: center;
}

table {
	position: relative;
	left: 30%;
}
</style>

</head>
<body>
	
			<div>
			<form action="../jiaojieban.lovo" method="post">
				<!-- 操作日志 -->
				<div>
					<div class="qqq"><br><br><br><br>
						填写日志:<br>
						<div class="layui-input-inline">
							<input name=log  placeholder="请输入日志"
								class="layui-input search_input" type="text"
								style="width: 500px; height: 60px;">
						</div>
						<br>
						<br>
						<br> 交班人员:
						<div class="layui-input-inline">
									<span>${UserBean.name}</span>
						</div><br><br>
						密码:
						<div class="layui-input-inline">
							<input name="firstPwd" placeholder="请输入密码"
								class="layui-input search_input" type="text">
						</div><br><br>
						<br>
						<br> 接班人员:
						<div  class="layui-input-inline">
							<select name="secondName">
								<c:forEach var="u" items="${userList}">
									<option value="${u.name}">${u.name}</option>
								</c:forEach>
							</select>
						</div><br><br>
						密码:
						<div class="layui-input-inline">
							<input name="secondPwd" placeholder="请输入密码"
								class="layui-input search_input" type="text">
						</div>
						<br> <br><br><br>
						<input type="submit" value="交班" class="layui-btn search_btn">
						
					</div>

				</div>
				</form>
			</div>


	<script src="../jquery-2.1.4.js"></script>
	<script type="text/javascript" src="common/layui/layui.js"></script>

	

</body>
</html>