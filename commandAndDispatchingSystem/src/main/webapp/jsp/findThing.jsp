<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    
    <head>
        <meta charset="utf-8">
        <title>
            上报系统
        </title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <link rel="stylesheet" href="./css/x-admin.css" media="all">
    </head>
    
    <body>
        <div class="x-body">
            <blockquote class="layui-elem-quote">
                <img src="./images/logo.png" class="layui-circle" style="width:50px;float:left">
                <dl style="margin-left:80px; color:#019688">
                <dt><span >上报-续报事件</span> </dt>
               
              </dl>
            </blockquote>
            <div class="pd-20">
              <table  class="layui-table" lay-skin="line">
                <tbody>
                  <tr>
                    <th  width="80">事件名称：</th>
                    <td> ${thingEntity.thingName}</td>
                    <th>区域：</th>
                    <td>${thingEntity.area}</td>
                  </tr>
                  
                  <tr>
                    <th>事件类型：</th>
                    <td>${thingEntity.thingType}</td>
                    <th>等级：</th>
                    <td>${thingEntity.grade}</td>
                  </tr>
                  
                  <tr>
                    <th>详细地址：</th>
                    <td>${thingEntity.address}</td>
                    <th>伤亡人数：</th>
                    <td>${thingEntity.peopleNum}</td>
                  </tr>
                  
                  <tr>
                    <th>上报人：</th>
                    <td>${thingEntity.uploadName}</td>
                    <th>报警人：</th>
                    <td>${thingEntity.callName}</td>
                  </tr>
                  
                  <tr>
                    <th>报警人电话：</th>
                    <td>${thingEntity.phone}</td>
                    <th>报警时间：</th>
                    <td>${thingEntity.callDate}</td>
                  </tr>
                  
                  <tr>
                    <th>上报时间：</th>
                    <td>${thingEntity.uploadDate}</td>
                     <th>事件编号：</th>
                    <td>${thingEntity.thingCard}</td>
                  </tr>
                  
                  <tr>
                    <th>是否上报：</th>
                    <td>${thingEntity.uploadType}</td>
                    <th>事件状态：</th>
                    <td>${thingEntity.thingState}</td>
                  </tr>
                  
                </tbody>
              </table>
            </div>
        </div>
                        <div class="layui-form news_list">
                    <table class="layui-table" id="tab">
					    <colgroup>
						<col>
						<col width="16%">
						<col width="16%">
						<col width="16%">
						<col width="16%">
						<col width="16%">
						<col width="16%">
					</colgroup>
					<thead>
						<tr>

							<th style="text-align:left;">续报时间</th>
							<th>报警人</th>
							<th>报警人员电话</th>
							
							<th>上报人</th>
							
							<th>等级</th>
							<th>事伤亡人数</th>
							
							
						</tr>
					</thead>
					<tbody class="news_content">
					
							

					</tbody>
					</table>
                     <div class="larry-table-page clearfix">
                         
				          <div id="page" class="page"></div>
			         </div>
			          <input type="hidden" id="zong" >
			         <input type="hidden" id="thingID" value="${thingEntity.thingID}">
			    </div>
        <script src="../jquery-2.1.4.js"></script>
        <script src="./lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="./js/x-layui.js" charset="utf-8">
        </script>
        <script>
        $(function(){
			
        	var thingID=$('#thingID').val();
	    	   //先用ajax查询一次数据
	    	 
	 	      //默认页码为1
	 	      var curr=1;
	    	   
	 			 $.post("../continueThing/findByThingId.lovo",{thingID:thingID,curr:curr},
	 				cha
	 			      ,"json")
	    			 
		});
		//第一次请求和点击页码后的回调函数
		function cha(data) {
			   var $table=$("#tab");
		        $("tr[name=new]").remove();
		        
			    $.each(data.list,function(i,e){
			    	var tr="<tr name='new'><td align='left'>"+e.uploadDate+"</td><td>"+e.callName+"</td><td>"+e.callphone+
					"</td><td>"+e.uploadName+"</td><td>"+e.grade+"</td><td>"+e.peopleNum;
					
					
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
							var thingID=$('#thingID').val();
							 
					    	  
					    	  $.post("../continueThing/findByThingId.lovo",{thingID:thingID,curr:curr},
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
			    	var tr="<tr name='new'><td align='left'>"+e.uploadDate+"</td><td>"+e.callName+"</td><td>"+e.callphone+
					"</td><td>"+e.uploadName+"</td><td>"+e.grade+"</td><td>"+e.peopleNum;
					
					
					$table.append(tr);
		        
		         });
			    //隐藏表单域  记录总页数
			    $("#zong").val(data.tot);
		}; 
		
	   
        </script>
        
    </body>

</html>