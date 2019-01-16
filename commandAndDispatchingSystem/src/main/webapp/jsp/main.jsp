<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>事件展示</title>
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
</style>


</head>



<body>
	<section class="layui-larry-box">
		<div class="larry-personal">
			<div class="layui-tab">
				<blockquote class="layui-elem-quote news_search">

					<div class="layui-inline">
						<div class="layui-input-inline">
							<input value="" placeholder="请输入事件名称"
								class="layui-input search_input" type="text">
						</div>
						<div class="layui-input-inline">
							<select class='sel'>
								<option>事件发生区域</option>
							</select>
						</div>

						<div class="layui-input-inline">
							<input value="" placeholder="起始时间"
								class="layui-input search_input" type="datetime-local">

						</div>
						<div class="layui-input-inline">
							<input value="" placeholder="结束时间"
								class="layui-input search_input" type="datetime-local">

						</div>
						<div class="layui-input-inline">
							<select class='sel'>
								<option>事件类型</option>
							</select>
						</div>
						<div class="layui-input-inline">
							<select class='sel'>
								<option>是否上报</option>
							</select>
						</div>

						<a class="layui-btn search_btn">查询</a> <a href="addThing.jsp"
							class="layui-btn search_btn" data-url="addThing.jsp">添加事件</a>


					</div>

					<div class="layui-inline">
						<div class="layui-form-mid layui-word-aux">关闭页面所有数据重置</div>
					</div>
				</blockquote>
				<!-- 操作日志 -->
				<div class="layui-form news_list">
					<table class="layui-table" id='tab'>
						<colgroup>
							<col>
							<col width="9%">
							<col width="9%">
							<col width="9%">
							<col width="9%">
							<col width="9%">
							<col width="15%">
						</colgroup>
						<thead>
							<tr>

								<th style="text-align: left;">事件名称</th>
								<th>事件编号</th>
								<th>所在地区</th>

								<th>类型</th>

								<th>上报时间</th>
								<th>事件状态</th>

								<th>是否上报</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody class="news_content">
							

						</tbody>
					</table>
					<div class="larry-table-page clearfix">

						<div id="page" class="page"></div>
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
	$(function (){
		
		$.post("../find.lovo",function(data){
			alert("1");
			var $table=$("#tab");
			$("tr[name=new]").remove();
			$.each(data,function(i,e){
				var tr="<tr name='new'><td align='left'>"+e.thingName+"</td><td>"+e.thingCard+"</td><td>"+e.area+
				"</td><td>"+e.thingType+"</td><td>"+e.uploadDate+"</td><td>"+e.thingState+"</td><td>"+e.uploadType+
				"</td><td>"+ "<a href='findThing.jsp' class='layui-btn layui-btn-mini news_edit' data-url='findThing.jsp' ><i class='iconfont icon-edit'></i>查看详情</a>"+
				"<a href='updateThing.jsp' class='layui-btn layui-btn-mini news_edit' data-url='updateThing.jsp' ><i class='iconfont icon-edit'></i>修改</a>"+
				"<a href='PlanTemplate.jsp' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>删除</a>"+
				"<a href='PlanTemplate.jsp' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>上报</a>"+"</td></tr>";
				
				$table.append(tr);
			})
			
		},'JSON');
		
		
		
	});
	
	
	
	
	
	
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