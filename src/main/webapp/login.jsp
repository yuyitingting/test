<%--
  Created by IntelliJ IDEA.
  User: yaoyao
  Date: 2019-08-07
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
登录
${state}
<form method="post" action="login">
用户名:<input type="text" name="username">
密码:<input type="password" name="password">
<input type="submit">
</form>

</body>
</html>
