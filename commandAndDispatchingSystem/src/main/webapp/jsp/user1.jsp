<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
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
        <div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>会员管理</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="javascript:location.replace(location.href);" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
        </div>
        <div class="x-body">
    
           
            <table class="layui-table" id='tab'>
                <thead>
                    <tr>
                        <th>
                            ID
                        </th>
                        <th>
                            登录名
                        </th>

                        <th>
                            操作
                        </th>
                    </tr>
                </thead>
                <tbody>
                  <c:forEach var="u1" items="${userli}">
                     <tr name='new'> 
                         <td>${u1.userID}</td>
                        <td>${u1.userName}</td>
                        <td class="td-manage">
                    
                            <a title="编辑角色" href="javascript:;" onclick="admin_edit('编辑','findListRole.lovo?id=${u1.userID}','4','','510')"
                            class="ml-5" style="text-decoration:none">
                                <i class="layui-icon">&#xe642;</i>
                            </a>
                            <a title="删除" href="javascript:;" onclick="admin_del(this,'1')" 
                            style="text-decoration:none">
                                <i class="layui-icon">&#xe640;</i>
                            </a>
                        </td>
                        </tr>
                     </c:forEach>
                </tbody>
            </table>
          
            <div id="page"></div>
        </div>
        <input type="hidden" value="${zong}">
         <script src="jquery-2.1.4.js"></script>
        <script src="jsp/lib/layui/layui.js" charset="utf-8"></script>
        <script src="jsp/js/x-layui.js" charset="utf-8"></script>
        <script>
        
     
        $()
        
        function cha1(data) {
 		   var $table=$("#tab");
 	        $("tr[name=new]").remove();
 	        
 		    $.each(data,function(i,e){
 	           var tr ="<tr name='new'> "+
                   "<td>"+e.userID+"</td>"+
                  " <td>"+e.userName+"</td>"+
                   "<td class='td-manage'>"+
                       "<a  title='编辑角色' href='javascript:;' onclick=admin_edit('编辑','findListRole.lovo?id="+e.userID+"','4','','510')"+
                       " class='ml-5' style='text-decoration:none'>"+
                           "<i class='layui-icon'>&#xe642;</i>"+
                      " </a>"+
                       
                   "</td>"+
                   "</tr>"

 	            $table.append(tr);
 	        
 	         });

        }
        
        
        
            layui.use(['laydate','element','laypage','layer'], function(){
                $ = layui.jquery;//jquery
              laydate = layui.laydate;//日期插件
              lement = layui.element();//面包导航
              laypage = layui.laypage;//分页
              layer = layui.layer;//弹出层

              //以上模块根据需要引入

              laypage({
                cont: 'page'
                ,pages: $("input[type=hidden]").val()
                ,first: 1
                ,last: $("input[type=hidden]").val()
                ,prev: '<em><</em>'
                ,next: '<em>></em>'
                 ,jump: function(obj, first) {
						//得到了当前页，用于向服务端请求对应数据
						var curr = obj.curr;
					
				 			 $.post("chauser.lovo",{curr:curr},
				 				cha1
				 			      ,"json")
						
						
						if(!first) {
							//layer.msg('第 '+ obj.curr +' 页');
						}
					}
              }); 
              
            
         
              
            });

             /*添加*/
            function admin_add(title,url,w,h){
                x_admin_show(title,url,w,h);
            }

            //编辑
            function admin_edit (title,url,id,w,h) {
                x_admin_show(title,url,w,h); 
            }
            /*删除*/
            /* function admin_del(obj,id){
                layer.confirm('确认要删除吗？',function(index){
                    //发异步删除数据
                    alert(id)
                  $.post("deluser.lovo",{id:id}
				 			      ,"json")
						
                    $(obj).parents("tr").remove();
                    layer.msg('已删除!',{icon:1,time:1000});
                });
            } */
            </script>
            
    </body>
</html>