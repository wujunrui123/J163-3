<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>指挥调度后台管理</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="./css/x-admin.css" media="all">
</head>
<script type="text/javascript" src="../jquery-2.1.4.js"></script>
<script src="./lib/layui/layui.js" charset="utf-8"></script>
<script src="./js/x-layui.js" charset="utf-8"></script>
<script>
	$(function() {
		$.getJSON("../getUserByUserid.lovo", callBack);
		$("button").click(clickEvt);
	});

	function callBack(data) {
		var $tbody = $("tbody");
		$tbody.empty();
		$tbody.append("<tr><th width='80'>电话：</th><td><input type='text' name='tel' value="+data.tel+"></td></tr>");
		$tbody.append("<tr><th>邮箱：</th><td><input type='text' name='emil' value="+data.emil+"></td></tr>");
		$tbody.append("<tr><th>注册时间：</th><td>2018-11-11</td></tr>");
		$tbody.append("<input type='hidden' name='id' value="+data.id+">");
	}

	function clickEvt() {
		var id = $("input[name=id]").val();
		var tel = $("input[name=tel]").val();
		var emil = $("input[name=emil]").val();
		$.post("../updateUserInfoById.lovo", 
				{id : id,tel : tel,emil : emil}, 
				function (data) {
					alert("修改成功");
				}), "json"
	}
</script>
<body>
	<div class="x-body">
		<blockquote class="layui-elem-quote">
			<img src="./images/logo.png" class="layui-circle"
				style="width: 50px; float: left">
			<dl style="margin-left: 80px; color: #019688">
				<dt>
					<span>修改个人信息</span>
				</dt>
			</dl>
		</blockquote>
		<div class="pd-20">

			<table class="layui-table" lay-skin="line">
				<tbody>

				</tbody>
			</table>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label>
				<!-- lay-filter="add" lay-submit=""  -->
				<button class="layui-btn">修改</button>
			</div>

		</div>
	</div>
</body>
</html>