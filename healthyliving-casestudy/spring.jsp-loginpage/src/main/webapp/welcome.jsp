<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<jsp:include page="head_common.jsp"/>

    <title>Create an account</title>

<jsp:include page="head_files.jsp"/>

<div class="container">
<div class="row">
<div class="col-xs-12">

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
        <h2>Would you like to attend a healthy living event??  | <a href="/echo.jsp">Attend</a></h2>
        <h2>Would you like to browse our health products??  | <a href="/product.jsp">View </a></h2>
        <h2>Would you like to avail of our member Services??  | <a href="/home.jsp">Avail</a></h2>
        <br>   </br>

    </c:if>

</div>
</div>
</div><!-- /container -->
<jsp:include page="footer.jsp"/>
