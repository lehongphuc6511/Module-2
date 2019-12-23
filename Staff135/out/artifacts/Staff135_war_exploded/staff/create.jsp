<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 13/11/2019
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h1>Create new staff</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/staff">Back to staff list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Staff information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Gender: </td>
                <td><input type="text" name="gender" id="gender"></td>
            </tr>
            <tr>
                <td>Age: </td>
                <td><input type="text" name="age" id="age"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" id="address"></td>
            </tr>
            <tr>
                <td>Phone Number: </td>
                <td><input type="text" name="phoneNumber" id="phoneNumber"></td>
            </tr>
            <tr>
                <td>Create By: </td>
                <td><input type="text" name="creatBy" id="creatBy"></td>
            </tr>
            <tr>
                <td>Create Date: </td>
                <td><input type="text" name="creatDate" id="creatDate"></td>
            </tr>


            <tr>
                <td></td>
                <td><input type="submit" value="Create staff"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

