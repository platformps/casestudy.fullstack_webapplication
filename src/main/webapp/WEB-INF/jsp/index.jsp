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
    <meta name="author" content="Julia Waclawek">

    <c:url value="/css/home_page.css" var="jstlCss" />
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
    <div class="login-container">
        <h3>Enter Username and Password</h3>
        <div th:if= "${request.getParameter('error') == 'true'}"
             style="color: darkblue; margin: 15px 0px;">
            Login Failed!!!<br /> Reason :
            <span th:utext="${session.getAttribute('SPRING_SECURITY_LAST_EXCEPTION').message}"></span>
        </div>

        <form method="POST"
              th:action="@{/j_spring_security_check}">
            <table>
                <tr>
                    <td>User Name </td>
                    <td><input name="userName" /></td>
                </tr>
                <tr>
                    <td>Password </td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <input type="submit" value="Login" />
                        <input type="reset"  value="Reset" />
                    </td>
                </tr>
            </table>
        </form>
        <span class="error-message" th:utext="${error}"></span>
    </div>

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
</aside>
<h1>About Us</h1>
<img src="/img/myparty.jpeg" width="380" height="250" >
<!--Message: ${message}-->
<p><b>The Party Time Company offers services to make your family event unforgettable! We offer party supplies and rentals, assistance in your family event planning. Just anything you may need to make your event the best it can be! Whether it is a wedding, a child’s birthday, or a corporate event, we are here to offer you our superior service.</b></p>

<footer>
    <!-- footer of page begins here -->
    <script type="text/javascript" src="/js/footer-functions.js"></script>
</footer>

</body>
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
</html>
