<%@page import="com.lovo.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>修改人员</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="./css/x-admin.css" media="all">
<script type="text/javascript" src="../jquery-2.1.4.js"></script>
<script type="text/javascript">
</script>
<% 
	UserBean ub=(UserBean)request.getSession().getAttribute("UserBean");
	String sex=ub.getSex();
	if("1".equals(sex)){
		sex="男";
	}else{
		sex="女";
	}
%>
</head>

<body>
	<div class="x-body">
		<form class="layui-form" action="../updateMe.lovo" method="post">


			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> 姓名 </label> <label
					for="username" class="layui-form-label"> <%=ub.getName()%> </label>

			</div>
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> 用户名 </label> <label
					for="username" class="layui-form-label"> <%=ub.getUserName()%> </label>

			</div>
			<div class="layui-form-item">
				<label for="password" class="layui-form-label"> <span
					class="x-red">*</span>密码
				</label>
				<div class="layui-input-inline">
					<input type="password" id="password" name="password" required=""
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red">*</span>请正确输入
				</div>
			</div>



			<div class="layui-form-item">
				<label for="sex" class="layui-form-label"> 性别 </label> <label
					for="sex" class="layui-form-label"> <%=sex%> </label>
			</div>
			
			
			<div class="layui-form-item">
				<label for="phone" class="layui-form-label"> 联系方式 </label> <label
					for="phone" class="layui-form-label"> <%=ub.getPhone()%> </label>

			</div>
			
			<div class="layui-form-item">
				<label for="role" class="layui-form-label"> 职位 </label> <label
					for="role" class="layui-form-label"> XXX </label>

			</div>







			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label>
				<input type="submit" value="修改" class="layui-btn" lay-filter="add" lay-submit="">
			</div>
		</form>
	</div>
	<script src="./lib/layui/layui.js" charset="utf-8">
		
	</script>
	<script src="./js/x-layui.js" charset="utf-8">
		
	</script>


</body>

</html>