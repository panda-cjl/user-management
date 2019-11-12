<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
    <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.js"></script>
    <style type="text/css">
        td{
            text-align: center;
        }
    </style>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <td>编号</td>
                <td>用户</td>
                <td>密码</td>
                <td>类型</td>
                <td>备注</td>
                <td>操作</td>
            </tr>
        </thead>
        <tbody id="users">
<%--            <tr>
                <td>{ucode}</td>
                <td>{uname}</td>
                <td>{upwd}</td>
                <td>{utype}</td>
                <td></td>
                <td>
                    <input type="button" value="新增" onclick="window.location='/toAdd'">
                    <input id="{updateId}" type="button" value="修改" onclick="window.location='/toUpdate/{ucode}'">
                    <input id="{deleteId}" type="button" value="删除" onclick="window.location='/delete/{ucode}'">
                    <input type="button" value="详细" onclick="window.location='/info/{ucode}'">
                </td>
            </tr>--%>
        </tbody>
    </table>
</body>
<script>
    $(function () {
        $.ajax({
           "url":"/showList",
           "dataType":"json",
           "success":function (list) {
               $("#users").empty();
               for (let i=0;i<list.length;i++){
                   let html = '     <tr>\n' +
                       '                <td>{ucode}</td>\n' +
                       '                <td>{uname}</td>\n' +
                       '                <td>******</td>\n' +
                       '                <td>{utype}</td>\n' +
                       '                <td></td>\n' +
                       '                <td>\n' +
                       '                    <input class="add" type="button" value="新增" onclick="window.location=\'/toAdd\'">\n' +
                       '                    <input id="{updateId}" type="button" value="修改" onclick="window.location=\'/toUpdate/{ucode}\'">\n' +
                       '                    <input id="{deleteId}" type="button" value="删除" onclick="window.location=\'/delete/{ucode}\'">\n' +
                       '                    <input type="button" value="详细" onclick="window.location=\'/toInfo/{ucode}\'">\n' +
                       '                </td>\n' +
                       '            </tr>'
                   html = html.replace(/{ucode}/g, list[i].ucode);
                   html = html.replace(/{uname}/g, list[i].uname);
                   html = html.replace(/{utype}/g, list[i].utype == 1 ? "管理员" : "普通用户");
                   html = html.replace(/{updateId}/g, "update" + i);
                   html = html.replace(/{deleteId}/g, "delete" + i);
                   $("#users").append(html);

                   if ((${sessionScope.userLogin.utype}) === 1){
                       if (list[i].ucode === ${sessionScope.userLogin.ucode}){
                           $("#update" + i).attr("disabled", true);
                           $("#delete" + i).attr("disabled", true);
                       }
                   }else{
                       $(".add").attr("disabled", true);
                       $("#delete" + i).attr("disabled", true);
                       if(list[i].ucode !== (${sessionScope.userLogin.ucode})){
                           $("#update" + i).attr("disabled", true);
                       }
                   }

               }
           }
        });
    })
</script>
</html>
