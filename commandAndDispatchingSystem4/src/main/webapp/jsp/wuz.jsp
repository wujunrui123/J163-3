<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>用户管理</title>
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
</head>
<script type="text/javascript" src="jquery-2.1.4.js"></script>

<script type="text/javascript">
	$(function() {
		var state = null;
		$.getJSON("../findCarList.lovo",{state:state},callBack);
		$("input[type=button]").click(chaxun);
	});
	
	function callBack(data){
		var $tbody=$("tbody");
		$tbody.empty();
		$.each(data, function(i, e){
			$tbody.append("<tr><td>"+e.plateNumber+"</td><td>"+e.state+"</td><td><a href='wuz2.jsp?id="+e.ziYuanId+"&che="+e.plateNumber+"' class='layui-btn layui-btn-mini news_edit' data-url='wuz2.jsp'><i class='iconfont icon-edit'></i>编辑</a></tr>");
		});
	}

	function chaxun(){
	
	var	state = $("input[name=state]").val();
	
		$.getJSON("../findCarList.lovo",{state:state},callBack);
	}
</script>
<body>
<section class="layui-larry-box">
	<div class="larry-personal">
	    <div class="layui-tab">
            <blockquote class="layui-elem-quote news_search">
		
		   <div class="layui-inline">
		    <div class="layui-input-inline">
		    	<input name="state" placeholder="请输入关键字" class="layui-input search_input" type="text">
		   </div>
		    <input type="button" class="layui-btn search_btn" value="查询"/>
		   </div><div class="layui-inline">
			<a class="layui-btn layui-btn-normal newsAdd_btn" href="wuz1.jsp">添加物资</a>
		</div>
		
	</blockquote>
		         <!-- 操作日志 -->
                <div class="layui-form news_list">
                    <table class="layui-table">
					    <colgroup>
						<col>
						<col width="9%">
						<col width="15%">
					</colgroup>
					<a class="layui-btn layui-btn-mini news_edit" style="font-size: 18px"><i class="iconfont icon-edit"></i>所有物资</a>
					<thead>
						<tr>						
							<th>车牌号码</th>
							<th>出勤状态</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody class="news_content">
						<!-- <tr>
							<td align="left">css3用transition实现边框动画效果</td>
							
							<td>川A12345</td>
							<td>派出</td>
						   
							<td>
								<a class="layui-btn layui-btn-mini news_edit" href="wuz2.jsp"><i class="iconfont icon-edit"></i>编辑</a>
								<a class="layui-btn layui-btn-danger layui-btn-mini news_del" data-id="1"><i class="layui-icon"></i> 删除</a>
							</td>
						</tr> -->
					</tbody>
					</table>
                     <div class="larry-table-page clearfix">
				          <div id="page" class="page"></div>
			         </div>
			    </div>
			     <!-- 登录日志 -->
			    <div class="layui-tab-item layui-field-box">
			          <table class="layui-table table-hover" lay-even="" lay-skin="nob">
                           <thead>
                              <tr>
                                  <th><input type="checkbox" id="selected-all"></th>
                                  <th>ID</th>
                                  <th>管理员账号</th>
                                  <th>状态</th>
                                  <th>最后登录时间</th>
                                  <th>上次登录IP</th>
                                  <th>登录IP</th>
                                  <th>IP所在位置</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <td><input type="checkbox"></td>
                                <td>110</td>
                                <td>admin</td>
                                <td>后台登录成功</td>
                                <td>2016-12-19 14:26:03</td>
                                <td>127.0.0.1</td>
                                <td>127.0.0.1</td>
                                <td>Unknown</td>
                              </tr>
                            </tbody>
			          </table>
			          <div class="larry-table-page clearfix">
                          <a href="javascript:;" class="layui-btn layui-btn-small"><i class="iconfont icon-shanchu1"></i>删除</a>
				          <div id="page2" class="page"></div>
			         </div>
			    </div>
		    </div>
		</div>
	
</section>
<script type="text/javascript" src="common/layui/layui.js"></script>
<script type="text/javascript" src="js/newslist.js"></script>
<script type="text/javascript">
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