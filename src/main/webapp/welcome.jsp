<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<jsp:include page="head_common.jsp"/>

    <title>Create an account</title>

<jsp:include page="head_files.jsp"/>

<!--Navigation starts here-->
 <nav class="navbar navbar-expand-lg navbar-light bg-light container shadow">
             <a class="navbar-brand" href="#">
                 <img class="logo" src="/resources/img/todoweylist.png" alt=""><span class="todowey"> todowey</span>
             </a>
             <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
       <span class="navbar-toggler-icon"></span>
     </button>

             <div class="collapse navbar-collapse" id="navbarSupportedContent">
                 <ul class="navbar-nav mr-auto">
                     <li class="nav-item active">
                         <a class="nav-link" href="#">Premium <span class="sr-only">(current)</span></a>
                     </li>
                     <li class="nav-item">
                         <a class="nav-link" href="#">Features</a>
                     </li>
                 </ul>
                 <ul class="navbar-nav ml-auto">
                     <li class="nav-item">
                         <a class="nav-link" href="#">Create</a>
                     </li>
                     <li class="nav-item">
                         <a class="nav-link" href="login.jsp">Login</a>
                     </li>
                     <li class="nav-item">
                          <c:if test="${pageContext.request.userPrincipal.name != null}">
                                 <form id="logoutForm" method="POST" action="${contextPath}/logout">
                                     <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                 </form>

                                    <a class="nav-link" onclick="document.forms['logoutForm'].submit()">Welcome ${pageContext.request.userPrincipal.name} | Logout</a>


                             </c:if>
                     </li>
                 </ul>
             </div>
         </nav>

<!-- Page Content -->
 <div class= "container shadow text-center">
   <div>
     <div>
        <main role="main" class="inner cover">
        <h1 class="cover-heading">Welcome ${pageContext.request.userPrincipal.name}</h1>
        <p class="lead">From here your can create a list, set date for your list, delete, update list. You can create and save your ideas.</p>
        <p class="lead">
          <a href="/list-todos" class="btn btn-lg btn-secondary">Todo List</a>
        </p>
      </main>
     </div>
   </div>
 </div>

</div>
</div>
</div><!-- /container -->

<!-- Footer -->
<footer class="page-footer font-small blue pt-4">

  <!-- Footer Links -->
  <div class="container-fluid text-center text-md-left container shadow navbar-light bg-light">

    <!-- Grid row -->
    <div class="row">

      <!-- Grid column -->
      <div class="col-md-6 mt-md-0 mt-3">

        <!-- Content -->
                <h6 class="text-uppercase font-weight-bold">Todowey List Management</h6>
                <hr class="teal accent-3 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
                <p>Todowey is a checklist management web application founded application July 11th 2020 by
                 Emmanuel Orubele. It is a free checklist application for making a checklist, manage your checklist, and much more.</p>

      </div>
      <!-- Grid column -->

      <hr class="clearfix w-100 d-md-none pb-3">

      <!-- Grid column -->
      <div class="col-md-3 mb-md-0 mb-3">

        <!-- Links -->
        <h6 class="text-uppercase font-weight-bold">Resource</h6>
        <hr class="teal accent-3 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
        <p>
          <a class="dark-grey-text" href="/welcome">Your Account</a>
        </p>
        <p>
          <a class="dark-grey-text" href="/list-todos">Your List</a>
        </p>
        <p>
          <a class="dark-grey-text" href="#!">Premuim Rates</a>
        </p>
        <p>
          <a class="dark-grey-text" href="#!">Career</a>
        </p>

      </div>
      <!-- Grid column -->

      <!-- Grid column -->
      <div class="col-md-3 mb-md-0 mb-3">

       <!-- Links -->
               <h6 class="text-uppercase font-weight-bold">Contact</h6>
               <hr class="teal accent-3 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
               <p>
                 <i class="fas fa-home mr-3"></i> Charlotte, NC 28214, US</p>
               <p>
                 <i class="fas fa-envelope mr-3"></i>emmanuel.orubele@gmail.com</p>
               <p>
                 <i class="fas fa-phone mr-3"></i> +1(405)886-3312/p>
               <p>
                 <i class="fas fa-print mr-3"></i> </p>
      </div>
      <!-- Grid column -->

    </div>
    <!-- Grid row -->

  </div>
  <!-- Footer Links -->

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3">© 2020 Copyright:
    <p> Emmanuel Orubele | Thanks to MDBootstrap</p>
  </div>
  <!-- Copyright -->

</footer>
