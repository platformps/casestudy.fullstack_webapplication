<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html lang="en">
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<head> <!-- header begins here -->
    <meta charset="utf-8">
    <title>Party Time - Our Services</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Our Services">
    <meta name="author" content="Julia Waclawek">

    <link href="/resources/css/services.css" rel="stylesheet">
    <script type="text/javascript" src="/js/utils.js"></script>
    <script type="text/javascript" src="/js/services.js"></script>
    <script type="text/javascript" src="/js/header-functions.js"></script>

</head>
<body>
<header>
    <h2>Party Time! We Bring Life to Your Party!</h2>
    <div class="topNavBar" id="myTopnav">
        <a href="index.jsp" >Home</a>
        <a href="services.jsp" class="active">Our Services</a>
        <a href="contact_us.jsp">Contact Us</a>
        <a href="shopping_cart.jsp">Search</a>
        <a href="javascript:void(0);" class="icon" onclick="myFunction()">
            <i class="fa fa-bars"></i>
        </a>
    </div>
</header>
<h1>Our Services</h1>
<h3>We can make your event happen!</h3>
<div class="container">
    <div><img src="/img/party-organiser.jpeg" width="355" height="225" ></div>
    <div><img src="/img/birthday.jpg" width="355" height="225" ></div>
</div>
<div class="wrapper">
    <div class="box a">
        <h3>Party Supplies</h3>
        <form action="list" method="post">
            Select:&nbsp;
            <select name="party_supplies">
                <c:forEach items="${listCategory}" var="category">
                    <option value="${party_supplies.id}"
                            <c:if test="${party_supplies.id eq selectedCatId}">selected="selected"</c:if>
                    >
                            ${party_supplies.name}
                    </option>
                </c:forEach>
            </select>
            <input type="submit" value="Submit" />
        </form>
    </div>
    <div class="box b">
        <h3>Event Setting</h3>
        <form action="list" method="post">
            Select:&nbsp;
            <select name="event_setting">
                <c:forEach items="${listCategory}" var="category">
                    <option value="${event_setting.id}"
                            <c:if test="${event_setting.id eq selectedCatId}">selected="selected"</c:if>
                    >
                            ${event_setting.name}
                    </option>
                </c:forEach>
            </select>
            <input type="submit" value="Submit" />
        </form>
    </div>
    <div class="box c">
        <h3>Event Planning</h3>
        <form action="list" method="post">
            Select:&nbsp;
            <select name="event_planning">
                <c:forEach items="${listCategory}" var="category">>
                <option value="${event_planning.id}"
                        <c:if test="${event_planning.id eq selectedCatId}">selected="selected"</c:if>
                >
                    ${event_planning.name}
                </option>
                </c:forEach>
            </select>
            <input type="submit" value="Submit" />
        </form>
    </div>
    <div class="box d">
        <h3>Catering</h3>
        <form action="list" method="post">
            Select:&nbsp;
            <select name="catering">
                <c:forEach items="${listCategory}" var="category">>
                <option value="${catering.id}"
                        <c:if test="${catering.id eq selectedCatId}">selected="selected"</c:if>
                >
                    ${catering.name}
                </option>
                </c:forEach>
            </select>
            <input type="submit" value="Submit" />
        </form>
    </div>
    <div class="box e">
        <h3>Flowers & Gifts</h3>
        <form action="list" method="post">
            Select:&nbsp;
            <select name="flowers_gifts">
                <c:forEach items="${listCategory}" var="category">>
                <option value="${flowers_gifts.id}"
                        <c:if test="${flowers_gifts.id eq selectedCatId}">selected="selected"</c:if>
                >
                    ${flowers_gifts.name}
                </option>
                </c:forEach>
            </select>
            <input type="submit" value="Submit" />
        </form>
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

<%--
<div align="center">
<h2>Dynamic Drop Down List</h2>
<form action="list" method="post">
Select:&nbsp;
<select name="category">
<c:forEach items="${listCategory}" var="category">
    <option value="${category.id}"
    <c:if test="${category.id eq selectedCatId}">selected="selected"</c:if>
    >
    ${category.name}
    </option>
</c:forEach>
</select>
<br/>
<input type="submit" value="Submit" />
</form>
</div>
--%>