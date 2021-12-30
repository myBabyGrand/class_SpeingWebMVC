<%@ page import="hello.servlet.domain.member.Member" %><%--
  Created by IntelliJ IDEA.
  User: mazino
  Date: 2021-12-30
  Time: 오후 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id=<%=((Member)request.getAttribute("member")).getId()%></li>
    <li>username=${member.username}</li> <!--jsp에서 제공하는 편의 표기-->
    <li>age=${member.age}</li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>
