<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 29/11/2019
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/Result">
    <input type="text" name="text1" id="text1">
    <input type="text" name="text2" id="text2">
    <input type="submit" name="operator" value="Addition(+)">
    <input type="submit" name="operator" value="Subtraction(-)">
    <input type="submit" name="operator" value="Multiplication(X)">
    <input type="submit" name="operator" value="Division(/)">
</form>
${result}


</body>
</html>
