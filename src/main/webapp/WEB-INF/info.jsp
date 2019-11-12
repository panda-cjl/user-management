<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息</title>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.js"></script>
</head>
<body>
    编号：<input type="text" value="${user.ucode}"><br>
     <br>
    用户：<input value="${user.uname}" type="text" style="width: 200px"><br>
     <br>
    <input id="type" type="checkbox" name="utype" ${user.utype == 1 ? "checked" : ""} value="${user.utype}">
    管理员</font><br>
     <br>
    备注：<input type="text" style="width: 200px"><br>
     <br>
    <hr>
    <input type="button" value="返回列表" onclick="window.location='/toList'">
</body>
<script>

</script>
</html>
