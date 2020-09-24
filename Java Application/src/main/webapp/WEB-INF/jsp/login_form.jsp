<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 9/22/2020
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<jsp:include page="head_common.jsp"/>

<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Please sign in</h1>
<input type="email" id="inputEmail" class="form-control"placeholder="Email address" required autofocus>
<input type="password" id="inputPassword" class="form-control"placeholder="Password" required>
<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
</body>
</html>
