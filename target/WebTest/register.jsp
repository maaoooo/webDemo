<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/30
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
        注册<hr/>
        <form action="register" method="post">
            <fieldset>
                <table>
                    <tr>
                        <td>用户名：</td>
                        <td>
                            <input name="username" type="text"/>
                        </td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td>
                            <input name="password" type="password"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" name="提交"/>
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
</body>
</html>
