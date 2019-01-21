<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
    
    <head>
        <meta charset="utf-8">
        <title>
           添加事件
        </title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <link rel="stylesheet" href="./css/x-admin.css" media="all">
        <link rel="stylesheet" href="./css/city的副本.css" media="all">
    </head>
    
    <body>
   
   
        <div class="x-body">
            <form class="layui-form" action="../thing/addThing.lovo">
            	<div class="layui-form-item">
                    <label for="role" class="layui-form-label">
                        <span class="x-red">*</span>事件类型
                    </label>
                    <div class="layui-input-inline">
                    
                    <select name="thingType" id="thingType" lay-filter="demo" lay-verify="required">
                   		<option value="">请选择类型</option>
                    <c:forEach var="n" items="${list}">
                        
                        <option value="${n.value}">${n.value} </option>
                         
                        </c:forEach>                     
                      </select>
                   
                    
                      
                    </div>
                     
                </div>
            
                <div class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>事件名称
                    </label>
                    <div class="layui-input-inline">
                        <input  type="text" id="thingName" name="thingName" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>请正确输入
                    </div>
                </div>
          
                  <div class="ku layui-input">
						
                        <span id="area">请选择事发地址（必选）</span>
                        
                        <div class="xiala">
                            <h1><span>确认</span></h1>
                        </div>
                    </div>
                
                <div class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>详细地址
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="address" name="address" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>请输入本市地址
                    </div>
                </div>
                
                <div class="layui-form-item">
                    <label for="role" class="layui-form-label">
                        <span class="x-red">*</span>等级
                    </label>
                    <div class="layui-input-inline">
                      <select name="grade">
                        <c:forEach var="m" items="${list2}">
                        
                        <option value="${m.value}">${m.value} </option>
                         
                        </c:forEach>                       
                      </select>
                    </div>
                </div>
                
                
                
                <div class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>伤亡人数
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="peopleNum" name="peopleNum" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>请输入数字
                    </div>
                </div>
                
                
                
                
                
                
                
                
                <div class="layui-form-item">
                    <label for="phone" class="layui-form-label">
                        <span class="x-red">*</span>报警人员电话
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="phone" name="phone" required="" lay-verify="phone"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>请输入正确号码
                    </div>
                </div>
                
                <div class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>报警人员
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="callName" name="callName" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>请输入姓名
                    </div>
                </div>
                
              
                
                <div class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>报警时间
                    </label>
                    <div class="layui-input-inline">
                        <input type="datetime" id="callDate" name="callDate" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>格式：1990-01-01 12:00:00
                    </div>
                </div>
                
               
                
                <div class="layui-form-item">
                    <label for="role" class="layui-form-label">
                        <span class="x-red">*</span>事件状态
                    </label>
                    <div class="layui-input-inline">
                      <select name="thingState">
                        <option value="">请选择状态</option>
                        <option value="待处理">待处理</option>
                        <option value="处理中">处理中...</option>
                        <option value="处理完毕">处理完毕</option>
                                              
                      </select>
                    </div>
                </div>
                
                
                <div class="layui-form-item" id="freeText">
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>火灾描述
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="free_Text" name="freeText" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
                    
                </div>
                 <div class="layui-form-item" id="freeName">
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>失火原因
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="free_Name" name="freeName" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
               
                </div>
                <div class="layui-form-item" id="crumArea">
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>损坏面积
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="crum_Area" name="crumArea" 
                         class="layui-input">
                    </div>
               
                </div>
                <div class="layui-form-item" id="crumText">
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>崩塌描述
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="crum_Text" name="crumText" 
                         class="layui-input">
                    </div>
               
                </div>
                
                
                <div class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>上报人员
                    </label>
                    <label for="username" class="layui-form-label" name="uploadName">
                        	该登录的管理员
                    </label>
                    
                </div>
                
                
                
                
                               <div class="layui-form-item">
                    <label for="L_repass" class="layui-form-label">
                    </label>
                    <button type="submit" class="layui-btn" lay-filter="add" lay-submit="">
                      		  增加
                    </button>

                </div>
            </form>
        </div>
        <script src="../jquery-2.1.4.js"></script>
        <script src="./lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="./js/x-layui.js" charset="utf-8">
        </script>
        <script src="./js/diquxuanzhe的副本.js" charset="utf-8">
        </script>
        <script >
        $(function(){
        	$("#crumText").hide();
        	$("#freeText").hide();
        	$("#freeName").hide();
        	$("#crumArea").hide();
        });
        
       
        
        
             layui.use(['form','layer'], function(){
                $ = layui.jquery;
              var form = layui.form()
              ,layer = layui.layer;
            
              //自定义验证规则
              form.on('select(demo)', function(data){
				if(data.value =="火灾"){
					$("#crumText").hide();
		        	$("#freeText").show();
		        	$("#freeName").show();
		        	$("#crumArea").hide();
				}if(data.value =="崩塌"){
					$("#crumText").show();
		        	$("#freeText").hide();
		        	$("#freeName").hide();
		        	$("#crumArea").show();
				}
				else{
					
				}
			});  
              
              
            	  
            	  
				 /*  console.log(data);
				  //发异步，把数据提交给php
				  layer.alert("增加成功", {icon: 6},function () {
				      // 获得frame索引
				      var index = parent.layer.getFrameIndex(window.name);
				      //关闭当前frame
				      parent.layer.close(index);
				  });
				  return false; */
				});
             
              
              
              
             
              
              
             /*  form.verify({
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
             });  */

              /* //监听提交
              
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
									});*/
								</script>
        
    </body>

</html>