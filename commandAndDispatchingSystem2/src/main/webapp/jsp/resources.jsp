<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>资源详情</title>
</head>
<body>
<div style="text-align:center">
     <h1>资源详情</h1>
     <table border="1" style="position: relative;
            right: -35%;">
     <tr><th>资源类型</th><th>资源名称</th><th>归还时间</th></tr>
     <c:forEach  var="u2" items="${reli}" >
     <tr><td>${u2.t_type}</td>
     <td>${u2.f_name}</td>
     <td>${u2.f_backDate}</td>
     </tr>
     </c:forEach>
   
     </table>
     </div>
</body>
</html>