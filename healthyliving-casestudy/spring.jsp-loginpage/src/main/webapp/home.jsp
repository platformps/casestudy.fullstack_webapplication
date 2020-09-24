<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<jsp:include page="head_common.jsp"/>


    <title>Event List</title>

<jsp:include page="head_files.jsp"/>

<!--Navigation starts here-->
 <nav class="navbar navbar-expand-lg navbar-light bg-light container shadow">
             <a class="navbar-brand" href="#">
                 <img class="logo" src="./assets/images/yoga_pose1" alt=""><span class="todowey"> </span>
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
                         <a class="nav-link" href="/registration.jsp">Signup</a>
                     </li>
                 </ul>
             </div>
         </nav>

 <!-- Page Content -->
 <div class= "container shadow">
   <div>
     <div>
       <h1 class="font-weight-light">Healthy Living is the key to Longevity</h1>
       <% <p class="lead">In this snippet, the background image is fixed to the body element.
       Content on the page will scroll, but the image will remain in a fixed position!</p>
        %>
        <form:form method = "GET" action = "/login.jsp">
                <table>
                   <tr>
                      <td>
                         <input type = "submit" value = "Redirect Page"/>
                      </td>
                   </tr>
                </table>
             </form:form>
       <p class="lead">Scroll down...</p>
       <div style="height: 700px"></div>
       <p class="lead mb-0">You've reached the end!</p>
     </div>
   </div>
 </div>

<jsp:include page="footer.jsp"/>
