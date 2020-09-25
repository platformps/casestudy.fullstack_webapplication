<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html lang="en">
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<head> <!-- header begins here -->
    <title>Service</title>
    <link href="${contextPath}/resources/css/service.css" rel="stylesheet" type="text/css">
    <jsp:include page="head.jsp"/>
</head> <!-- header ends here -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<!-- ----------------------------------------------------------------- -->
<body>
<header>
    <jsp:include page="header.jsp"/>
</header>

<p><strong>List of Services</strong></p>
<a href="shopping_cart.jsp" mce_href="shopping_cart.jsp">View Cart</a>
<p/>
<table width="100%" border="1">
    <tr>
         <td>
             <form name="PS Item 1" method="POST" action="servlet/CartController">
            <strong>Party Supplies:</strong>
            Balloons<input type="hidden" name="id" value="balloons">
            <p>
                <strong>Description:</strong>
                Choose by color and theme<input type="hidden" name="description" value="Choose by color and theme">
            </p>
            <strong>Quantity:</strong>
                50<input type="hidden" name="quantity" value="50">
            </p>
            <p>
                <strong>Price:</strong>
                $25.00<input type="hidden" name="price" value="25">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
            </form>
        </td>
        <td>
            <form name="PS Item 2" method="POST" action="servlet/CartController">
            <strong>Party Supplies:</strong>
            Decoration<input type="hidden" name="id" value="decoration">
            <p>
                <strong>Description:</strong>
                Choose by color, age and theme<input type="hidden" name="description" value="Choose by color, age and theme">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $100.00<input type="hidden" name="price" value="100">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
            </form>
        </td>
        <td>
            <form name="PS Item 3" method="POST" action="servlet/CartController">
                <strong>Party Supplies:</strong>
                Games and Activities<input type="hidden" name="id" value="games and activities">
                <p>
                    <strong>Description:</strong>
                    Choose by age and theme<input type="hidden" name="description" value="Choose by age and theme">
                </p>
                <strong>Quantity:</strong>
                1<input type="hidden" name="quantity" value="1">
                </p>
                <p>
                    <strong>Price:</strong>
                    $30<input type="hidden" name="price" value="30">
                </p>
                <input type="hidden" name="action" value="add">
                <input type="submit" name="addToCart" value="Add To Cart">
            </form>
        </td>
    </tr>
    <tr>
        <td>
        <form name="ES Item 1" method="POST" action="servlet/CartController">
            <strong>Event Setting:</strong>
            Pool Party<input type="hidden" name="id" value="pool party">
            <p>
                <strong>Description:</strong>
                location<input type="hidden" name="description" value="Location">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $500.00<input type="hidden" name="price" value="500">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="ES Item 2" method="POST" action="servlet/CartController">
            <strong>Event Setting:</strong>
            Garden Party<input type="hidden" name="id" value="garden party">
            <p>
                <strong>Description:</strong>
                location<input type="hidden" name="description" value="Location">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $450.00<input type="hidden" name="price" value="450">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="ES Item 3" method="POST" action="servlet/CartController">
            <strong>Event Setting:</strong>
            Block Party<input type="hidden" name="id" value="block party">
            <p>
                <strong>Description:</strong>
                location<input type="hidden" name="description" value="Location">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $550.00<input type="hidden" name="price" value="550">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
    </tr>
    <tr>
        <td>
        <form name="ES Item 4" method="POST" action="servlet/CartController">
            <strong>Event Setting:</strong>
            Corporate Event<input type="hidden" name="id" value="corporate event">
            <p>
                <strong>Description:</strong>
                location<input type="hidden" name="description" value="Location">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $400.00<input type="hidden" name="price" value="400">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="EP Item 1" method="POST" action="servlet/CartController">
            <strong>Event Planning:</strong>
            Fundraising<input type="hidden" name="id" value="fundraising">
            <p>
                <strong>Description:</strong>
                planning<input type="hidden" name="description" value="Planning">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $500.00<input type="hidden" name="price" value="500">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="EP Item 2" method="POST" action="servlet/CartController">
            <strong>Event Planning:</strong>
            Graduation<input type="hidden" name="id" value="graduation">
            <p>
                <strong>Description:</strong>
                planning<input type="hidden" name="description" value="Planning">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $700.00<input type="hidden" name="price" value="700">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
    </tr>
    <tr>
        <td>
        <form name="EP Item 3" method="POST" action="servlet/CartController">
            <strong>Event Planning:</strong>
            Showers<input type="hidden" name="id" value="showers">
            <p>
                <strong>Description:</strong>
                planning<input type="hidden" name="description" value="Planning">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $600.00<input type="hidden" name="price" value="600">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="EP Item 4" method="POST" action="servlet/CartController">
            <strong>Event Planning:</strong>
            Destination Wedding<input type="hidden" name="id" value="destination wedding">
            <p>
                <strong>Description:</strong>
                planning<input type="hidden" name="description" value="Planning">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $1000.00<input type="hidden" name="price" value="1000">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="CAT Item 1" method="POST" action="servlet/CartController">
            <strong>Catering:</strong>
            Tea Party<input type="hidden" name="id" value="tea party">
            <p>
                <strong>Description:</strong>
                serving<input type="hidden" name="description" value="Serving">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $300.00<input type="hidden" name="price" value="300">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
    </tr>
    <tr>
        <td>
        <form name="CAT Item 2" method="POST" action="servlet/CartController">
            <strong>Catering:</strong>
            Dinner Party<input type="hidden" name="id" value="dinner party">
            <p>
                <strong>Description:</strong>
                serving<input type="hidden" name="description" value="Serving">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $425.00<input type="hidden" name="price" value="425">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="CAT Item 3" method="POST" action="servlet/CartController">
            <strong>Catering:</strong>
            Banquet<input type="hidden" name="id" value="banquet">
            <p>
                <strong>Description:</strong>
                serving<input type="hidden" name="description" value="Serving">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $1500.00<input type="hidden" name="price" value="1500">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="FG Item 1" method="POST" action="servlet/CartController">
            <strong>Flowers & Gifts:</strong>
            In a Vase<input type="hidden" name="id" value="in a vase">
            <p>
                <strong>Description:</strong>
                design<input type="hidden" name="description" value="Design">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $100.00<input type="hidden" name="price" value="100">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
    </tr>
    <tr>
        <td>
        <form name="FG Item 2" method="POST" action="servlet/CartController">
            <strong>Flowers & Gifts:</strong>
            Plant<input type="hidden" name="id" value="plant">
            <p>
                <strong>Description:</strong>
                design<input type="hidden" name="description" value="Design">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $65.00<input type="hidden" name="price" value="65">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="FG Item 3" method="POST" action="servlet/CartController">
            <strong>Flowers & Gifts:</strong>
            Lavish<input type="hidden" name="id" value="lavish">
            <p>
                <strong>Description:</strong>
                design<input type="hidden" name="description" value="Design">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $50.00<input type="hidden" name="price" value="50">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="FG Item 4" method="POST" action="servlet/CartController">
            <strong>Flowers & Gifts:</strong>
            Modern<input type="hidden" name="id" value="modern">
            <p>
                <strong>Description:</strong>
                design<input type="hidden" name="description" value="Design">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $100.00<input type="hidden" name="price" value="100">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
    </tr>
    <tr>
        <td>
        <form name="FG Item 5" method="POST" action="servlet/CartController">
            <strong>Flowers & Gifts:</strong>
            Small Plush Toy<input type="hidden" name="id" value="small plush toy">
            <p>
                <strong>Description:</strong>
                personalized design<input type="hidden" name="description" value="Personalized Design">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $55.00<input type="hidden" name="price" value="55">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="FG Item 6" method="POST" action="servlet/CartController">
            <strong>Flowers & Gifts:</strong>
            Large Plush Toy<input type="hidden" name="id" value="large plush toy">
            <p>
                <strong>Description:</strong>
                personalized design<input type="hidden" name="description" value="Personalized Design">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $100.00<input type="hidden" name="price" value="100">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="FG Item 7" method="POST" action="servlet/CartController">
            <strong>Flowers & Gifts:</strong>
            Housewarming Gifts<input type="hidden" name="id" value="housewarming gifts">
            <p>
                <strong>Description:</strong>
                personalized design<input type="hidden" name="description" value="Personalized Design">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $80.00<input type="hidden" name="price" value="80">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
    </tr>
    <tr>
        <td>
        <form name="FG Item 8" method="POST" action="servlet/CartController">
            <strong>Flowers & Gifts:</strong>
            Photo Gifts<input type="hidden" name="id" value="photo gifts">
            <p>
                <strong>Description:</strong>
                personalized design<input type="hidden" name="description" value="Personalized Design">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $85.00<input type="hidden" name="price" value="85">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="FG Item 9" method="POST" action="servlet/CartController">
            <strong>Flowers & Gifts:</strong>
            Birthday Gifts<input type="hidden" name="id" value="birthday gifts">
            <p>
                <strong>Description:</strong>
                personalized design<input type="hidden" name="description" value="Personalized Design">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $100.00<input type="hidden" name="price" value="100">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
        <td>
        <form name="FG Item 10" method="POST" action="servlet/CartController">
            <strong>Flowers & Gifts:</strong>
            Anniversary Gifts<input type="hidden" name="id" value="anniversary gifts">
            <p>
                <strong>Description:</strong>
                personalized design<input type="hidden" name="description" value="Personalized Design">
            </p>
            <strong>Quantity:</strong>
            1<input type="hidden" name="quantity" value="1">
            </p>
            <p>
                <strong>Price:</strong>
                $150.00<input type="hidden" name="price" value="150">
            </p>
            <input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart" value="Add To Cart">
        </form>
    </td>
    </tr>
</table>
<p> </p>
<footer>
    <jsp:include page="footer.jsp"/>
</footer>

</body>
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
<!-- ---------------------------------------------------------------------------------- -->
</html>