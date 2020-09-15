<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<jsp:include page="head_common.jsp"/>

    <title>Log in with your account</title>

<jsp:include page="head_files.jsp"/>
      <h2>Spring Page Redirection</h2>
       <h2>${msg}</h2>
      <p>Click below button to redirect the result to new page</p>

      <form:form method = "GET" action = "/login.jsp">
         <table>
            <tr>
               <td>
                  <input type = "submit" value = "Redirect Page"/>
               </td>
            </tr>
         </table>
      </form:form>
