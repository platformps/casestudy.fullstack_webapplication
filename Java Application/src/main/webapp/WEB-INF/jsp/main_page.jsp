<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%--This will be the welcome screen for the application--%>
<html lang="en">
<head>
    <title>Home Page</title>

</head>
<body>
<h1>Hercules fitness partner</h1>
<header>
    <ul>
        <li style="float:right"><a href="signup_form.jsp">sign up</a></li>
        <li style="float:right"><a href="login_form.jsp">Login</a></li>
    </ul>
</header>



<p>${msg}</p>

</body>

</html>