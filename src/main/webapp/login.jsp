<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/30
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<%
    String msg=null;
    msg=(String)request.getAttribute("msg");
    if(msg!=null){
        out.println(msg);
    }
%>
    <form action="login">
        <table>
            <tr>
                <td>
                    用户名:<input type="text" name="username"/>
                </td>
            </tr>
            <tr>
                <td>
                    密码:<input type="password" name="password"/>
                </td>
            </tr>
        </table>
    </form>

</body>
</html>
