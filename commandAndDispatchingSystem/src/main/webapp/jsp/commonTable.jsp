<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>公共模块展示</title>
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

					<!-- <div class="layui-inline">
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


					</div> -->

					<!-- <div class="layui-inline">
						<div class="layui-form-mid layui-word-aux">关闭页面所有数据重置</div>
					</div> -->
				</blockquote>
				<!-- 操作日志 -->
				<div class="layui-form news_list">
					<table class="layui-table" id='tab'>
						<colgroup>
							<col>
							<col width="25%">
							<col width="25%">
							<col width="25%">
							<col width="25%">
							
						</colgroup>
						<thead>
							<tr>

								
								<th>类别</th>
								<th>key</th>

								<th>value</th>

								
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
					<input type="hidden" id="zong" >
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
	
	
	$(function(){
		
    	var thingID=$('#thingID').val();
    	   //先用ajax查询一次数据
    	 
 	      //默认页码为1
 	      var curr=1;
    	   
 			 $.post("../common/findAll.lovo",{curr:curr},
 				cha
 			      ,"json")
    			 
	});
	//第一次请求和点击页码后的回调函数
	function cha(data) {
		   var $table=$("#tab");
	        $("tr[name=new]").remove();
	        
		    $.each(data.list,function(i,e){
				var tr="<tr name='new'><td align='left'>"+e.type+"</td><td>"+e.key+"</td><td>"+e.value+"</td><td>"+
				
				"<a href='../common/update.lovo?id="+e.commonID+"' class='layui-btn layui-btn-mini news_edit' data-url='updateThing.jsp' ><i class='iconfont icon-edit'></i>修改</a>"+
				"<a href='../common/del.lovo?id="+e.commonID+"' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>删除</a>"+
				"</td></tr>";
				
				
				$table.append(tr);
	        
	         });
		    //隐藏表单域  记录总页数
		    $("#zong").val(data.tot);
		    
		    
		    
			layui.use([ 'jquery', 'layer', 'element', 'laypage' ], function() {
				window.jQuery = window.$ = layui.jquery;
				window.layer = layui.layer;
				var element = layui.element(), laypage = layui.laypage;
				
				laypage({
					cont : 'page',
					pages : $("#zong").val()-1+1 //总页数改
					,
					groups : 5 //连续显示分页数
					,
					jump : function(obj, first) {
						//得到了当前页，用于向服务端请求对应数据
						var curr = obj.curr;
						
						 
				    	  
						 $.post("../common/findAll.lovo",{curr:curr},
					 				cha1
					 			      ,"json")
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

       }
	
	
	function cha1(data) {
		   var $table=$("#tab");
	        $("tr[name=new]").remove();
	        
		    $.each(data.list,function(i,e){
				var tr="<tr name='new'><td align='left'>"+e.type+"</td><td>"+e.key+"</td><td>"+e.value+"</td><td>"+
				
				"<a href='../common/update.lovo?id="+e.commonID+"' class='layui-btn layui-btn-mini news_edit' data-url='updateThing.jsp' ><i class='iconfont icon-edit'></i>修改</a>"+
				"<a href='../common/del.lovo?id="+e.commonID+"' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>删除</a>"+
				"</td></tr>";
				
				
				$table.append(tr);
	        
	         });
		    //隐藏表单域  记录总页数
		    $("#zong").val(data.tot);
	}; 
	
	
	
	
	
	
	</script>
</body>
</html>