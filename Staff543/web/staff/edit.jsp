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
    <title>Edit Staff</title>
</head>
<body>
<h1>Edit Staff</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/staff">Back to Staff list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Staff information</legend>
        <table>
            <tr>
                <td>Name Staff: </td>
                <td><input type="text" name="name" id="name" value="${requestScope["staffs"].getName()}"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" id="address" value="${requestScope["staffs"].getAddress()}"></td>
            </tr>
            <tr>
                <td>PhoneNumber </td>
                <td><input type="text" name="phoneNumber" id="phoneNumber" value="${requestScope["staffs"].getPhoneNumber()}"></td>
            </tr>
            <tr>
                <td>Modify By</td>
                <td> <input type="text" name = "modifyBy" id = "modifyBy"/> </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update Staff"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
