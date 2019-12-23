<%--
  Created by IntelliJ IDEA.
  User: tranv
  Date: 11/11/2019
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Staff list</title>
</head>
<body>
<h1>Staff list</h1>
<p><a href="/staff?action=create">Create new staff</a> </p>
<table border="1">
    <tr>
        <td>ID Staff</td>
        <td>Name</td>
        <td>Gender</td>
        <td>Age</td>
        <td>Address</td>
        <td>Phone Number</td>
        <td>Delete By</td>
        <td>Delete Date</td>
        <td>Modify By</td>
        <td>Modify Date</td>
        <td>Create By</td>
        <td>Create Date</td>
        <td>Edit</td>
        <td>Delete</td>

    </tr>
    <c:forEach items='${requestScope["staffs"]}' var="staff">
        <tr>
            <td>${staff.getIdStaff()}</td>
            <td><a href="/staff?action=view&idStaff=${staff.getIdStaff()}">${staff.getName()}</a></td>
            <td>${staff.getGender()}</td>
            <td>${staff.getAge()}</td>
            <td>${staff.getAddress()}</td>
            <td>${staff.getPhoneNumber()}</td>

            <td>${staff.getDeleteBy()}</td>
            <td>${staff.getDeleteDate()}</td>
            <td>${staff.getModifyBy()}</td>
            <td>${staff.getModifyDate()}</td>
            <td>${staff.getCreatBy()}</td>
            <td>${staff.getCreatDate()}</td>
            <td><a href="/staff?action=edit&idStaff=${staff.getIdStaff()}">edit</a></td>
            <td><a href="/staff?action=delete&idStaff=${staff.getIdStaff()}">delete</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>