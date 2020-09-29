<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Product Page</title>
</head>
<body>
<form method="POST" action="homePage.jsp">
Name <input type="text" name="product" >
Description <input type="text" name="description" >
<input type="submit" value="Submit">
</form>

<table  border="1">

    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>Buy</th>
    </tr>
    <c:forEach var="product" items="${products }">
        <tr>
            <td>${product.description} </td>
            <td>${product.id }</td>
            <td>${product.name }</td>
            <td>${product.price }</td>
            <td align="center">
                <a href="${pageContext.request.contextPath }/cart?&action=buy&id=${product.id }">Buy</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>

