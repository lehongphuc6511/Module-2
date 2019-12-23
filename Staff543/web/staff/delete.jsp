<%--
  Created by IntelliJ IDEA.
  User: tranv
  Date: 11/11/2019
  Time: 3:11 PM
  To change this template use File | Settings | File Templates.

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting employer</title>
</head>
<body>
<h1>Delete staff</h1>
<p>
    <a href="/staff">Back to stafflist</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Staff information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["staffs"].getName()}</td>
            </tr>
            <tr>
                <td>Gender: </td>
                <td>${requestScope["staffs"].getGender()}</td>
            </tr>
            <tr>
                <td>Age: </td>
                <td>${requestScope["staffs"].getAge()}</td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>${requestScope["staffs"].getAddress()}</td>
            </tr>
            <tr>
                <td>Phone Number: </td>
                <td>${requestScope["staffs"].getPhoneNumber()}</td>
            </tr>
            <tr>
                <td>Delete By: </td>
                <td> <input type="text" name = "deleteBy" id = "deleteBy"/> </td>
            </tr>

            <tr>
                <td><input type="submit" value="Delete staff"></td>
                <td><a href="/staff">Back to store list</a></td>
            </tr>
        </table>
    </fieldset>
</body>
</html>

