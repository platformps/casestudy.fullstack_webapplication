<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<head> <!-- header begins here -->
    <title>Shopping Cart</title>
    <jsp:include page="head.jsp"/>
    <link href="${contextPath}/resources/css/shopping_cart.css" rel="stylesheet" type="text/css">
</head> <!-- header ends here -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<body>
<header>
    <jsp:include page="header.jsp"/>
</header>

<div class="row">
    <div class="column">
        <h4>If you have a question about your order call (704) 567-7869</h4>
        <img src="/img/flowers.jpg" width="400" height="280">
        <img src="/img/gifts.jpeg" width="400" height="280">
        <img src="/img/catering.jpg" width="400" height="280">
    </div>

    <div class="column">
        <h4>Shopping Cart</h4>
        <table width="100%" border="1">
            <tr bgcolor="#dda0dd">
        <td><strong>Service Options</strong></td>
        <td><strong>Quantity</strong></td>
        <td><strong>Unit Price</strong></td>
        <td><strong>Total</strong></td>
    </tr>
    <jsp:useBean id="cart" scope="session" class="com.github.perscholas.bean.CartDao"/>
    <c:forEach var="cartItem" items="${cart.cartItems}" varStatus="counter">
        <form name="item" method="POST" action="controller/CartController">
            <tr>
                <td>
                    <b><c:out value="${cartItem.itemNumber}"/></b><br/>
                    <c:out value="${cartItem.itemDescription}"/>
                </td>
                <td><input type="hidden" name="itemIndex" value='<c:out value="${counter.count}"/>'>
                    <input type="text" name="quantity" value='<c:out value="${cartItem.quantity}"/>' size='2'>
                    <input type="submit" name="action" value="Update"><br/>
                    <input type="submit" name="action" value="Delete"></td>
                <td>$<c:out value="${cartItem.unitCost}"/></td>
                <td>$<c:out value="${cartItem.totalCost}"/></td>
            </tr>
        </form>
    </c:forEach>
    <tr>
        <td colspan="2"> </td>
        <td> </td>
        <td>Subtotal: $<c:out value="${cart.orderTotal}"/></td>
    </tr>
</table>
        <h2>View and Submit Your Order</h2><br/>
        <input type="submit" value="Submit">
        </div>
    </div>

<footer>
    <jsp:include page="footer.jsp"/>
</footer> <!-- footer of page ends here -->
<!-- ====================================================== -->
<!-- ====================================================== -->

</body>
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
</html>