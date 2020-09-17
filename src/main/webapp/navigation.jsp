
<!--Navigation starts here-->
 <nav class="navbar navbar-expand-lg navbar-light bg-light container shadow">
             <a class="navbar-brand" href="#">
                 <img class="logo" src="./img/squares.png" alt=""><span class="todowey"> todowey</span>
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