<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 9/21/2020
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="/css/main.css" rel="stylesheet"/>
    <title>Title</title>
</head>
<body>
<h1>Hercules fitness partner</h1>
<header>
    <ul>
        <li><a href="">Home</a></li>
        <li><a href="">Diets</a></li>
        <li style="float:right">
            <div class="container">
            <div class="row">
                <div class="col-xs-12">

                    <c:if test="${pageContext.request.userPrincipal.name != null}">
                        <form id="logoutForm" method="POST" action="${contextPath}/logout">
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        </form>

                        <a onclick="document.forms['logoutForm'].submit()">Logout</a>

                    </c:if>

                </div>
            </div>
            </div>
        </li>
    </ul>
</header>

</body>
</html>
