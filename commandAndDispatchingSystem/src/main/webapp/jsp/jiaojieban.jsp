<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<<<<<<< HEAD
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

	

=======
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>接收消息</title>
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
<style type="text/css">
.sel {
	height: 36px;
	width: 123px;
}
	.qqq{

	font-size: 18px;
	text-align: center;
	}
	table{
	position: relative;
	left: 30%;
	}
</style>
</head>
<body>
	<section class="layui-larry-box">
		<div class="larry-personal">
			<div class="layui-tab">
				<!-- 操作日志 -->
				<div class="layui-form news_list">
				<div class="qqq">
				<a class="layui-btn layui-btn-mini news_edit"
									style="font-size: 18px"><i class="iconfont icon-edit"></i>交接班管理:</a>
					<table class="layui-table" style="width: 550px">
						<colgroup>
							<col width="25%">
							<col width="25%">
								<col width="25%">
									<col width="25%">
						</colgroup>
						<br>
				<a >交班日志</a>
						<thead>
							<tr>
								<th>交班人员</th>
								<th>日志</th>
								<th>交班时间</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody class="news_content">
							<tr>
							<td>马哥</td>
							<td>XXXXXXXXXXX</td>
							<td>2011-11-11</td>
								<td><a href="#"
									class="layui-btn layui-btn-mini news_edit"
								data-url="#"><i class="iconfont icon-edit"></i>查看</a>
								</td>
							</tr>
						</tbody>
					</table>
					<div class="larry-table-page clearfix"  style="	position: relative;
	left: 30%;">
						<div id="page" class="page"></div>
					</div>
					</div>
					<div class="qqq">
					填写日志:<br><div class="layui-input-inline">
							<input value="" placeholder="请输入日志"
								class="layui-input search_input" type="text" style="width: 500px;height: 60px;">
						</div>
						<br>
							交班人员:<div class="layui-input-inline">
						<select class='sel'>
								<option>动态获取员工</option>
								
							</select>
						</div>
						交班人员密码:<div class="layui-input-inline">
							<input value="" placeholder="请输入密码"
								class="layui-input search_input" type="text">
						</div>
						<br><br>
								接班人员:<div class="layui-input-inline">
						<select class='sel'>
								<option>动态获取员工</option>
								
							</select>
						</div>
						接班人员密码:<div class="layui-input-inline">
							<input value="" placeholder="请输入密码"
								class="layui-input search_input" type="text">
						</div>
						<br>	<br><a class="layui-btn search_btn">交班</a>
				</div>
				
				</div>
				<!-- 登录日志 -->
				<div class="layui-tab-item layui-field-box">
					<table class="layui-table table-hover" lay-even="" lay-skin="nob">
						<thead>
							<tr>
								<th><input type="checkbox" id="selected-all"></th>
								<th>ID</th>
								<th>管理员账号</th>
								<th>状态</th>
								<th>最后登录时间</th>
								<th>上次登录IP</th>
								<th>登录IP</th>
								<th>IP所在位置</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><input type="checkbox"></td>
								<td>110</td>
								<td>admin</td>
								<td>后台登录成功</td>
								<td>2016-12-19 14:26:03</td>
								<td>127.0.0.1</td>
								<td>127.0.0.1</td>
								<td>Unknown</td>
							</tr>
						</tbody>
					</table>
					<div class="larry-table-page clearfix">
						<a href="javascript:;" class="layui-btn layui-btn-small"><i
							class="iconfont icon-shanchu1"></i>删除</a>
						<div id="page2" class="page"></div>
					</div>
				</div>
			</div>
		</div>

	</section>
	<script src="../jquery-2.1.4.js"></script>
	<script type="text/javascript" src="common/layui/layui.js"></script>
	<script type="text/javascript" src="js/newslist.js"></script>
	<!-- <script type="text/javascript" src="js/larry.js"></script>
<script type="text/javascript" src="js/index.js"></script> -->
	<script type="text/javascript">
		/*     $("body").on("click",".news_edit",function(){  //编辑
		 layer.alert('您点击了文章编辑按钮，由于是纯静态页面，所以暂时不存在编辑内容，后期会添加，敬请谅解。。。',{icon:6, title:'文章编辑'});
		 }) */
		layui.use([ 'jquery', 'layer', 'element', 'laypage' ], function() {
			window.jQuery = window.$ = layui.jquery;
			window.layer = layui.layer;
			var element = layui.element(), laypage = layui.laypage;

			laypage({
				cont : 'page',
				pages : 10 //总页数
				,
				groups : 5 //连续显示分页数
				,
				jump : function(obj, first) {
					//得到了当前页，用于向服务端请求对应数据
					var curr = obj.curr;
					if (!first) {
						//layer.msg('第 '+ obj.curr +' 页');
					}
				}
			});

			laypage({
				cont : 'page2',
				pages : 10 //总页数
				,
				groups : 5 //连续显示分页数
				,
				jump : function(obj, first) {
					//得到了当前页，用于向服务端请求对应数据
					var curr = obj.curr;
					if (!first) {
						//layer.msg('第 '+ obj.curr +' 页');
					}
				}
			});
		});
	</script>
>>>>>>> branch 'master' of https://github.com/wujunrui123/J163-3.git
</body>
</html>