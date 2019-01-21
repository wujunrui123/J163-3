<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link rel="stylesheet" href="./css/city的副本.css" media="all">

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
								class="layui-input search_input" type="text" id="thingName">
						</div>
						<div class="ku">

							<span id="area">请选择事发地址（必选）</span>
							<div class="xiala">
								<h1>
									<span>确认</span>
								</h1>
							</div>
						</div>

						<div class="layui-input-inline">
							<input value="" placeholder="起始时间"
								class="layui-input search_input" type="datetime-local"
								id="startDate">

						</div>
						<div class="layui-input-inline">
							<input value="" placeholder="结束时间"
								class="layui-input search_input" type="datetime-local"
								id="endDate">

						</div>
						<div class="layui-input-inline">
							<select class='sel' id="thingType">
								<c:forEach var="n" items="${list}">

									<option value="${n.value}">${n.value}</option>

								</c:forEach>
							</select>
						</div>
						<div class="layui-input-inline">
							<span>是否上报</span> <select class='sel' id="uploadType">
								<option>否</option>
								<option>是</option>

							</select>
						</div>

						<input type="button" class="layui-btn " value="查询" id="cha"/> <a href="addThing.jsp"
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
					<input type="hidden" id='zong'>
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
	<script src="./js/diquxuanzhe的副本.js" charset="utf-8">
        </script>
	<!-- <script type="text/javascript" src="js/larry.js"></script>
