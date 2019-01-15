<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>派遣</title>
<style type="text/css">
#aaa{

position: relative;
left: 280px;

}
#bbb{

position: relative;
left: 780px;
top:-235px;

}
#ccc{

position: relative;
left: 380px;
top:-535px;

}


</style>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" type="text/css" href="common/layui/css/layui.css"
	media="all">
<link rel="stylesheet" type="text/css"
	href="common/bootstrap/css/bootstrap.css" media="all">
<link rel="stylesheet" type="text/css" href="common/global.css"
	media="all">
<link rel="stylesheet" type="text/css" href="css/personal.css"
	media="all">
<script src="jquery-2.1.4.js"></script>
<script>
	$(function() {
		$(":button[name=allright]").click(allRig);
		$(":button[name=allleft]").click(allle);
		$(":button[name=selectleft]").click(selectle);
		$(":button[name=selectright]").click(selectRig);
		
		$(":button[name=allright1]").click(allRig1);
		$(":button[name=allleft1]").click(allle1);
		$(":button[name=selectleft1]").click(selectle1);
		$(":button[name=selectright1]").click(selectRig1);
	});

	function allRig() {
		var arry = $("#id1").children();
		var arry2 = $("#id2");
		arry2.append(arry);
	}

	function allle() {
		var arry = $("#id2").children();
		var arry2 = $("#id1");
		arry2.append(arry);
	}

	function selectle() {
		var arry = $("#id2 option:selected");
		var arry2 = $("#id1");
		arry2.append(arry);
	}

	function selectRig() {
		var arry = $("#id1 option:selected");
		var arry2 = $("#id2");
		arry2.append(arry);
	}
	
	
	function allRig1() {
		var arry = $("#id3").children();
		var arry2 = $("#id4");
		arry2.append(arry);
	}

	function allle1() {
		var arry = $("#id4").children();
		var arry2 = $("#id3");
		arry2.append(arry);
	}

	function selectle1() {
		var arry = $("#id4 option:selected");
		var arry2 = $("#id3");
		arry2.append(arry);
	}

	function selectRig1() {
		var arry = $("#id3 option:selected");
		var arry2 = $("#id4");
		arry2.append(arry);
	}
</script>
</head>

<body>

			<section class="layui-larry-box">
		<div class="larry-personal">
			<div class="layui-tab"style="position: relative;
left: 520px;">
			
			</div>
				<div class="layui-inline" style="position: relative;
left: 520px;">
						<p class="layui-btn layui-btn-normal newsAdd_btn">当前事件:<span>aaaa</span></p>
					</div>
			<div id="aaa">
				<p class="layui-btn layui-btn-normal newsAdd_btn">人员派遣表</p>
				<p>
					<select name="num1" id="id1" multiple
						style="width: 100px; height: 120px">
						<option value="one" ondblclick="chuangji(this)">一一一</option>
						<option value="two" ondblclick="chuangji(this)">二二二</option>
						<option value="three" ondblclick="chuangji(this)">三三三</option>
						<option value="four" ondblclick="chuangji(this)">四四四</option>
						<option value="five" ondblclick="chuangji(this)">五五五</option>
						<option value="six" ondblclick="chuangji(this)">六六六</option>
					</select> <select name="num2" id="id2" multiple
						style="width: 100px; height: 120px">
					</select><br> <br> <input type="button" name="allleft"
						value="全部左移"> <input type="button" name="allright"
						value="全部右移"> <input type="button" name="selectleft"
						value="选中左移"> <input type="button" name="selectright"
						value="选中右移">
				</p>
	
				<div class="layui-input-inline"style="position: relative;
left: 250px; top:-90px" >
				<p class="layui-btn layui-btn-normal newsAdd_btn" >选择负责人</p>
							<select>
								<option>动态获取负责人</option>
								<option>已处理事件</option>
							</select></p>
						</div>
			</div>

			<div id="bbb">
				<p class="layui-btn layui-btn-normal newsAdd_btn">车辆派遣表</p>
				<p>
					<select name="num1" id="id3" multiple
						style="width: 100px; height: 120px">
						<option value="one" ondblclick="chuangji(this)">一一一</option>
						<option value="two" ondblclick="chuangji(this)">二二二</option>
						<option value="three" ondblclick="chuangji(this)">三三三</option>
						<option value="four" ondblclick="chuangji(this)">四四四</option>
						<option value="five" ondblclick="chuangji(this)">五五五</option>
						<option value="six" ondblclick="chuangji(this)">六六六</option>
					</select> <select name="num2" id="id4" multiple
						style="width: 100px; height: 120px">
					</select><br> <br> <input type="button" name="allleft1"
						value="全部左移"> <input type="button" name="allright1"
						value="全部右移"> <input type="button" name="selectleft1"
						value="选中左移"> <input type="button" name="selectright1"
						value="选中右移">
				</p>
				
<a class="layui-btn search_btn" class="layui-btn layui-btn-normal newsAdd_btn" style="position: relative;
left: -200px; top:-10px" href="main2.jsp">确定</a>
			</div>
			
		</div>

	</section>
	<script type="text/javascript" src="common/layui/layui.js"></script>
	<script type="text/javascript" src="js/newslist.js"></script>
			
		</div>
	</div>
	<!-- 底部区域 -->
	<div class="layui-footer layui-larry-foot" id="larry-footer">
		<div class="layui-mian">  
		    <p class="p-admin">
		    	<span>2019 &copy;</span>
		    	  
		    </p>
		</div>
	</div>
</div>
<!-- 加载js文件-->                                                                                                                                                                                           
	<script type="text/javascript" src="common/layui/layui.js"></script> 
	<script type="text/javascript" src="js/larry.js"></script>
	<script type="text/javascript" src="js/index.js"></script>


	
</body>
</html>