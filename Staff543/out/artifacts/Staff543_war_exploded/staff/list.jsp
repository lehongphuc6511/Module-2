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
    <title>Staff List</title>
</head>
<body>
<h1>Staffs</h1>
<p>
    <a href="/staff?action=create">Create new staffs</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Gender</td>
        <td>Age</td>
        <td>Address</td>
        <td>Phone Number</td>
        <td>Create By</td>
        <td>Create Date</td>
        <td>Edit</td>
        <td>Delete</td>

    </tr>
    <c:forEach items='${requestScope["staff"]}' var="staff">
        <tr>
            <td><a href="/staff?action=view&idStaff=${staff.getIdStaff()}">${staff.getName()}</a></td>
            <td>${staff.getGender()}</td>
            <td>${staff.getAge()}</td>
            <td>${staff.getAddress()}</td>
            <td>${staff.getPhoneNumber()}</td>
            <td>${staff.getCreatBy()}</td>
            <td>${staff.getCreatDate()}</td>


            <td><a href="/staff?action=edit&idStaff=${staff.getIdStaff()}">edit</a></td>
            <td><a href="/staff?action=delete&idStaff=${staff.getIdStaff()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

