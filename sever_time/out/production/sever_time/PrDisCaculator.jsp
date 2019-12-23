<%--
  Created by IntelliJ IDEA.
  User: lehongphuc
  Date: 05/11/2019
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>

<form action="PrDisCaculator" method="get" >

    <label>Product Description : </label>
    <input type = "text" name = "ProductDescription" placeholder="Items">
    <label>List Price : </label>
    <input type = "text" name = "ListPrice" placeholder="10.000 VND" >
    <label>Discount Percent : </label>
    <input type = "text" name = "DiscountPercent" placeholder="10%">
    <input type = "submit" id = "CalculateDiscount" value="Calculate Discount">
</form>
</body>
</html>


















