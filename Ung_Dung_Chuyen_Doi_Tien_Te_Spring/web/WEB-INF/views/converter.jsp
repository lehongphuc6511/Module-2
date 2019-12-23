<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 26/11/2019
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>currency converter</title>
</head>
<body>
<form method="post" action="/result">
    <label>USD: </label>
    <input type="text" name="usd" placeholder="USD" value="${usd}"><br>

    <input type="submit" id="submit" value="Switch to VND">
</form>
<h1>VND: </h1>
<h1>${result}</h1>
</body>
</html>
