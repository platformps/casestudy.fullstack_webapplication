<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html lang="en">

<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<head> <!-- header begins here -->
    <meta charset="utf-8">
    <title>Party Time - Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Home Page">
    <meta name="author" content="Julia Waclawek">
    <link href="${contextPath}/resources/css/home_page.css" rel="stylesheet" type="text/css">
    <%--<c:url value="/css/home_page.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />--%>

    <script type="text/javascript" src="/js/utils.js"></script>
    <script type="text/javascript" src="/js/home_page.js"></script>
    <script type="text/javascript" src="/js/header-functions.js"></script>

</head> <!-- header ends here -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<body>
<header>
    <h2>Party Time! We Bring Life to Your Party!</h2>
    <div class="topNavBar" id="myTopnav">
        <a href="index.jsp" class="active">Home</a>
        <a href="services.jsp">Our Services</a>
        <a href="contact_us.jsp">Contact Us</a>
        <a href="shopping_cart.jsp">Shopping Cart</a>
        <a href="javascript:void(0);" class="icon" onclick="myFunction()">
            <i class="fa fa-bars"></i>
        </a>
    </div>
</header>

<aside>
    <jsp:include page="login.jsp"/> <br/>
    <jsp:include page="login.jsp"/> <br/>
</aside>

    <jsp:include page="login.jsp"/> <br/>
<h1>About Us</h1>
<img src="/img/myparty.jpeg" width="380" height="250" >
<%--Message: ${message}--%>
<p><b>The Party Time Company offers services to make your family event unforgettable! We offer party supplies and rentals, assistance in your family event planning. Just anything you may need to make your event the best it can be! Whether it is a wedding, a child’s birthday, or a corporate event, we are here to offer you our superior service.</b></p>

<footer>
    <!-- footer of page begins here -->
    <%--<jsp:include page="footer.jsp"/>--%>
    <script type="text/javascript" src="/js/footer-functions.js"></script>
</footer>

</body>
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
</html>