<script type="text/javascript" src="js/index.js"></script> -->
	<script type="text/javascript">
	
		
		  
		
	
		
		
		
		
		
		/* $.post("../thing/find.lovo",function(data){
			
			var $table=$("#tab");
			$("tr[name=new]").remove();
			$.each(data,function(i,e){
				var tr="<tr name='new'><td align='left'>"+e.thingName+"</td><td>"+e.thingCard+"</td><td>"+e.area+
				"</td><td>"+e.thingType+"</td><td>"+e.uploadDate+"</td><td>"+e.thingState+"</td><td>"+e.uploadType+
				"</td><td>"+ "<a href='findThing.jsp' class='layui-btn layui-btn-mini news_edit' data-url='findThing.jsp' ><i class='iconfont icon-edit'></i>查看详情</a>"+
				"<a href='../find.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='updateThing.jsp' ><i class='iconfont icon-edit'></i>修改</a>"+
				"<a href='PlanTemplate.jsp' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>删除</a>"+
				"<a href='PlanTemplate.jsp' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>上报</a>"+"</td></tr>";
				
				$table.append(tr);
			})
			
		},'JSON'); */
		
		
		$(function () {
			
	    	   //先用ajax查询一次数据
	    	  var thingType=$('#thingType').val();
	    	  var uploadType=$('#uploadType').val();
	    	  var area=$('#area').val();
	    	  var startDate=$('#startDate').val();
	    	  var endDate=$('#endDate').val();
	    	  var thingName=$('#thingName').val();
	 	      //默认页码为1
	 	      var curr=1;
	    	   
	 			 $.post("../thing/find.lovo",{thingName:thingName,endDate:endDate,startDate:startDate,area:area,thingType:thingType,uploadType:uploadType,curr:curr},
	 				cha
	 			      ,"json")
	    			 
		});
		//第一次请求和点击页码后的回调函数
		function cha(data) {
			   var $table=$("#tab");
		        $("tr[name=new]").remove();
		        
			    $.each(data.list,function(i,e){
			    	var tr="<tr name='new'><td align='left'>"+e.thingName+"</td><td>"+e.thingCard+"</td><td>"+e.area+
					"</td><td>"+e.thingType+"</td><td>"+e.uploadDate+"</td><td>"+e.thingState+"</td><td>"+e.uploadType;
					
					var tr2="";
			    	 if("否"==e.uploadType){
						tr2="</td><td>"+ "<a href='../thing/findById.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='findThing.jsp' ><i class='iconfont icon-edit'></i>查看详情</a>"+
						"<a href='../thing/update.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='updateThing.jsp' ><i class='iconfont icon-edit'></i>修改</a>"+
						"<a href='../thing/del.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>删除</a>"+
						"<a href='../thing/updateType.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>上报</a>"+"</td></tr>";
					} else{
						tr2="</td><td>"+ "<a href='../thing/findById.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='findThing.jsp' ><i class='iconfont icon-edit'></i>查看详情</a>"+
						
						"<a href='../thing/addContinue.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>续报</a>"+"</td></tr>";
					}
			    	var trr=tr+tr2;
					$table.append(trr);
		        
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
							
							  var thingType=$('#thingType').val();
					    	  var uploadType=$('#uploadType').val();
					    	  var area=$('#area').val();
					    	  var startDate=$('#startDate').val();
					    	  var endDate=$('#endDate').val();
					    	  var thingName=$('#thingName').val();
					    	  
							 $.post("../thing/find.lovo",{thingName:thingName,endDate:endDate,startDate:startDate,area:area,thingType:thingType,uploadType:uploadType,curr:curr},
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
			    	var tr="<tr name='new'><td align='left'>"+e.thingName+"</td><td>"+e.thingCard+"</td><td>"+e.area+
					"</td><td>"+e.thingType+"</td><td>"+e.uploadDate+"</td><td>"+e.thingState+"</td><td>"+e.uploadType;
					var tr2="";
					
					
					
					if("否"==e.uploadType){
						tr2="</td><td>"+ "<a href='../thing/findById.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='findThing.jsp' ><i class='iconfont icon-edit'></i>查看详情</a>"+
						"<a href='../thing/update.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='updateThing.jsp' ><i class='iconfont icon-edit'></i>修改</a>"+
						"<a href='../thing/del.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>删除</a>"+
						"<a href='../thing/updateType.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>上报</a>"+"</td></tr>";
					}else{
						tr2="</td><td>"+ "<a href='../thing/findById.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='findThing.jsp' ><i class='iconfont icon-edit'></i>查看详情</a>"+
						
						"<a href='../thing/addContinue.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>续报</a>"+"</td></tr>";
					}
					var trr=tr+tr2;
					$table.append(trr);
		        
		         });
			    //隐藏表单域  记录总页数
			    $("#zong").val(data.tot);
		}; 
		
	    //查询按钮点击事件
	  $("#cha").click(function () {
		  
		  var thingType=$('#thingType').val();
    	  var uploadType=$('#uploadType').val();
    	  var area=$('#area').val();
    	  var startDate=$('#startDate').val();
    	  var endDate=$('#endDate').val();
    	  var thingName=$('#thingName').val();
 	      //默认页码为1
 	      var curr=1;
    	   
 			 $.post("../thing/find.lovo",{thingName:thingName,endDate:endDate,startDate:startDate,area:area,thingType:thingType,uploadType:uploadType,curr:curr},
 				cha
 			      ,"json")
		});
	 /*    //查询按钮点击后的回调函数
		function cha1(data) {
			   var $table=$("#tab");
		        $("tr[name=new]").remove();
		        
			    $.each(data.list,function(i,e){
			    	var tr="<tr name='new'><td align='left'>"+e.thingName+"</td><td>"+e.thingCard+"</td><td>"+e.area+
					"</td><td>"+e.thingType+"</td><td>"+e.uploadDate+"</td><td>"+e.thingState+"</td><td>"+e.uploadType+
					"</td><td>"+ "<a href='findThing.jsp' class='layui-btn layui-btn-mini news_edit' data-url='findThing.jsp' ><i class='iconfont icon-edit'></i>查看详情</a>"+
					"<a href='../find.lovo?id="+e.thingID+"' class='layui-btn layui-btn-mini news_edit' data-url='updateThing.jsp' ><i class='iconfont icon-edit'></i>修改</a>"+
					"<a href='PlanTemplate.jsp' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>删除</a>"+
					"<a href='PlanTemplate.jsp' class='layui-btn layui-btn-mini news_edit' data-url='PlanTemplate.jsp' ><i class='iconfont icon-edit'></i>上报</a>"+"</td></tr>";
					
					$table.append(tr);
		        
		         });  */
			    //查询后会将查询的到数据的总页数重新记录到隐藏表单域
			  /*   $("#zong").val(data.tot); */
			    
			    //此代码为配置页码按钮代码     将此代码放在回调函数中是为了，在点击查询后会  将页码按钮重新刷新
			   /*  layui.use(['jquery','layer','element','laypage'],function(){
				      window.jQuery = window.$ = layui.jquery;
				      window.layer = layui.layer;
			          var element = layui.element(),
			              laypage = layui.laypage;

			          laypage({
								cont: 'page',
								//获取隐藏表单域保存的总页数  -1+1是位了将string类型 转换为int
								pages:  $("#zong").val()-1+1 
									,
								groups: 2 //连续显示分页数
									,
									//该方法为点击页码按钮后触发的方法
								jump: function(obj, first) {
									//curr为点击的页码
									var curr = obj.curr;
									
									//再次发ajax请求 为了得到下一页的数据
									   var num=  $('#Number').val();
							 	      var state=  $('#state').val();
							 	      var statTime=  $('#statTime').val();
							 	      var endTime=  $('#endTime').val();
							 			 $.post("../thing/find.lovo",{num:num,state:state,statTime:statTime,endTime:endTime,curr:curr},
							 				cha
							 			      ,"json") 
									
									
									if(!first) {
										//layer.msg('第 '+ obj.curr +' 页');
									}
								}
							});
	                 
			          laypage({
								cont: 'page2',
								pages: 10 //总页数
									,
								groups: 5 //连续显示分页数
									,
								jump: function(obj, first) {
									//得到了当前页，用于向服务端请求对应数据
									var curr = obj.curr;
									if(!first) {
										//layer.msg('第 '+ obj.curr +' 页');
									}
								}
							});
			    });

	       }*/
		
		
		
		
		/*  //第一次进入页面时生成的页码按钮
		layui.use(['jquery','layer','element','laypage'],function(){
		      window.jQuery = window.$ = layui.jquery;
		      window.layer = layui.layer;
	          var element = layui.element(),
	              laypage = layui.laypage;
	         
	            
	          laypage({
						cont: 'page',
						pages:  $("#zong").val()-1+1 //总页数
							,
						groups: 2 //连续显示分页数
							,
						jump: function(obj, first) {
							//得到了当前页，用于向服务端请求对应数据
							var curr = obj.curr;
							
						
							var thingType=$('#thingType').val();
					    	  var thingState=$('#thingState').val();
					    	  var area=$('#area').val();
					    	  var startDate=$('#startDate').val();
					    	  var endDate=$('#endDate').val();
					    	  var thingName=$('#thingName').val();
					    	  var limit=2;
					 			 $.post("../thing/find.lovo",{thingName:thingName,endDate:endDate,startDate:startDate,area:area,thingType:thingType,thingState:thingState,curr:curr,limit:limit},
					 				cha1
					 			      ,"json")
							
							
							if(!first) {
								//layer.msg('第 '+ obj.curr +' 页');
							}
						}
					}); */

	          
	    /* }); */  
		

		 
		 
	/* 	layui.use([ 'jquery', 'layer', 'element', 'laypage' ], function() {
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
			
			
			
		});  */
	</script>
</body>
</html>