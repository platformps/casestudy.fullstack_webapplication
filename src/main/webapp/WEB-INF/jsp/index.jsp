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
    href="${contextPath}/resources/css/home_page.css" rel="stylesheet" type="text/css">
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
    <div class="container">
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

    <div class="container">


        <form:form method="POST" modelAttribute="userForm" class="form-signin">
            <h3 class="form-signin-heading">Create New User Account</h3>
            <spring:bind path="name">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="name" class="form-control" placeholder="Full Name"
                                autofocus="true"></form:input>
                    <form:errors path="name"></form:errors>
                </div>
            </spring:bind>
            <spring:bind path="email">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="email" class="form-control" placeholder="Email"
                                autofocus="true"></form:input>
                    <form:errors path="email"></form:errors>
                </div>
            </spring:bind>
            <spring:bind path="address">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="username" class="form-control" placeholder="Address"
                                autofocus="true"></form:input>
                    <form:errors path="address"></form:errors>
                </div>
            </spring:bind>
            <spring:bind path="phnumber">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="phnumber" class="form-control" placeholder="Phone Number"
                                autofocus="true"></form:input>
                    <form:errors path="username"></form:errors>
                </div>
            </spring:bind>

            <spring:bind path="username">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="username" class="form-control" placeholder="Username"
                                autofocus="true"></form:input>
                    <form:errors path="username"></form:errors>
                </div>
            </spring:bind>

            <spring:bind path="password">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="password" path="password" class="form-control" placeholder="Password"></form:input>
                    <form:errors path="password"></form:errors>
                </div>
            </spring:bind>

            <spring:bind path="passwordConfirm">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="password" path="passwordConfirm" class="form-control"
                                placeholder="Confirm your password"></form:input>
                    <form:errors path="passwordConfirm"></form:errors>
                </div>
            </spring:bind>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
        </form:form>

    </div>
    <%--
    <form action="process.jsp">
        <h3>New User Registration Form</h3>
        <br/><label for="name">Full Name</label>
        <input id="name" type="text" name="name" onclick="this.value=''"/>
        <br/><label for="email">Email</label>
        <input id="email" type="email" name="email" onclick="this.value=''"/>
        <br/><label for="address">Address</label>
        <input id="address" type="text" name="address" onclick="this.value=''"/>
        <br/><label for="phone_number">Phone Number</label>
        <input id="phone_number" type="number" name="phone_number" onclick="this.value=''"/>
        <br/><label for="pass">Password</label>
        <input id="pass" type="password" name="user_password" onclick="this.value=''"/>
        <br/><input type="submit" value="Register"/>
    </form>
    --%>
</aside>

<h1>About Us</h1>
<img src="/img/myparty.jpeg" width="380" height="250" >
<%--Message: ${message}--%>
<p><b>The Party Time Company offers services to make your family event unforgettable! We offer party supplies and rentals, assistance in your family event planning. Just anything you may need to make your event the best it can be! Whether it is a wedding, a child’s birthday, or a corporate event, we are here to offer you our superior service.</b></p>

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
