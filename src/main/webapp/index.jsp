<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.js"></script>
</head>
<body>
<%--<form action="/login" method="post">
    用户： <input name="uname" type="text" style="width: 150px"><br>
    <br>
    密码： <input name="upwd" type="password" style="width: 150px"><br>
    <br>
    <input type="submit" value="登录" style="width: 220px">
</form>--%>
<form id="form">
    用户： <input name="uname" type="text" style="width: 150px"><br>
    <br>
    密码： <input name="upwd" type="password" style="width: 150px"><br>
    <br>
    <input type="button" value="登录" style="width: 220px" onclick="login()">
    <font color="red"><span id="tip"></span></font>
</form>
</body>
<script>
    function login() {
        $.ajax({
           "url":"/login",
           "type":"post",
           "dataType":"json",
           "data":$("#form").serialize(),
           "success":function (json) {
               window.location="/toList";
           },
            "error":function (XMLHttpRequest) {
                $("#tip").text(JSON.parse(XMLHttpRequest.responseText).message);
            }
        });
    }
</script>
</html>
