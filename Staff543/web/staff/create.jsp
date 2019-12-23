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
    <title>Create Staff</title>
    <style>
        .message {
            color:green;
        }
    </style>
</head>
<body>
<h1>Create Staff</h1>
<p> <c:if test='${requestScope["message"] != null}'>
    <span class="message">${requestScope["message"]}</span>
</c:if>
</p>
<p>
    <a href="/staff">Back to Staff</a>
</p>
<form method="post">
    <fieldset>
        <legend>Staff information</legend>
        <table>
            <tr>
                <td> Name Staff:</td>
                <td><input type="text" name="name" id = "name"> </td>
                <td> Gender:</td>
                <td><input type="text" name="gender" id = "gender"> </td>
                <td> Age:</td>
                <td><input type="text" name="age" id = "age"> </td>
                <td> Address Staff:</td>
                <td><input type="text" name="address" id = "address"> </td>
                <td> Phone Number:</td>
                <td><input type="text" name="phoneNumber" id = "phoneNumber"> </td>
            </tr>
            <tr>
                <td>Create By:</td>
                <td><input type="text" name="createBy" id = "createBy"/> </td>
            </tr>
            <tr>
                <td><input type="submit" value="Create Staff" ></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

