<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<head> <!-- header begins here -->
    <meta charset="utf-8">
    <title>Party Time - Our Services</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Our Services">
    <meta name="author" content="Mondira Roy">

    <c:url value="/css/shopping_cart.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />
    <script type="text/javascript" src="/js/utils.js"></script>
    <script type="text/javascript" src="/js/home_page.js"></script>
    <script type="text/javascript" src="/js/header-functions.js"></script>

</head> <!-- header ends here -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<body>
<header>
    <h2>Healthy Living! Health is wealth!</h2>
    <div class="topNavBar" id="myTopnav">
        <a href="index.jsp" >Home</a>
        <a href="services.jsp" class="active">Our Services</a>
        <a href="contact_us.jsp">Contact Us</a>
        <a href="shopping_cart.jsp">Shopping Cart</a>
        <a href="javascript:void(0);" class="icon" onclick="myFunction()">
            <i class="fa fa-bars"></i>
        </a>
    </div>
</header>

<div class="row">
    <div class="column">
        <h4>If you have a question about your order call (651) 399-5739</h4>
        <img src="/img/yoga_pose2.jpg" width="400" height="280">
        <img src="/img/yoga_pose1.jpeg" width="400" height="280">
        <img src="/img/yoga_pose3.jpg" width="400" height="280">
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
    <!-- footer of page begins here -->
    <script type="text/javascript" src="/js/footer-functions.js"></script>
</footer> <!-- footer of page ends here -->
<!-- ====================================================== -->
<!-- ====================================================== -->

</body>
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
</html>