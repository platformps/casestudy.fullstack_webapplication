<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 9/29/2020
  Time: 10:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<jsp:include page="head_common.jsp"/>

<title>Diet name</title>
<jsp:include page="head_files.jsp"/>

<body>
<h1>Diet Journal</h1>
<form name="journalName" method="POST" action="{ContextPage}/JournalController">
<p>
    Enter Diet Name:
    <input type="submit" name="journalName" value="continue">
</p>
</form>

</body>
