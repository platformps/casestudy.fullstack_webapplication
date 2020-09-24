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
    <title>Party Time - Login</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Home Page">
    <meta name="author" content="Julia Waclawek">
    <link rel='dns-prefetch' href='//cdnjs.cloudflare.com' />
    <link rel='dns-prefetch' href='//fonts.googleapis.com' />

    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet" type="text/css">
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
        <a href="/welcome.jsp" class="active">Home</a>
        <a href="${pageContext.request.contextPath}/services.jsp">Our Services</a>
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
    <form method="POST" action="${contextPath}/login" class="form-signin">
        <h2 class="form-heading">Log in</h2>

        <div class="form-group ${error != null ? 'has-error' : ''}">
            <span>${message}</span>
            <input name="username" type="text" class="form-control" placeholder="Username"
                   autofocus="true"/>
            <input name="password" type="password" class="form-control" placeholder="Password"/>
            <span>${error}</span>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
            <h4 class="text-center"><a href="${contextPath}/registration">Create an account</a></h4>
        </div>
    </form>
        </div>
    </div>
</div>

<footer>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</footer>

</body>
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
</html>
