<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<jsp:include page="head_common.jsp"/>

    <title>Todo List</title>

<jsp:include page="head_files.jsp"/>
<!--Navigation starts here-->
 <nav class="navbar navbar-expand-lg navbar-light bg-light container shadow static-top">
             <a class="navbar-brand" href="/home">
                 <img class="logo" src="/resources/img/todoweylist.png" alt="todowey">
             </a>
             <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
       <span class="navbar-toggler-icon"></span>
     </button>

             <div class="collapse navbar-collapse" id="navbarSupportedContent">
                 <ul class="navbar-nav ml-auto">
                     <li class="nav-item active">
                         <a class="nav-link" href="/home">Premium <span class="sr-only">(current)</span></a>
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
                         <a class="nav-link" href="/registration">Signup</a>
                     </li>
                 </ul>
             </div>
         </nav>


 <!-- Page Content -->

 <div class= "container shadow">
   <div>
     <div>
    <main role="main">
      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
        <div class="container">
          <h1 class="display-3">Create Ideas</h1>
          <p>Welcome to Todowey a place to create and save your ideas.Todowey is a special place where your can put down your ideas or list of thing in writing> to learn more click below.</p>
          <p><a class="btn btn-primary btn-lg" href="/registration" role="button">Learn more &raquo;</a></p>
        </div>
      </div>

      <div class="container marketing">

             <!-- Three columns of text below the carousel -->
             <div class="row">
               <div class="col-lg-4">
                 <img class="rounded-circle" src="/resources/img/checklist.jpg" alt="checklist" width="140" height="140">
                 <h2>Checklist</h2>
                 <p>Create a checklist for your daily task. Todowey comes with call the tools your need to make a list. Set a deadline and review your list. Create, delete, upate your list on the go.</p>
                 <p><a class="btn btn-secondary" href="/registration" role="button">Learn More &raquo;</a></p>
               </div><!-- /.col-lg-4 -->
               <div class="col-lg-4">
                 <img class="rounded-circle" src="/resources/img/list.jpg" alt="list" width="140" height="140">
                 <h2>List</h2>
                 <p>You can create a list for your team, friends, family, or for yourself and manage item from anywhere. Set a date for tasks. Review your tasks. Set deadline for personal projects.</p>
                 <p><a class="btn btn-secondary" href="/registration" role="button">Learn More &raquo;</a></p>
               </div><!-- /.col-lg-4 -->
               <div class="col-lg-4">
                 <img class="rounded-circle" src="/resources/img/ideas.jpg" alt="ideas" width="140" height="140">
                 <h2>Ideas</h2>
                 <p>Be creative! Save your ideas and track the progess of every single task you have. Write your goals using Todowey and accomplish all of your goals with ease. No limits in creating ideas.</p>
                 <p><a class="btn btn-secondary" href="/registration" role="button">Learn More &raquo;</a></p>
               </div><!-- /.col-lg-4 -->
             </div><!-- /.row -->


    </main>

     </div>
   </div>
 </div>

<jsp:include page="footer.jsp"/>

