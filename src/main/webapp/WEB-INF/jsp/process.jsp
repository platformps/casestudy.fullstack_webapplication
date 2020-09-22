<%@page import="com.github.perscholas.repositories.UserRegistrationRepo"%>
<jsp:useBean id="obj" class="models.User"/>

<jsp:setProperty property="*" name="obj"/>

<%
    int status=UserRegistrationRepo.register(user);
    if(status>0)
        out.print("You are successfully registered");

%>
