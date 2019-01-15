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
    </head>
    
    <body>
        <div class="x-body">
            <blockquote class="layui-elem-quote">
              
                <dl style="margin-left:6px; color:#019688">
               
                <dt>  <a style="left: 50px"  href='main.jsp' class="layui-btn search_btn">返回</a>   <span style="margin-left:50px">事件详情</span> </dt>
              </dl>
            </blockquote>
            <div class="pd-20">
              <table  class="layui-table" lay-skin="line">
                <tbody>
                  <tr>
                    <th width="80">事件编号：</th>
                    <td>男</td>
                    <th width="80">事件状态：</th>
                    <td>正在处理</td>
                  </tr>
                  <tr>
                   <th>事件名称：</th>
                    <td>123</td>
                    <th>详细地址：</th>
                    <td>123</td>
                  </tr>
                  <tr>
                    <th>事件等级：</th>
                    <td>123</td>
                  </tr>
                  <tr>
                    <th>事件类型：</th>
                    <td>火灾</td>
                  </tr>
                  <tr>
                    <th>事件区域：</th>
                    <td>2017-01-01</td>
                  </tr>
                   <tr>
                    <th>伤亡人数：</th>
                    <td>2017-01-01</td>
                  </tr>
                    <tr>
                    <th>报警人员：</th>
                    <td>2017-01-01</td>
                  </tr>
                       <tr>
                    <th>报警人员联系方式：</th>
                    <td>2017-01-01</td>
                  </tr>
                    <tr>
                    <th>火势情况描述：</th>
                    <td>火源sssxxxxx</td>
                  </tr>
                    <tr>
                    <th>火源：</th>
                    <td>火源sssxxxxx</td>
                   
                  </tr>
                </tbody>
              </table>
            </div>
          
        </div>
        
         <div class="layui-form news_list">
         <h1>续报表</h1>
                    <table class="layui-table">
					    <colgroup>
						<col>
						<col width="9%">
						<col width="9%">
						<col width="9%">
						<col width="9%">
						<col width="9%">
						<col width="9%">
					</colgroup>
					<thead>
						<tr>						
							<th style="text-align:left;">续报等级</th>
							<th>上报人</th>
							<th>报警人员</th>
							<th>报警人员联系方式</th>
							<th>续报时间</th>
							<th>伤亡人数</th>
						</tr>
					</thead>
					<tbody class="news_content">
						<tr>
							<td align="left">css3用transition实现边框动画效果</td>
							<td>请叫我马哥</td>
							<td>请叫我马哥</td>
							<td>审核通过</td>
							<td>开放浏览</td>
							<td>2017-04-14</td>
						</tr>
					</tbody>
					</table>
			    </div>
			    
			    
			    
			     <div class="layui-form news_list">
         <h1>资源调度表</h1>
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
					<thead>
						<tr>						
							<th style="text-align:left;">负责人</th>
							<th>负责人电话</th>
							<th>资源名</th>
							<th>资源类型</th>
							<th>调度时间</th>
							<th>人数</th>
							<th>车数</th>
							<th>派遣时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody class="news_content">
						<tr>
							<td align="left">css3用transition实现边框动画效果</td>
							<td>请叫我马哥</td>
							<td>请叫我马哥</td>
							<td>审核通过</td>
							<td>开放浏览</td>
							<td>2017-04-14</td>
							<td>2017-04-14</td>
							<td>2017-04-14</td>
							<td class="td-manage">
							  <a title="查看详情" href="javascript:;" onclick="admin_edit('编辑','resources.jsp','4','','510')"
                            class="ml-5" style="text-decoration:none">
                                <i class="layui-icon">&#xe642;</i>
                            </a>
                            
							</td>
						</tr>
					</tbody>
					</table>
			    </div>
			    
			    
			       <div class="layui-form-item">
               <a style="left: 50px"  href='schedulingResources.jsp' class="layui-btn search_btn">资源调度</a>
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