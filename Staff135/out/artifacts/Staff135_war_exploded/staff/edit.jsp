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
    <title>Edit staff</title>
</head>
<body>
<h1>Edit staff</h1>
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
                <td><input type="text" name="name" id="name" value="${requestScope["staff"].getName()}"></td>
            </tr>
            <tr>
                <td>Gender: </td>
                <td><input type="text" name="gender" id="gender" value="${requestScope["staff"].getGender()}"></td>
            </tr>
            <tr>
                <td>Age: </td>
                <td><input type="text" name="age" id="age" value="${requestScope["staff"].getAge()}"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="address" id="address" value="${requestScope["staff"].getAddress()}"></td>
            </tr>
            <tr>
                <td>Phone Number: </td>
                <td><input type="text" name="phoneNumber" id="phoneNumber" value="${requestScope["staff"].getPhoneNumber()}"></td>
            </tr>
            <tr>
                <td>Create By: </td>
                <td><input type="text" name="creatBy" id="creatBy" value="${requestScope["staff"].getCreatBy()}"></td>
            </tr>
            <tr>
                <td>Create Date: </td>
                <td><input type="text" name="creatDate" id="creatDate" value="${requestScope["staff"].getCreatDate()}"></td>
            </tr>
            <tr>
                <td>Modify By: </td>
                <td><input type="text" name="modifyBy" id="modifyBy" value="${requestScope["staff"].getModifyBy()}"></td>
            </tr>
            <tr>
                <td>Modify Date: </td>
                <td><input type="text" name="modifyDate" id="modifyDate" value="${requestScope["staff"].getModifyDate()}"></td>
            </tr>
            <tr>
                <td>Delete By: </td>
                <td><input type="text" name="deleteBy" id="deleteBy " value="${requestScope["staff"].getDeleteBy()}"></td>
            </tr>
            <tr>
                <td>Delete Date: </td>
                <td><input type="text" name="deleteDate" id="deleteDate" value="${requestScope["staff"].getDeleteDate()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update staff"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>

