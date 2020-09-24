<%--<html>--%>
<%--<head>--%>
<%--    <title>Products to Select </title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Another E-healthy Living store</h1>--%>
<%--<h3>Choose Products(s):</h3>--%>
<%--<form method="get">--%>
<%--    <input type="checkbox" name="product" value="Tan Ah Teck">Tan--%>
<%--    <input type="checkbox" name="product" value="Mohd Ali">Ali--%>
<%--    <input type="checkbox" name="product" value="Kumar">Kumar--%>
<%--    <input type="checkbox" name="product" value="Kumar">Kumar--%>
<%--    <input type="checkbox" name="product" value="Kumar">Kumar--%>
<%--    <input type="submit" value="Query">--%>
<%--</form>--%>

<%--<%--%>
<%--    String[] authors = request.getParameterValues("author");--%>
<%--    if (authors != null) {--%>
<%--%>--%>
<%--<%@ page import = "java.sql.*" %>--%>
<%--<%--%>
<%--    Connection conn = null; // <== Check!--%>
<%--    try {--%>
<%--        conn = DriverManager.getConnection(--%>
<%--                "jdbc:mysql://localhost:8888/ebookshop", "root", "password");--%>
<%--    } catch (SQLException throwables) {--%>
<%--        throwables.printStackTrace();--%>
<%--    }--%>
<%--    // Connection conn =--%>
<%--    //    DriverManager.getConnection("jdbc:odbc:eshopODBC");  // Access--%>
<%--    Statement stmt = conn.createStatement();--%>

<%--    String sqlStr = "SELECT * FROM books WHERE author IN (";--%>
<%--    sqlStr += "'" + authors[0] + "'";  // First author--%>
<%--    for (int i = 1; i < authors.length; ++i) {--%>
<%--        sqlStr += ", '" + authors[i] + "'";  // Subsequent authors need a leading commas--%>
<%--    }--%>
<%--    sqlStr += ") AND qty > 0 ORDER BY author ASC, title ASC";--%>

<%--    // for debugging--%>
<%--    System.out.println("Query statement is " + sqlStr);--%>
<%--    ResultSet rset = stmt.executeQuery(sqlStr);--%>
<%--%>--%>
<%--<hr>--%>
<%--<form method="get" action="order.jsp">--%>
<%--    <table border=1 cellpadding=5>--%>
<%--        <tr>--%>
<%--            <th>Order</th>--%>
<%--            <th>Author</th>--%>
<%--            <th>Title</th>--%>
<%--            <th>Price</th>--%>
<%--            <th>Qty</th>--%>
<%--        </tr>--%>
<%--        <%--%>
<%--            while (rset.next()) {--%>
<%--                int id = rset.getInt("id");--%>
<%--        %>--%>
<%--        <tr>--%>
<%--            <td><input type="checkbox" name="id" value="<%= id %>"></td>--%>
<%--            <td><%= rset.getString("author") %></td>--%>
<%--            <td><%= rset.getString("title") %></td>--%>
<%--            <td>$<%= rset.getInt("price") %></td>--%>
<%--            <td><%= rset.getInt("qty") %></td>--%>
<%--        </tr>--%>
<%--        <%--%>
<%--            }--%>
<%--        %>--%>
<%--    </table>--%>
<%--    <br>--%>
<%--    <input type="submit" value="Order">--%>
<%--    <input type="reset" value="Clear">--%>
<%--</form>--%>
<%--<a href="<%= request.getRequestURI() %>"><h3>Back</h3></a>--%>
<%--<%--%>
<%--        rset.close();--%>
<%--        stmt.close();--%>
<%--        conn.close();--%>
<%--    }--%>
<%--%>--%>
<%--</body>--%>
<%--</html>--%>