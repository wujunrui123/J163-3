<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
   
    <head>
        <meta charset="utf-8">
        <title>
            指挥调度系统
        </title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <link rel="stylesheet" href="jsp/css/x-admin.css" media="all">
        <link rel="stylesheet" href="jsp/js/city.css" media="all">
        <style type="text/css">
        .asd{
               margin-left: 26px;
          
        }
        </style>
    </head>
    
    <body>
        <div class="x-body">
            <blockquote class="layui-elem-quote">
              
                <dl style="margin-left:6px; color:#019688">
               
                <dt>  <a style="left: 50px"  href='main.jsp' class="layui-btn search_btn">返回</a>   <span style="margin-left:50px">${eve.f_eventName}调度系统</span> </dt>
              </dl>
            </blockquote>
            <div class="pd-20">
              <table  class="layui-table" lay-skin="line">
                <tbody>
                  <tr>
                    <th width="80">事件等级</th>
                    <td>${eve.f_level}</td>
                  </tr>
                  <tr>
                    <th>事件类型</th>
                    <td>${eve.f_type}</td>
                  </tr>
                </tbody>
              </table>
            </div>
          
        </div>
        
        <br>
			     <br>
         <div class="layui-form news_list">
         <h1>已调资源表</h1>
                    <table class="layui-table">
					    <colgroup>
						<col width="30%">
						<col width="30%">
						<col width="30%">
						<col width="30%">
					</colgroup>
					<thead>
				
						<tr>						
							<th style="text-align:left;">已调医生人数</th>
							<th>已调救护车数</th>
							<th>已调消防员数</th>
							<th>已调消防车数</th>
						</tr>
						
					</thead>
					<tbody class="news_content">
							
						<tr>
							<td align="left">${d.pro}</td>
							<td>${d.car}</td>
							<td>${d1.pro}</td>
							<td>${d1.car}</td>
						</tr>
				
					</tbody>
					</table>
			    </div>
			    
			    
			    <br>
			     <br>
			     <div class="layui-form news_list">
         <h1>匹配的预案模板</h1>
                    <table class="layui-table" >
					    <colgroup>
						<col width="20%">
					    <col width="20%">
						<col width="20%">
						<col width="20%">
					</colgroup>
					<thead>
						<tr>						
							<th style="text-align:left;">预案模板名称</th>
							<th>医务人数</th>
							<th>消防员人数</th>
							<th>消防车数</th>
							<th>急救车数</th>
						</tr>
					</thead>
					
					<tbody class="news_content">
						<tr>
							<td align="left">css3用transit</td>
							<td>请叫我马哥</td>
							<td>请叫我马哥</td>
							<td>审核通过</td>
							<td>开放浏览</td>
						</tr>
					</tbody>
					</table>
			    </div>
                    <br>
                    <br>
			          <span class='asd'>已选医生人数</span>  <span class='asd'>1</span>
			          <span class='asd'>已选消防员人数</span> <span class='asd'>0</span>
			          <span class='asd'>已选救护车数</span> <span class='asd'>0</span>
			          <span class='asd'>已选消防车数</span> <span class='asd'>0</span>
			          <a style="left: 50px"  href='schedulingResources.jsp' class="layui-btn search_btn">资源调度</a>

           <br>
			     <br>
			     

                    <div class="ku" >

                        <span id='dd'>${eve.f_area}</span>
                        <div class="xiala" >
                        </div>
                    </div>
                    <a id='ss' style="left: 50px"  class="layui-btn search_btn">查询</a> 
                    <br>
			     <br>
                
			     <div class="layui-form news_list">
         <h1>医院资源</h1>
                    <table class="layui-table" id='tab'>
					    <colgroup>
						<col>

						<col width="30%">
						<col width="30%">
						<col width="30%">
					</colgroup>
					<thead>
						<tr>						
							<th style="text-align:left;">医院名</th>
							<th>医务人数</th>
							<th>急救车数</th>
						</tr>
					</thead>
					
					<tbody class="news_content">
				
						<tr name='new'>
							<td align="left"></td>
							<td ><input class='dian' type="button" value='+'>1<input type="button" value='-'></td>
							<td><input  class='dian' type="button" value='+'>2<input type="button" value='-'></td>
						</tr>
					
					</tbody>
					</table>
			    </div>
			    
			    <br>
			     <br>
			    
			     <div class="layui-form news_list">
         <h1>消防资源</h1>
                    <table class="layui-table" id='tab1'>
					    <colgroup>
						<col>
						<col width="30%">
						<col width="30%">
						<col width="30%">
						
					</colgroup>
					<thead>
						<tr>						
							<th style="text-align:left;">消防队名</th>
							<th>消防员人数</th>
							<th>消防车数</th>
						</tr>
					</thead>
					
					<tbody class="news_content">
						
						<tr name='new'>
							<td align="left"></td>
							<td ><input class='dian' type="button" value='+'>1<input type="button" value='-'></td>
							<td><input  class='dian' type="button" value='+'>2<input type="button" value='-'></td>
						</tr>
					
					</tbody>
					</table>
			    </div>
                
		 <script src="jquery-2.1.4.js"></script>	    
        <script src="jsp/lib/layui/layui.js" charset="utf-8">
        </script>
         <script src="jsp/js/diquxuanzhe.js" charset="utf-8">
        </script>
        <script src="jsp/js/x-layui.js" charset="utf-8">
        </script>
        <script>
            $(function () {
            	  var area= $("#dd").html();
            	$.post("select.lovo",{area:area},sel,'json');
            	
				$("#ss").click(function () {
					  var area= $("#dd").html();
					$.post("select.lovo",{area:area},sel,'json')
				})
				
			});
            
            function sel(data) {
            	 var $table=$("#tab");
            	 var $table1=$("#tab1");
     	        $("tr[name=new]").remove();
     	        
     		    $.each(data.yi,function(i,e){
     	           var tr ="<tr name='new'>"+
						"<td align='left' class='"+e.f_url+"'>"+e.f_name+"</td>"+
						"<td ><input class='dian' type='button' value='+'><input type='button' value='-'></td>"+
						"<td><input  class='dian' type='button' value='+'><input type='button' value='-'></td>"+
					     +"</tr>"

     	            $table.append(tr);
     	        
     	         });
     		    
     		    
     		   $.each(data.xiao,function(i,e){
     	           var tr ="<tr name='new'>"+
     	                "<td align='left' class='"+e.f_url+"'>"+e.f_name+"</td>"+
						"<td ><input class='dian' type='button' value='+'>1<input type='button' value='-'></td>"+
						"<td><input  class='dian' type='button' value='+'>2<input type='button' value='-'></td>"+
					     +"</tr>"

     	            $table1.append(tr);
     	        
     	         });
            	
			}
        
        
        
            layui.use(['form','layer'], function(){
                $ = layui.jquery;
              var form = layui.form()
              ,layer = layui.layer;
            
              //自定义验证规则
              form.verify({
                nikename: function(value){
                  if(value.length < 5){
                    return '昵称至少得5个字符啊';
                  }
                }
                ,pass: [/(.+){6,12}$/, '密码必须6到12位']
                ,repass: function(value){
                    if($('#L_pass').val()!=$('#L_repass').val()){
                        return '两次密码不一致';
                    }
                }
              });

              console.log(parent);
              //监听提交
              form.on('submit(add)', function(data){
                console.log(data);
                //发异步，把数据提交给php
                layer.alert("增加成功", {icon: 6},function () {
                    // 获得frame索引
                    var index = parent.layer.getFrameIndex(window.name);
                    //关闭当前frame
                    parent.layer.close(index);
                });
                return false;
              });
              
              
            });
          //编辑
            function admin_edit (title,url,id,w,h) {
                x_admin_show(title,url,w,h); 
            }
        </script>
        
    </body>

</html>