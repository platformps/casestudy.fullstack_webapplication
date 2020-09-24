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

    <title>Register</title>
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

.form-signin {
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

  .btn {
    margin-top: 16px;
    margin-left: 0;
    left: 50%;
  }
</style>


<body class="background">

<div class="container">
    <div class="row jumbotron">
        <div class="col-xs-12">

            <form:form method="POST" modelAttribute="userForm" class="form-signin">
                <h2 class="form-signin-heading" style="padding-bottom: 16px;">Create your account</h2>
                <spring:bind path="username">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:input type="text" path="username" class="form-control" placeholder="Username" autofocus="true"></form:input>
                        <form:errors path="username"></form:errors>
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

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>