<%--
  Created by IntelliJ IDEA.
  User: mazino
  Date: 2021-12-30
  Time: 오후 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- 상대경로 [현재 URL이 속한 계층 경로 + /save] -->
<form action="save" method="post">
    username : <input type="text" name="username" />
    age      : <input type="text" name="age" />
    <button type="submit">전송</button>
</form>

</body>
</html>
