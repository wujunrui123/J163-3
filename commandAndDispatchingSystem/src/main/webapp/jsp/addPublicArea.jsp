<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta charset="utf-8">
        <title>
           添加公共模块
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
            <form class="layui-form" action="../common/addCommon.lovo">
            	
            
                
                <div class="layui-form-item">
                    <label for="role" class="layui-form-label">
                        <span class="x-red">*</span>类型
                    </label>
                    <div class="layui-input-inline">
                      <select name="role">
                        <option value="">请选择类型</option>
                        <option value="类型">类型</option>
                        <option value="等级">等级</option>
                                            
                      </select>
                    </div>
                </div>
                
                
                
                
                
               
                
                
                
                
                <div class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>key
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="key" name="key" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>请输入代号
                    </div>
                </div>
                
                
                 <div class="layui-form-item" >
                    <label for="username" class="layui-form-label">
                        <span class="x-red">*</span>value
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="value" name="value" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>请输入值
                    </div>
                </div>
                
                
                
                
                
                
                
                                
                
                
                               <div class="layui-form-item">
                    <label for="L_repass" class="layui-form-label">
                    </label>
                    <button name="sub" type="submit" class="layui-btn" lay-filter="add" lay-submit="">
                    	    增加
                    </button>
                    
                </div>
            </form>
        </div>
        <script src="./lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="./js/x-layui.js" charset="utf-8">
        </script>
        <!-- <script src="../jquery-2.1.4.js"></script>
	<script type="text/javascript" src="common/layui/layui.js"></script>
	<script type="text/javascript" src="js/newslist.js"></script>
	<script type="text/javascript" src="js/larry.js"></script>
<script type="text/javascript" src="js/index.js"></script>
	<script type="text/javascript">
	$("button[name=sub]").click(function(){
		$.post("../addCommon.lovo",data(function(){
			window.onlo
		}),JSON);
	});
	
	
	</script> -->
        
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
              }); */
               
              
            }); 
        </script>
        
    </body>

</html>