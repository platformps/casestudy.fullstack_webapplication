<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
        StockOverview stock = new StockOverview;
        stock = getCompanyOverview("IBM");
    %>
    <img src=<%  %> alt="company logo"></img>
    <h1><% stock.getSymbol(); %></h1>
</body>
</html>