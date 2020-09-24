<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 9/22/2020
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<jsp:include page="head_common.jsp"/>

<html>
<head>

    <title>Sign up</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-xs-12">

            <form:form method="POST" modelAttribute="userForm" class="form-signin">
                <h2 class="form-signin-heading">Create your account</h2>
                <spring:bind path="email">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:input type="text" path="email" class="form-control" placeholder="Username" autofocus="true"></form:input>
                        <form:errors path="email"></form:errors>
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
                        <form:input type="password" path="passwordConfirm" class="form-control" placeholder="Confirm your password"></form:input>
                        <form:errors path="passwordConfirm"></form:errors>
                    </div>
                </spring:bind>

                <button class="btn btn-primary btn-lg btn-block" type="submit">Submit</button>
            </form:form>

        </div>
    </div>
</div><!-- /container -->
<jsp:include page="footer.jsp"/>

</body>
</html>
