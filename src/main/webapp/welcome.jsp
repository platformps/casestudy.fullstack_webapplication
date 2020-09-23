<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<jsp:include page="head_common.jsp"/>

    <title>Welcome!</title>

<jsp:include page="head_files.jsp"/>

<div class="container">
<div class="row">
<div class="col-xs-12">

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome ${pageContext.request.userPrincipal.name}</h2>

    </c:if>

</div>
</div>
</div><!-- /container -->

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Kyle's Banking Business</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span> My Account </a></li>
            <li><a href="${contextPath}/login"><span class="glyphicon glyphicon-log-in"></span> Logout </a></li>
        </ul>
    </div>
</nav>

<div class="row" style="margin:75px; ">
    <div class="col-sm-3 container paragraph">
        <p>
            placeholder
        </p>
    </div>
    <div class="col-sm-9 paragraph">
        <p>
            placeholder
        </p>
    </div>
</div>
<jsp:include page="footer.jsp"/>
