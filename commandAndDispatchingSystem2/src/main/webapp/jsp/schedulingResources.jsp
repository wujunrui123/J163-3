<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
        <link rel="stylesheet" href="./css/x-admin.css" media="all">
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
               
                <dt>  <a style="left: 50px"  href='main.jsp' class="layui-btn search_btn">返回</a>   <span style="margin-left:50px">XXX事件</span> </dt>
              </dl>
            </blockquote>
            <div class="pd-20">
              <table  class="layui-table" lay-skin="line">
                <tbody>
                  <tr>
                    <th width="80">事件等级：</th>
                    <td>A</td>
                  </tr>
                  <tr>
                    <th>事件类型</th>
                    <td>水灾</td>
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
							<td align="left">3</td>
							<td>2</td>
							<td>2</td>
							<td>1</td>
						</tr>
					</tbody>
					</table>
			    </div>
			    
			    
			    <br>
			     <br>
			     <div class="layui-form news_list">
         <h1>匹配的预案模板</h1>
                    <table class="layui-table">
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
                
			     <div class="layui-form news_list">
         <h1>医院资源</h1>
                    <table class="layui-table">
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
						<tr>
							<td align="left">css3用transition实</td>
							<td><input class='dian' type="button" value='+'>10<input type="button" value='-'></td>
							<td><input  class='dian' type="button" value='+'>10<input type="button" value='-'></td>
						</tr>
					</tbody>
					</table>
			    </div>
			    
			    <br>
			     <br>
			    
			     <div class="layui-form news_list">
         <h1>消防资源</h1>
                    <table class="layui-table">
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
						<tr>
							<td align="left">css3用transition实现边框动画效果</td>
								<td><input class='dian' type="button" value='+'>10<input type="button" value='-'></td>
							<td><input  class='dian' type="button" value='+'>10<input type="button" value='-'></td>
						</tr>
					</tbody>
					</table>
			    </div>
                
			    
        <script src="./lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="./js/x-layui.js" charset="utf-8">
        </script>
        <script>
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