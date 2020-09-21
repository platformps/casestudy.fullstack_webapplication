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
    <title>Party Time - Contact Us</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Contact Us">
    <meta name="author" content="Julia Waclawek">

    <c:url value="/css/contact_us.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />
    <script type="text/javascript" src="/js/utils.js"></script>
    <script type="text/javascript" src="/js/contact_us.js"></script>
    <script type="text/javascript" src="/js/header-functions.js"></script>

</head> <!-- header ends here -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<body>
<header>
    <h2>Party Time! We Bring Life to Your Party!</h2>
    <div class="topNavBar" id="myTopnav">
        <a href="index.jsp">Home</a>
        <a href="services.jsp">Our Services</a>
        <a href="contact_us.jsp" class="active">Contact Us</a>
        <a href="shopping_cart.jsp">Shopping Cart</a>
        <a href="javascript:void(0);" class="icon" onclick="myFunction()">
            <i class="fa fa-bars"></i>
        </a>
    </div>
</header>
<div class="container">
    <div style="text-align:center">
        <h2>Contact Us</h2>
        <p><h4>Let's plan your event together!
        <br/>Stop by for a coffee or Leave us a message!</h4></p>
    </div>
    <div class="row">
        <div class="column">
            <img src="/img/coffee_plan.jpg" style="width:100%">
            <h5><b>Our Location:</b> 2345 Party Ave, Charlotte NC</h5>
            <h5><b>Phone number:</b> (704) 567-7869</h5>
            <img src="/img/location.jpg" style="width:100%">

        </div>
        <div class="column">
            <form action="/action_page.php">
                <label for="fname">First Name</label>
                <input type="text" id="fname" name="firstname" placeholder="Your name ..">
                <label for="lname">Last Name</label>
                <input type="text" id="lname" name="lastname" placeholder="Your last name..">
                <label for="country">Country</label>
                <select id="country" name="country">
                    <option value="usa">USA</option>
                    <option value="canada">Canada</option>
                    <option value="australia">Australia</option>
                    <option value="mexico">Mexico</option>
                    <option value="cuba">Cuba</option>
                </select>
                <label for="message">Message</label>
                <textarea id="message" name="message" placeholder="Write something.." style="height:170px"></textarea>
                <input type="submit" value="Submit">
            </form>
        </div>
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
