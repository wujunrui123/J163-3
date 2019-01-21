<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>修改事件</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="./css/x-admin.css" media="all">
</head>

<body>
	<div class="x-body">
		<form class="layui-form">
			<div class="layui-form-item">
				<label for="role" class="layui-form-label"> 事件类型 </label> <label
					for="role" class="layui-form-label">
					${thingEntity.thingType} </label>
			</div>

			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> 事件名称 </label> <label
					for="username" class="layui-form-label">
					${thingEntity.thingName} </label>
			</div>
			<div class="layui-form-item">
				<label for="role" class="layui-form-label"> 发生区域 </label> <label
					for="role" class="layui-form-label"> ${thingEntity.area} </label>
			</div>

			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>详细地址
				</label>
				<div class="layui-input-inline">
					<input type="text" id="address" name="address" required=""
						lay-verify="required" autocomplete="off" class="layui-input"
						value="${thingEntity.address}">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red">*</span>请输入本市地址
				</div>
			</div>

			<div class="layui-form-item">
				<label for="role" class="layui-form-label"> <span
					class="x-red">*</span>等级
				</label>
				<div class="layui-input-inline">

					<select class='sel' id="grade">
						<option value="">${thingEntity.grade}</option>
						<c:forEach var="n" items="${list2}">

							<option value="${n.value}">${n.value}</option>

						</c:forEach>
					</select>

				</div>
			</div>

			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>上报人员</label>
				<div class="layui-input-inline">
				<input type="text" id="updateName" name="updateName" required=""
						lay-verify="required" autocomplete="off" class="layui-input"
						value="${thingEntity.uploadName}">
				</div>
			</div>

			<div class="layui-form-item">
				<label for="peopleNum" class="layui-form-label"> 伤亡人数
				</label>
				<label for="peopleNum" class="layui-form-label"> 
				${thingEntity.peopleNum}
				</label>
				
			</div>








			<div class="layui-form-item">
				<label for="phone" class="layui-form-label"> 
				报警人员电话
				</label>
				<label for="phone" class="layui-form-label"> 
				${thingEntity.phone}
				</label>
				
			</div>

			<div class="layui-form-item">
				<label for="username" class="layui-form-label">报警人员
				</label>
				<label for="username" class="layui-form-label">${thingEntity.callName}
				</label>
			</div>

			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> 上报时间
				</label>
				<label for="username" class="layui-form-label">
					${thingEntity.uploadDate}	
				</label>
			</div>

			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> 报警时间
				</label>
				<label for="username" class="layui-form-label">
					${thingEntity.callDate}	
				</label>
			</div>

			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> 事件编号
				</label> <label for="username" class="layui-form-label">${thingEntity.thingCard}</label>

			</div>

			<div class="layui-form-item">
				<label for="role" class="layui-form-label"> 事件状态
				</label>
				<label for="role" class="layui-form-label">${thingEntity.thingState}
				</label>
			</div>



			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label>
				<button class="layui-btn" lay-filter="add" lay-submit="">
					修改</button>
			</div>
		</form>
	</div>
	<script src="./lib/layui/layui.js" charset="utf-8">
		
	</script>
	<script src="./js/x-layui.js" charset="utf-8">
		
	</script>
	<script>
		layui.use([ 'form', 'layer' ], function() {
			$ = layui.jquery;
			var form = layui.form(), layer = layui.layer;

			//自定义验证规则
			form.verify({
				nikename : function(value) {
					if (value.length < 5) {
						return '昵称至少得5个字符啊';
					}
				},
				pass : [ /(.+){6,12}$/, '密码必须6到12位' ],
				repass : function(value) {
					if ($('#L_pass').val() != $('#L_repass').val()) {
						return '两次密码不一致';
					}
				}
			});

			//监听提交
			form.on('submit(add)', function(data) {
				console.log(data);
				//发异步，把数据提交给php
				layer.alert("增加成功", {
					icon : 6
				}, function() {
					// 获得frame索引
					var index = parent.layer.getFrameIndex(window.name);
					//关闭当前frame
					parent.layer.close(index);
				});
				return false;
			});

		});
	</script>

</body>

</html>