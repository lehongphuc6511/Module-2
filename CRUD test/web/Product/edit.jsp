<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 20/11/2019
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <a href="/Product">Back</a>
</p>
<form method="post">

<table border="1">
    <tr>
        <td>Name:</td>
        <td><input type="text" name="name" id="name" value="${requestScope["products"].getName()}"></td>
    </tr>
    <tr>
        <td>Price:</td>
        <td><input type="text" name="price" id="price" value="${requestScope["products"].getPrice()}"></td>
    </tr>
    <tr>
        <td>Type:</td>
        <td><input type="text" name="type" id="type" value="${requestScope["products"].getType()}"></td>
    </tr>
    <tr>
        <td><input type="submit" value="Update"></td>
    </tr>
</table>
</form>
</body>
</html>
