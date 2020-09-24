<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Profile</title>

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
  <link href="css/style.css" rel="stylesheet">
  <script type="text/javascript" src="js/utils.js"></script>
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>


</head>

<style>
    p, h2 {
        color: rgb(248,248,255);
        font-weight: bold;
    }
</style>

<body id="profile" class="dark">
<header>
  <!----------------- BEGIN NAV ----------------->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" style="font-weight: 700;" href="#">Stock Market Casestudy</a>
    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
        <div class="navbar-nav">
            <a href="/market-news" class="nav-item nav-link">Market News</a>
            <a href="/company-overview" class="nav-item nav-link">Company Overview</a>

        </div>

        <div class="navbar-nav">
            <a href="#" onclick="document.forms['logoutForm'].submit()" class="nav-item nav-link">Logout</a>
        </div>
    </div>
</nav>
  <!----------------- END NAV ----------------->
</header>

<div class="container">
<div class="row">
<div class="col-xs-12">

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </c:if>

    <h2 style="text-align: center; margin-top: 60px; margin-bottom:20px;">Welcome ${pageContext.request.userPrincipal.name}</h2>

    <p>Hello, and welcome to Nick's Stock Market Case Study application.</p>
    <p>To get started, please select 'Market News' or 'Company Overview' in the navbar at the top.</p>
    <p>Market News will show you 20 of the most recent news articles about publicly traded companies. Company
    Overview will allow you to enter a symbol into the search bar see information related to that company.</p>
    <p>When you are finished exploring company information, click 'Logout' on the far right side of the navbar.</p>

</div>
</div>
</div><!-- /container -->


</body>

</html>