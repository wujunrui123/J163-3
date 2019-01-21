<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
	
	#div3 {
		position: relative;
		left: 600px;
		top: -200px;
		width: 350px;
		height: 250px;
	}
	
	#div4 {
		position: relative;
		left: 150px;
		top: 50px;
		width: 350px;
		height: 250px;
	}
</style>
</head>
<body>

	<section class="layui-larry-box">
		<div class="larry-personal">
			<div class="layui-tab">

				<!-- 操作日志 -->
				<div class="layui-form news_list">

					<a class="layui-btn layui-btn-mini news_edit"
						style="font-size: 18px"><i class="iconfont icon-edit"></i>事件名称:<span
						style="font-size: 16px">获取</span></a> <a
						class="layui-btn layui-btn-mini news_edit" style="font-size: 18px"><i
						class="iconfont icon-edit"></i>事件状态:<span style="font-size: 16px">动态获取,事件状态处理中还是完成</span></a>

					<div id="div4" style="overflow-y:scroll;overflow-x: hidden">
						<span id="t1"><h4>派遣信息</h4></span>
						<table class="table table-hover">
							<thead>
								<tr>
									<th>姓名</th>
									<th>车牌号</th>
									<th>派遣时间</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td class="text-nowrap">发生火灾</td>
									<td>火灾</td>
									<td><input type="checkbox" name="gui" value="gui" />归队</td>

								</tr>
								<tr>
									<td>1</td>
									<td class="text-nowrap">发生火灾</td>
									<td>火灾</td>
									<td><input type="checkbox" name="gui" value="gui" style="" />归队</td>
								</tr>
								<tr>
									<td>1</td>
									<td class="text-nowrap">发生火灾</td>
									<td>火灾</td>
									<td><input type="checkbox" name="gui" value="gui" />归队</td>
								</tr>
								<tr>
									<td>1</td>
									<td class="text-nowrap">发生火灾</td>
									<td>火灾</td>
									<td><input type="checkbox" name="gui" value="gui" />归队</td>
								</tr>
								<tr>
									<td>1</td>
									<td class="text-nowrap">发生火灾</td>
									<td>火灾</td>
									<td><input type="checkbox" name="gui" value="gui" />归队</td>
								</tr>
							</tbody>
						</table>
					</div>

					<div id="div3" style="overflow-y:scroll;overflow-x: hidden">
						<span id="t1"><h4>归队信息</h4></span>
						<table class="table table-hover">
							<thead>
								<tr>
									<th>姓名</th>
									<th>车牌号</th>
									<th>归队时间</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td class="text-nowrap">发生火灾</td>
									<td>火灾</td>
									<td><input type="checkbox" name="gui" value="gui" />归队</td>

								</tr>
								<tr>
									<td>1</td>
									<td class="text-nowrap">发生火灾</td>
									<td>火灾</td>
									<td><input type="checkbox" name="gui" value="gui" style="" />归队</td>
								</tr>
								<tr>
									<td>1</td>
									<td class="text-nowrap">发生火灾</td>
									<td>火灾</td>
									<td><input type="checkbox" name="gui" value="gui" />归队</td>
								</tr>
								<tr>
									<td>1</td>
									<td class="text-nowrap">发生火灾</td>
									<td>火灾</td>
									<td><input type="checkbox" name="gui" value="gui" />归队</td>
								</tr>
								<tr>
									<td>1</td>
									<td class="text-nowrap">发生火灾</td>
									<td>火灾</td>
									<td><input type="checkbox" name="gui" value="gui" />归队</td>
								</tr>
							</tbody>
						</table>
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
</body>
</html>