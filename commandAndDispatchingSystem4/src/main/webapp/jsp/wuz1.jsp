<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>库存车辆添加</title>
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
	#qqq{

	font-size: 18px;
	text-align: center;
	}
	
	</style>
</head>
<script type="text/javascript" src="jquery-2.1.4.js"></script>

<script type="text/javascript">

$(function() {
	
	$("input[type=button]").click(chaxun);
 });

	function chaxun(){
	
		 var plateNumber = $("input[name=plateNumber]").val();
		var state = $("select[name=state]  option:selected").text();
		$.getJSON("../AddCar.lovo",{plateNumber:plateNumber,state:state},callBack);
	};
	
	function callBack() {
		window.location.href="wuz.jsp";
	}
	
</script>
<body>
<section class="layui-larry-box">
	<div class="larry-personal">
	    <div class="layui-tab">
		         <!-- 操作日志 -->
                <div class="layui-form news_list">
               
					
					<div id="qqq">
					<a class="layui-btn layui-btn-mini news_edit"
									style="font-size: 18px"><i class="iconfont icon-edit"></i>添加车辆:</a>
				<br>	<br>车牌号码:<div class="layui-input-inline">
							<input name="plateNumber" placeholder="必填项"
								class="layui-input search_input" type="text">
						</div>
					
					
					<br><br>	出勤状态:<div class="layui-input-inline">
							<select class='sel' name="state">
								<option>在线</option>
								<option>出勤</option>
							</select>
						</div>
					<br><br><div class="layui-inline">
			<input type="button" class="layui-btn layui-btn-normal " value="添加">
		</div>
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