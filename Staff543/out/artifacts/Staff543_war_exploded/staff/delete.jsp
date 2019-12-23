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
    <title>Deleting staff</title>
</head>
<body>
<h1>Delete staff</h1>
<p>
    <a href="/staff">Back to staff list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Staff information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>"${requestScope["staff"].getName()}"></td>
            </tr>
            <tr>
                <td>Gender: </td>
                <td>"${requestScope["staff"].getGender()}"></td>
            </tr>
            <tr>
                <td>Age: </td>
                <td>"${requestScope["staff"].getAge()}"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>"${requestScope["staff"].getAddress()}"></td>
            </tr>
            <tr>
                <td>Phone Number: </td>
                <td>"${requestScope["staff"].getPhoneNumber()}"></td>
            </tr>
            <tr>
                <td>Delete By: </td>
                <td>"${requestScope["staff"].getDeleteBy()}"></td>
            </tr>
            <tr>
                <td>Delete Date: </td>
                <td>"${requestScope["staff"].getDeleteDate()}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete staff"></td>
                <td><a href="/staff">Back to staff list</a></td>
            </tr>
        </table>
    </fieldset>
</body>
</html>
