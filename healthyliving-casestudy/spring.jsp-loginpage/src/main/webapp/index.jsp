<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="th" uri="http://java.sun.com/jsp/jstl/functions" %>
<html lang="en">

<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<head> <!-- header begins here -->
    <meta charset="utf-8">
    <title>Party Time - Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Home Page">
    <meta name="author" content="Mondira Roy">

    <c:url value="/css/home_page.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />

    <script type="text/javascript" src="/js/utils.js"></script>
    <script type="text/javascript" src="/js/home_page.js"></script>
    <script type="text/javascript" src="/js/header-functions.js"></script>

</head> <!-- header ends here -->
<!-- ---------------------------------------------------- -->
<!-- ---------------------------------------------------- -->
<!-- ---------------------------------------------------- -->
<body>
<header>
    <h2>Healthy Living is a key to Longevity!</h2>
    <div class="topNavBar" id="myTopnav">
        <a href="welcome.jsp" class="active">Home</a>
        <a href="services.jsp">Our Services</a>
        <a href="contact_us.jsp">Contact Us</a>
        <a href="shopping_cart.jsp">Shopping Cart</a>
        <a href="javascript:void(0);" class="icon" onclick="myFunction()">
            <i class="fa fa-bars"></i>
        </a>
    </div>
</header>


<h1>About Us</h1>
<img src="/assets/images/Yoga_pose_gallery.jpg" width="380" height="250" >
<!--Message: ${message}-->
<p><b>The Healthy Living App is committed to make you healthy! We offer one stop shopping, services and events to boost up your metabolism
 and look Great!!!
<footer>
    <!-- footer of page begins here -->
    <script type="text/javascript" src="/js/footer-functions.js"></script>
</footer>

</body>
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
</html>