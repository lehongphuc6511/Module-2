<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 29/11/2019
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/result">
    <table>
        <tr>
            <td><h2><input type="checkbox" name="condiment" value="Lettuce">Lettuce</h2></td>
            <td><h2><input type="checkbox" name="condiment" value="Tomato">Tomato</h2></td>
            <td><h2><input type="checkbox" name="condiment" value="Mustard">Mustard</h2></td>
            <td><h2><input type="checkbox" name="condiment" value="Sprouts">Sprouts</h2></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save"></td>
        </tr>
    </table>
    <h1>Your choose list</h1>
    <h2>${condiment[0]}</h2>
    <h2>${condiment[1]}</h2>
    <h2>${condiment[2]}</h2>
    <h2>${condiment[3]}</h2>
</form>
</body>
</html>
