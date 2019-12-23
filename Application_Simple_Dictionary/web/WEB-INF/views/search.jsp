<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 26/11/2019
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/result">
    <input type="text" name="world" value="${world}">
    <input type="submit" value="Change From To Vietnames">
</form>
<h1>World is mean: </h1>
<h1>${translate}</h1>
</body>
</html>
