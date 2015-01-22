<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="Utf-8"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Tour Agency</title>
	<!-- scripts -->
	<!--  css -->
	<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
</head>
<body>
	<div class="wrapper">
		<div class="header">
			<h1></h1>
			<c:if test="${not empty user}">
				<p>Hello,<c:out value=" ${user.name}!"/><br />
				<c:out value=" ${user.role}"/><br />
				<a href="controller?command=exit">Exit</a></p>
			</c:if>
		</div>
		<div class="header_nav">
			<a href="login.jsp">Login</a>
			<%-- <a href="controller?command=goMain&role=${user.role}">Main page</a>
			<a href="controller?command=myOrders&login=${user.login}"><fmt:message key="main.myOrdres"/></a>
			<c:if test="${not empty user and user.role eq 'admin'}"><a href="controller?command=viewRentCars"><fmt:message key="main.ordersOnHands"/></a></c:if>
			<c:if test="${not empty user and user.role eq 'admin'}"><a href="controller?command=viewAllOrders"><fmt:message key="main.allOrders"/></a></c:if> --%>
		</div>
	
		<div class="tours">
			<h4>Confirm Tour</h4>
			<form action="controller" method="post">
				<input type="hidden" name="command" value="confirmBook"/>		
				<input type="hidden" name="tourId" value="${tourId}"/>
				<input type="hidden" name="free_places" value="${free_places}"/>
				<input type="hidden" name="userId" value="${user.id}"/>
	    		<select name="amount" size="1">
	    			<option value="1">1</option>
	  				<option value="2">2</option>
	  				<option value="3">3</option>
	  				<option value="4">4</option>
	  				<option value="5">5</option>
	   			 </select><br/>
				<input type="submit" value="confirm">
			</form>
		</div>
	</div>
</body>
</html>