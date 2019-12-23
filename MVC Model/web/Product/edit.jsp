<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 08/11/2019
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <fieldset>
        <legend>Product Impormation</legend>
    <table>
        <tr>
            <td>Name : </td>
            <td><input type = "text" name = "name" id = "name" value= "${requestScope["Product"].getProductName}" ></td>
        </tr>
        <tr>
            <td>Product Price : </td>
            <td><input type = "text" name = "productPrice" id = "productPrice" value="${requestScope["Product"].getProductPrice}"></td>
        </tr>
        <tr>
            <td>Description : </td>
            <td><input type = "text" name = "description" id="description" value="${requestScope["Product"].getDescription}"></td>
        </tr>
        <tr>
            <td>Producer : </td>'
            <td><input type = "text" name = "producer" id = "producer" value="${requestScope["Product"].getProducer}"></td>
        </tr>
    </table>
    </fieldset>
</form>
</body>
</html>
