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

</style>

</head>
<script type="text/javascript" src="jquery-2.1.4.js"></script>

<script type="text/javascript">

$(function () {
	var area=null;
	var type=null;
	var site=null;
	$.getJSON("../Theevent.lovo",{area:area,type:type,site:site},findData);
	$("input[type=button]").click(function () {
		var operation=this.value;
		//alert(operation);
		area=$("input[name=area]").val();
		type=$("input[name=type]").val();
		site=$("input[name=site]").val();
	
		$.getJSON("../Theevent.lovo",{area:area,type:type,site:site},findData);
	
});
});


function findData(data){
	var $table=$("table");
	$table.empty();
	var head="<tr><th>事件名称</th><th>事件类型</th><th>事件地址</th><th>调派人数</th><th>调派车数</th><th>操作</th></tr>";
	$table.append(head);
	$.each(data.findBitm,function(i,e){
		var eventName=e.eventName;
		var type=e.type;
		var site=e.site;
		var numberpeople=e.numberpeople;
		var arnumber=e.arnumber;
		var tr="<tr><td>"+eventName+"</td><td>"+type+"</td><td>"+site+"</td><td>"+numberpeople
		+"</td><td>"+arnumber+"</td><td><a href=../UpdateFindClassServlet?id="+e.id+">修改小班信息</a> <a href=../FindClassServlet?id="+e.id+">查看小班信息</a></tr>";
		$table.append(tr); 
	});
}


</script>
<body>

	<section class="layui-larry-box">
		<div class="larry-personal">
			<div class="layui-tab">
				<blockquote class="layui-elem-quote news_search">

					<div class="layui-inline">
						<div class="layui-input-inline">
							<input value="" placeholder="请输入事件编号"
								class="layui-input search_input" type="text">
						</div>
						<div class="layui-input-inline">
							<select class='sel' name="area">
								<option>-请选择事件状态-</option>
								<option>未处理事件</option>
								<option>处理中事件</option>
								<option>已处理事件</option>
							</select>
						</div>
						<div class="layui-input-inline">
							<input value="" placeholder="请输入类型关键字"
								class="layui-input search_input" type="text" name=type>
						</div>
						<div class="layui-input-inline">
							<input value="" placeholder="请输入地区关键字"
								class="layui-input search_input" type="text"  name="site">
						</div>
						<input type="button"  name="operator"  value="查询"/>
					</div>

					<div class="layui-inline">
						<div class="layui-form-mid layui-word-aux">关闭页面所有数据重置</div>
					</div>
				</blockquote>
				<!-- 操作日志 -->
				<div class="layui-form news_list">
					<table class="layui-table">
						<colgroup>
							<col>
							<col width="9%">
							<col width="9%">
							<col width="9%">
							<col width="9%">
							<col width="9%">
							<col width="15%">
						</colgroup>
					<!-- 	 <thead>
							<tr>
								<th style="text-align: left;">事件名称</th>
								
								<th>事件类型</th>
								<th>事件地址</th>
								<th>接收时间</th>
								<th>调派人员数量</th>
								<th>调派车辆数量</th>
								<th>事件状态</th>
								<th>操作</th>
							</tr> 
						 </thead> 
						<tbody class="news_content">
							<tr>
								<td align="left">css3用transition实现边框动画效果</td>
								<td>请叫我马哥</td>
								<td>火灾</td>
								<td>金牛区</td>
								<td>2012-11-11</td>
								<td>15</td>
								<td>10</td>
								<th>未处理</th>
								<td><a href="PlanTemplate.jsp"
									class="layui-btn layui-btn-mini news_edit"
									data-url="PlanTemplate.jsp"><i class="iconfont icon-edit"></i>去处理</a>

								</td>
							</tr>

						</tbody>
							<tbody class="news_content">
							<tr>
								<td align="left">css3用transition实现边框动画效果</td>
								<td>请叫我马哥</td>
								<td>火灾</td>
								<td>金牛区</td>
								<td>2012-11-11</td>
								<td>15</td>
								<td>10</td>
								<th>处理中</th>
								<td><a href="main2.jsp"
									class="layui-btn layui-btn-mini news_edit"
									data-url="main2.jsp"><i class="iconfont icon-edit"></i>查看进度</a>

								</td>
							</tr>
							<tr>
								<td align="left">css3用transition实现边框动画效果</td>
								<td>请叫我马哥</td>
								<td>火灾</td>
								<td>金牛区</td>
								<td>2012-11-11</td>
								<td>15</td>
								<td>10</td>
								<th>已处理</th>
								<td><a href="main3.jsp"
									class="layui-btn layui-btn-mini news_edit"
									data-url="main3.jsp"><i class="iconfont icon-edit"></i>查看详情</a>

								</td>
							</tr>

						</tbody>  -->
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