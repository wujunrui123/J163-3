<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>指挥调度后台管理</title>
	<meta name="renderer" content="webkit">	
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">	
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">	
	<meta name="apple-mobile-web-app-status-bar-style" content="black">	
	<meta name="apple-mobile-web-app-capable" content="yes">	
	<meta name="format-detection" content="telephone=no">	
	<link rel="stylesheet" type="text/css" href="common/layui/css/layui.css" media="all">
	<link rel="stylesheet" type="text/css" href="common/bootstrap/css/bootstrap.css" media="all">
	<link rel="stylesheet" type="text/css" href="common/global.css" media="all">
	<link rel="stylesheet" type="text/css" href="css/personal.css" media="all">

</head>
<script type="text/javascript" src="../jquery-2.1.4.js"></script>
<script type="text/javascript" src="common/layui/layui.js"></script>
<script type="text/javascript">
	layui.use(['form','upload'],function(){
         var form = layui.form();
	});
	
	$(function(){
		$.getJSON("../getUserByUserid.lovo", callBack);
		$("button[name=tijiao]").click(clickEvt);
		$("button[name=chongzhi]").click(chongzhi);
	});
	
	function callBack(data){
		$("input[name=title]").val(data.userName);
	}
	function clickEvt(){
		var password = $("input[name=password]").val();
		var newpwd = $("input[name=newpwd]").val();
		var rnewpwd = $("input[name=rnewpwd]").val();
		$.post("../updatePasswordById.lovo",
				{password:password,newpwd:newpwd,rnewpwd:rnewpwd},
				function(data){
					if(data.value.equals("0")){
						alert("旧密码输入错误");
					}
					if(data.equals("2")){
						alert("两次密码输入不一致");
					}
					if(data.equals("1")){
   	     				alert("修改成功");
					}
	     		}),"json"
	}
	
	function chongzhi(){
		$("input[name=password]").val("");
		$("input[name=newpwd]").val("");
		$("input[name=rnewpwd]").val("");
	}
</script>
<body>
<section class="layui-larry-box">
	<div class="larry-personal">
		<header class="larry-personal-tit">
			<span>修改密码</span>
		</header><!-- /header -->
		<div class="larry-personal-body clearfix changepwd">
			<form class="layui-form col-lg-4" method="post" action="">
			 	<div class="layui-form-item">
					<label class="layui-form-label">用户名</label>
					<div class="layui-input-block">  
					  	<input type="text" name="title"  autocomplete="off"  class="layui-input layui-disabled" value="${user.userName }" disabled="disabled" >
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">旧密码</label>
					<div class="layui-input-block">  
					  	<input type="password" name="password"  autocomplete="off"  class="layui-input" placeholder="请输入旧密码">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">新密码</label>
					<div class="layui-input-block">  
					  	<input type="password" name="newpwd"  autocomplete="off"  class="layui-input" placeholder="请输入新密码">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">确认密码</label>
					<div class="layui-input-block">  
					  	<input type="password" name="rnewpwd"  autocomplete="off"  class="layui-input" placeholder="请输入确认新密码">
					</div>
				</div>
				<div class="layui-form-item change-submit">
					<div class="layui-input-block">
						<button class="layui-btn" lay-submit="" lay-filter="demo1" name="tijiao">立即提交</button>
						<button type="reset" class="layui-btn layui-btn-primary" name="chongzhi">重置</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</section>
</body>
</html>