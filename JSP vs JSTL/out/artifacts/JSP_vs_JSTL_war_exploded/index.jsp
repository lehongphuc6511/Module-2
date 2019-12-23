<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 07/11/2019
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>DANH SACH KHACH HANG</title>
</head>
<body>
<form>
  <h2> Danh Sachs Khách Hàng!</h2>
  <table border="1" style="width: 500px;height: 400px">
    <tr>
      <th>Tên</th>
      <th>Ngày Sinh</th>
      <th>Địa Chỉ</th>
      <th>Ảnh</th>
    </tr>
    <tr>
      <td>
        <c:out value="${'Hai'}"/>
      </td>
      <td>
        <c:out value="${'30/12/1985'}"/>
      </td>

      <td>
        <c:out value="${'hue'}"/>
      </td>
      <td>
        <c:set var="image1" value="ass.jpg"/>
        <img src="${image1}" style="height: 80px;width: 80px">
      </td>
    </tr>
    <tr>
      <td>
        <c:out value="${'Hung'}"/>
      </td>
      <td>
        <c:out value="${'1/12/1995'}"/>
      </td>

      <td>
        <c:out value="${'Ha Noi'}"/>
      </td>
      <td>
        <c:set var="image1" value="ass.jpg"/>
        <img src="${image1}" style="height: 80px;width: 80px">
      </td>
    </tr>
    <tr>
      <td>
        <c:out value="${'Huong'}"/>
      </td>
      <td>

        <c:out value="${'30/1/1990'}"/>
      </td>

      <td>
        <c:out value="${'Sai Gin'}"/>
      </td>
      <td>
        <c:set var="image1" value="ass.jpg"/>
        <img src="${image1}" style="height: 80px;width: 80px">
      </td>
    </tr>
  </table>


</form>
</body>
</html>
