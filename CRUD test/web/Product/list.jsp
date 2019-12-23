<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 19/11/2019
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<p>
    <a href="/Product?action=create">Create</a>
</p>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Price</td>
        <td>Type</td>
        <td>Edit</td>
        <td>Delete</td>

    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td>${product.getId()}</td>

            <td><a href="/Product?action=view&id=${product.getId()}">${product.getName()}</a></td>

            <td>${product.getPrice()}</td>

            <td>${product.getType()}</td>

            <td><a href= "/Product?action=edit&id=${product.getId()}">Edit</a></td>

            <td><a href="/Product?action=delete&id=${product.getId()}">Delete</a></td>
        </tr>
    </c:forEach>

</table>

</body>
</html>