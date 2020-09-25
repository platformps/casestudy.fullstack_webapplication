<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 9/22/2020
  Time: 8:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<header>
    <ul>
        <li><a href="">Home</a></li>
        <li><a href="">Diets</a></li>
        <li style="float:right"><a class="active" href="">logout</a></li>

    </ul>

</header>
<form>
    <label for="fname">Diet name</label><br>
    <input type="text" id="fname" name="fname" placeholder="Diet name"><br>
</form>
<table style="width:100%">
    <tr>
        <th>Meal name</th>
        <th>calories (kcal)</th>
        <th>carbs (g) </th>
        <th>Fat (g) </th>
        <th>Protein (g) </th>
        <th>sodium (mg)
        <th>sugar (g)</th>
    </tr>
</table>

</body>
</html>
