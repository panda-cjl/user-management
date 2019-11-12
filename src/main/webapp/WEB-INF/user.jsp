<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息</title>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.js"></script>
</head>
<body>
<form action="/save" method="post">
    <input hidden name="ucode" value="${user.ucode}">
    <font color="red">用户：</font><input name="uname" value="${user.uname}" type="text" style="width: 200px"><br>
    <font color="red">密码：</font><input type="password" id="pwd1" name="upwd" value="${user.upwd}" type="text" style="width: 200px"><br>
    <font color="red">密码确认：</font><input type="password" id="pwd2" type="text" style="width: 200px" onkeyup="checkPwd()">
    <span id="tip"></span><br>
    <input id="type" type="checkbox" name="utype" ${user.utype == 1 ? "checked" : ""} value="${user.utype}"><font
        color="red">管理员</font><br>
    备注：<input type="text" style="width: 200px">
    <hr>
    <input type="button" value="返回列表" onclick="window.location='/toList'"> <input type="submit" id="save" value="保存">
</form>
</body>
<script>
    $(function () {
        if ((${sessionScope.userLogin.utype}) !== 1){
            $("#type").attr("disabled",'disabled');
        }
        $("#type").click(function () {
            if ($("#type").is(":checked")) {
                this.value = 1;
            } else {
                this.value = 0;
            }
        })
    })

    function checkPwd() {
        let pwd1 = $("#pwd1").val();
        let pwd2 = $("#pwd2").val();
        if (pwd1 != pwd2) {
            $("#tip").html("<font color='red'>两次密码不相同</font>")
            $("#save").attr("disabled",true);
        }else{
            $("#tip").empty();
            $("#save").removeAttr("disabled");
        }

    }
</script>
</html>
