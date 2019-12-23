<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 19/11/2019
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>ID: </td>
        <td>${requestScope["products"].getId()}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${requestScope["products"].getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["products"].getPrice()}</td>
    </tr>
    <tr>
        <td>Type: </td>
        <td>${requestScope["products"].getType()}</td>
    </tr>

</table>
</body>
</html>
