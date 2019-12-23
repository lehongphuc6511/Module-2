<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 13/11/2019
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Staffs</title>
</head>
<body>
<h1>Staffs details</h1>
<p>
    <a href="/staff">Back to staffs list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["staff"].getName()}</td>
    </tr>
    <tr>
        <td>Gender: </td>
        <td>${requestScope["staff"].getGender()}</td>
    </tr>
    <tr>
        <td>Age: </td>
        <td>${requestScope["staff"].getAge()}</td>
    </tr>
    <tr>
        <td>Address: </td>
        <td>${requestScope["staff"].getAddress()}</td>
    </tr>
    <tr>
        <td>Phone Number: </td>
        <td>${requestScope["staff"].getPhoneNumber()}</td>
    </tr>
    <tr>
        <td>Create By: </td>
        <td>${requestScope["staff"].getCreatBy()}</td>
    </tr>
    <tr>
        <td>Create Date: </td>
        <td>${requestScope["staff"].getCreatDate()}</td>
    </tr>

</table>
</body>
</html>