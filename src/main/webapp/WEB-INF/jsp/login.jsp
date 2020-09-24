<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en-US">
<head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Java Spring Boot Demo">
    <meta name="author" content="akjavadev">
    <link rel='dns-prefetch' href='//cdnjs.cloudflare.com' />
	<link rel='dns-prefetch' href='//fonts.googleapis.com' />
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet" type="text/css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <title>Login</title>
</head>

<style>
.background {
    background-image: url('https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.thebalance.com%2Fthmb%2FUZS2curMfBJpwbb8LrvpxttXhA0%3D%2F2103x1428%2Ffilters%3Afill(auto%2C1)%2FStock-Market-Charts-Are-Useless-56a093595f9b58eba4b1ae5b.jpg&f=1&nofb=1');
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-position: center;
    background-size: cover;
}

.background .jumbotron {
    background-color: rgba(0, 0, 0, .6);
    color: white;
    text-align: center;
    text-shadow: 2px 2px 3px black;
    font-size: 3em;
    font-weight: 700;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    width: 50%;
    }

.form-group {
    width: 100%;
    max-width: 400px;
    padding: 15px;
    margin: auto;
  }

  .form-control {
    position: relative;
    box-sizing: border-box;
    height: auto;
    padding: 10px;
    font-size: 16px;
  }

  .form-control:focus {
    z-index: 2;
  }
</style>

<body class="background">

<div class="container">
<div class="row jumbotron">
<div class="col-xs-12">
    <h1>Welcome!</h1>
    <form method="POST" action="${contextPath}/login" class="form-signin">
        <h2 class="form-heading">Please Sign-in</h2>

        <div class="form-group ${error != null ? 'has-error' : ''}">
            <span style="font-size: medium;">${message}</span>
            <input name="username" type="text" class="form-control" placeholder="Username" autofocus="true"/>
            <input name="password" type="password" class="form-control" placeholder="Password"/>
            <span>${error}</span>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <button class="btn btn-primary btn-lg btn-block" type="submit">Log In</button>
            <h4 class="text-center"><a href="${contextPath}/registration">Create an account</a></h4>
        </div>
    </form>

</div>
</div>
</div><!-- /container -->

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>