<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>上报系统</title>
	<meta name="renderer" content="webkit">	
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">	
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">	
	<meta name="apple-mobile-web-app-status-bar-style" content="black">	
	<meta name="apple-mobile-web-app-capable" content="yes">	
	<meta name="format-detection" content="telephone=no">	
	<link rel="stylesheet" type="text/css" href="common/layui/css/layui.css" media="all">
	<link rel="stylesheet" type="text/css" href="common/bootstrap/css/bootstrap.css" media="all">
	<link rel="stylesheet" type="text/css" href="common/global.css" media="all">
	<link rel="stylesheet" type="text/css" href="css/personal.css" media="all">
	<style type="text/css">
	.sel{
    height: 36px;
    width: 123px;
	}
	</style>
	<script type="text/javascript" src="../jquery-2.1.4.js"></script>
	<script>
		$(function(){
			$.post("../workList.lovo",callBack,'JSON')
		})
		function callBack(data){
		}
	</script>
</head>
<body>
<section class="layui-larry-box">
	<div class="larry-personal">
	    <div class="layui-tab">
            <blockquote class="layui-elem-quote news_search">
		
		<div class="layui-inline">
		    
		    <form action="../findWorkByItem.lovo" method="post">
		    
			    <div class="layui-input-inline">
			    	<input name="startDate" placeholder="起始日期" class="layui-input search_input" type="date">
			    	
			    </div>
			     <div class="layui-input-inline">
			    	<input name="endDate" placeholder="结束日期" class="layui-input search_input" type="date">
			    	
			    </div>
			    <div class="layui-input-inline">
			    	<input name="name" placeholder="请输入姓名" class="layui-input search_input" type="text">
			    </div>
			
			    <input type="submit" id="find"  value="查询" class="layui-btn search_btn">
		    </form>
		    <a href="../addWorkFindAllUser.lovo" class="layui-btn search_btn">添加值班人员</a>
		    
		    
		</div>
		
		<div class="layui-inline">
			<div class="layui-form-mid layui-word-aux">关闭页面所有数据重置</div>
		</div>
	</blockquote>
		         <!-- 操作日志 -->
                <div class="layui-form news_list">
                    <table class="layui-table">
					    <colgroup>
						<col>
						<col width="20%">
						<col width="20%">
						<col width="20%">
						<col width="20%">
						<col width="20%">
						
					</colgroup>
					<thead>
						<tr>

							<th style="text-align:left;">姓名</th>
							<th>上班时间</th>
							<th>下班时间</th>
							<th>值班日志</th>
							
							<th>操作</th>
						</tr>
					</thead>
					<tbody class="news_content">
						<c:forEach var="w" items="${workList}">
							<tr>
								<td  align="left">${w.userName}</td>
								<td>${w.startDate}</td>
								<td>${w.endDate}</td>
								<td>${w.log}</td>
								<td>
									<a href="../delWork.lovo?id=${w.workID}" class="layui-btn layui-btn-mini news_edit" data-url="delWork.lovo" ><i class="iconfont icon-edit"></i>删除</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
					</table>
                     <div class="larry-table-page clearfix">
                         
				          <div id="page" class="page"></div>
			         </div>
			    </div>
			   
		    </div>
		</div>
	
</section>
 <script src="../jquery-2.1.4.js"></script>
<script type="text/javascript" src="common/layui/layui.js"></script>
<script type="text/javascript">
/*     $("body").on("click",".news_edit",function(){  //编辑
	layer.alert('您点击了文章编辑按钮，由于是纯静态页面，所以暂时不存在编辑内容，后期会添加，敬请谅解。。。',{icon:6, title:'文章编辑'});
    }) */
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