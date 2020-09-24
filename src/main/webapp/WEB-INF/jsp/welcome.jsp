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
<head> <!-- header begins here include all metadata -->
    <meta charset="utf-8">
    <title>Party Time - Home</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Home Page">
    <meta name="author" content="Julia Waclawek">
    <link rel='dns-prefetch' href='//cdnjs.cloudflare.com' />
    <link rel='dns-prefetch' href='//fonts.googleapis.com' />

    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="${contextPath}/resources/css/home_page.css" rel="stylesheet" type="text/css">
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

<div class="container">
    <div class="row">
        <div class="col-xs-12">

            <c:if test="${pageContext.request.userPrincipal.name != null}">
                <form id="logoutForm" method="POST" action="${contextPath}/logout">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                </form>

                <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>

            </c:if>

        </div>
    </div>
</div>



<h1>About Us</h1>
<img src="/resources/img/myparty.jpeg" width="380" height="250" >
<p><b>The Party Time Company offers services to make your family event unforgettable! We offer party supplies and rentals, assistance in your family event planning. Just anything you may need to make your event the best it can be! Whether it is a wedding, a child’s birthday, or a corporate event, we are here to offer you our superior service.</b></p>

<footer>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</footer>

</body>
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
</html>