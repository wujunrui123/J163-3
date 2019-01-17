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
    </head>
    
    <body>
        <div class="x-body">
            <blockquote class="layui-elem-quote">
              
                <dl style="margin-left:6px; color:#019688">
               
                <dt>  <a style="left: 50px"  href='jsp/main.jsp' class="layui-btn search_btn">返回</a>   <span style="margin-left:50px">事件详情</span> </dt>
              </dl>
            </blockquote>
            <div class="pd-20">
              <table  class="layui-table" lay-skin="line">
                <tbody>
                  <tr>
                    <th width="80">事件编号：</th>
                    <td>${e.f_eventNum}</td>
                    <th width="80">事件状态：</th>
                    <td id='zhuang'>${e.f_state}</td>
                  </tr>
                  <tr>
                   <th>事件名称：</th>
                    <td>${e.f_eventName}</td>
                    <th>详细地址：</th>
                    <td>${e.f_address}</td>
                  </tr>
                  <tr>
                    <th>事件等级：</th>
                    <td>${e.f_level}</td>
                    <th>发生时间：</th>
                    <td>${e.f_time}</td>
                  </tr>
                  <tr>
                    <th>事件类型：</th>
                    <td>${e.f_type}</td>
                     <th>上报人：</th>
                    <td>${e.t_report}</td>
                  </tr>
                  <tr>
                    <th>事件区域：</th>
                    <td>${e.f_area}</td>
                  </tr>
                   <tr>
                    <th>伤亡人数：</th>
                    <td>${e.f_casualty}</td>
                  </tr>
                    <tr>
                    <th>报警人员：</th>
                    <td>${e.t_alarm}</td>
                  </tr>
                       <tr>
                    <th>报警人员联系方式：</th>
                    <td>${e.f_alarmTel}</td>
                  </tr>
                    <tr>
                    <th>${type1}</th>
                    <td>${describe1}</td>
                  </tr>
                    <tr>
                    <th>${type}</th>
                    <td>${describe}</td>
                   
                  </tr>
                </tbody>
              </table>
            </div>
          
        </div>
        
         <div class="layui-form news_list">
         <h1>续报表</h1>
                    <table class="layui-table">
					    <colgroup>
						<col width="20%">
						<col width="20%">
						<col width="20%">
						<col width="20%">
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
					<c:forEach var="u1" items="${conli}">
						<tr>
							<td align="left">${u1.f_level}</td>
							<td>${u1.t_report}</td>
							<td>${u1.f_AlarmMan}</td>
							<td>${u1.f_Alarntel}</td>
							<td>${u1.f_repTime}</td>
							<td>${u1.f_casualty}</td>
						</tr>
						</c:forEach>
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
					<c:forEach var="u2" items="${resli}">
						<tr>
							<td align="left">${u2.f_Duty}</td>
							<td>${u2.f_DutyTel}</td>
							<td>${u2.f_fname}</td>
							<td>${u2.f_Type}</td>
							<td>${u2.f_dispatchTime}</td>
							<td>${u2.f_perNum}</td>
							<td>${u2.f_carNum}</td>
							<td>${u2.f_outDate}</td>
							<td class="td-manage">
							  <a title="查看详情" href="javascript:;" onclick="admin_edit('编辑','showResource.lovo?id=${u2.pk_id}','4','','510')"
                            class="ml-5" style="text-decoration:none">
                                <i class="layui-icon">&#xe642;</i>
                            </a>
                            
							</td>
						</tr>
						</c:forEach>
					</tbody>
					</table>
			    </div>
			    
			    
			       <div style='display:none;' class="layui-form-item" id='diao'>
                  <a style="left: 50px"  href='jsp/schedulingResources.jsp' class="layui-btn search_btn">资源调度</a>
                </div>
                
	   <script src="jquery-2.1.4.js"></script>  
        <script src="jsp/lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="jsp/js/x-layui.js" charset="utf-8">
        </script>
        <script>
        
       $(function () {
    	
     	 var a=  $("#zhuang").html();
    	 if(a!='已处理'){
    		 $("#diao").show();
    	 } 
	});
      
        
        
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