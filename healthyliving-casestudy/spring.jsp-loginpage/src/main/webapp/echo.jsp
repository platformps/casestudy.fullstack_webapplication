<html>
<head>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>

    <jsp:include page="head_common.jsp"/>

    <title>Welcome to Events</title>

    <jsp:include page="head_files.jsp"/>
    <title>Echoing HTML Request Parameters</title>
</head>
<body>
<h3>Choose an event:</h3>
<form method="get">
    <input type="checkbox" name="event" value="Zumba with Zombies">Zumba with Zombies
    <input type="checkbox" name="event" value="Meditation for mental peace">Meditation for mental peace
    <input type="checkbox" name="event" value="Surya Namaskar for the soul">Surya Namaskar for the soul
    <input type="submit" value="Select">
</form>

<%
    String[] authors = request.getParameterValues("event");
    if (authors != null) {
%>
<h3>You have selected event(s):</h3>
<ul>
    <%
        for (int i = 0; i < authors.length; ++i) {
    %>
    <li><%= authors[i] %></li>
    <%
        }
    %>
</ul>
<a href="<%= request.getRequestURI() %>">BACK</a>
<%
    }
%>
</body>
</html>