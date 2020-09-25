<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<h2>Party Time! We Bring Life to Your Party!</h2>
<div class="topNavBar" id="myTopnav">
    <a href="${contextPath}/welcome" class="active">Welcome</a>
    <a href="${contextPath}/services">Our Services</a>
    <a href="${contextPath}/contact_us">Contact Us</a>
    <a href="${contextPath}/shopping_cart">Shopping Cart</a>
    <a href="javascript:void(0);" class="icon" onclick="myFunction()">
        <i class="fa fa-bars"></i>
    </a>
</div>
