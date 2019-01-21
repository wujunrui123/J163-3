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
        <script type="text/javascript" src="../jquery-2.1.4.js"></script>
		<script type="text/javascript">
			$(function(){
				alert(12);
			})

		</script>
    </head>
    
    <body>
        <div class="x-body">
            <blockquote class="layui-elem-quote">
                <img src="./images/logo.png" class="layui-circle" style="width:50px;float:left">
                <dl style="margin-left:80px; color:#019688">
                <dt><span >用户信息</span> </dt>
               
              </dl>
            </blockquote>
            <div class="pd-20">
              <table  class="layui-table" lay-skin="line">
                <tbody>
                  <tr>
                    <th  width="80">姓名：</th>
                    <td> ${n.name }</td>
                    <th>用户名：</th>
                    <td>${n.userName }</td>
                  </tr>
                  
                  <tr>
                    <th>性别：</th>
                    <td>${n.sex }</td>
                    <th>电话：</th>
                    <td>${n.phone }</td>
                  </tr>
                  
                  <tr>
                    <th>职位：</th>
                    <td>${n.work }</td>
                   
                  </tr>
                  
                  
                  
                </tbody>
              </table>
            </div>
            <a href="findUserTable.jsp" class="layui-btn search_btn" data-url="findUserTable.jsp" >返回</a>
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
            
            layui.use(['jquery','layer','element','laypage'],function(){
      	      window.jQuery = window.$ = layui.jquery;
      	      window.layer = layui.layer;
                var element = layui.element(),
                    laypage = layui.laypage;

                  
                laypage({
      					cont: 'page',
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
        </script>
        
    </body>

</html>