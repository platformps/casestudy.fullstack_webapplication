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

<div class="container">
    <div class="row">
        <div class="col-xs-12">

            <form method="POST" action="${contextPath}/login" class="form-signin">
                <h2 class="form-heading">Sign-in page</h2>

                <div class="form-group ${error != null ? 'has-error' : ''}">
                    <span>${message}</span>
                    <input name="email" type="text" class="form-control" placeholder="email" autofocus="true"/>
                    <input name="password" type="password" class="form-control" placeholder="Password"/>
                    <span>${error}</span>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                    <button class="btn btn-primary btn-lg btn-block" type="submit">Log In</button>
                    <h4 class="text-center"><a href="${contextPath}/signup_form">Create an account</a></h4>
                </div>
            </form>

        </div>
    </div>
</div><!-- /container -->
<jsp:include page="footer.jsp"/>
</body>
</html>
