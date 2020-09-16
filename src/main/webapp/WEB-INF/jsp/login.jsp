<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Login</title>

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
  <link href="./css/style.css" rel="stylesheet">
  <script type="text/javascript" src="./js/utils.js"></script>
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>


</head>



<body id="login">
<header>
  <!----------------- BEGIN NAV ----------------->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark" style="font-family: 'Lato', sans-serif;">
    <a class="navbar-brand" style="font-weight: 700;" href="#">Stock Market Casestudy</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <!-- <span class="navbar-toggler-icon"></span> -->
    </button>
    <button class="btn btn-primary btn-sm ml-auto" onclick="window.location.href='/user-register'" type="button">Register</button>
  </nav>
  <!----------------- END NAV ----------------->
</header>

<main>
  <div class="jumbotron col-12 text-center">
    Welcome!
    <form class="form-signin" style="padding-top: 1em;">

      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
      <label for="inputEmail" class="sr-only">Email address</label>
      <input type="email" id="inputEmail" class="form-control" placeholder="Email address" onblur="validateEmail()" required autofocus>
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="show-pass" onchange=showPassword()> Show password
        </label>
      </div>
      <div class="register-link">
          <a href="/user-register">Need an Account?</a>
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
  </div>
</main>


  <footer>
    <!-- <script type="text/javascript" src="./js/footer-functions.js"></script> -->
  </footer>

</body>

</html>