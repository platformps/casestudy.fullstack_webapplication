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
    <title>Home Page: Welcome</title>
    <link href="${contextPath}/resources/css/welcome.css" rel="stylesheet" type="text/css">
    <jsp:include page="head.jsp"/>
</head> <!-- header ends here -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<body>
<header>
    <jsp:include page="header.jsp"/>
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
    <h1>About Us</h1>
    <img src="/resources/img/myparty.jpeg" width="380" height="250" >
    <p><b>The Party Time Company offers services to make your family event unforgettable! We offer party supplies and rentals, assistance in your family event planning. Just anything you may need to make your event the best it can be! Whether it is a wedding, a child’s birthday, or a corporate event, we are here to offer you our superior service.</b></p>
</div>



<footer>
    <jsp:include page="footer.jsp"/>
</footer>

</body>
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
</html>