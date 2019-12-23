<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 21/11/2019
  Time: 14:22
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
        <td>ID</td>
        <td>Name</td>
        <td>Address</td>
        <td>Phone</td>
        <td>Gender</td>
        <td>CreateBy</td>
        <td>CreateDate</td>
        <td>ModifyBy</td>
        <td>ModifyDate</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
<c:forEach items= '${requestScope["buyers"]}' var="buyer">

    <td>${buyer.getId()}</td>
    <td><a href="/Buyer?action=view&id=${buyer.getId()}">${buyer.getName()}</a></td>
    <td>${buyer.getAddress()}</td>
    <td>${buyer.getPhone()}</td>
    <td>${buyer.getGender()}</td>

    <td>${buyer.getCreateBy}</td>
    <td>${buyer.getCreateDate}</td>
    <td>${buyer.getModifyBy}</td>
    <td>${buyer.getModifyDate}</td>
    <td><a href="/Buyer?action=edit&id=${buyer.getId()}"></a>Edit</td>
    <td><a href="/Buyer?action=delete&id=${buyer.getId()}"></a>Delete</td>

</c:forEach>
</table>
</body>
</html>
