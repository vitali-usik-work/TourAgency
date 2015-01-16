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
			<p>Hello,<c:out value=" ${user.name}!"/><br />
			<c:out value=" ${user.role}"/><br />
			<a href="controller?command=exit"><fmt:message key="main.exit"/></a></p>
		</div>
		<div class="header_nav">
			<a href="login.jsp">Login</a>
			<a href="controller?command=home">Main</a>
			<%-- <a href="controller?command=goMain&role=${user.role}">Main page</a>
			<a href="controller?command=myOrders&login=${user.login}"><fmt:message key="main.myOrdres"/></a>
			<c:if test="${not empty user and user.role eq 'admin'}"><a href="controller?command=viewRentCars"><fmt:message key="main.ordersOnHands"/></a></c:if>
			<c:if test="${not empty user and user.role eq 'admin'}"><a href="controller?command=viewAllOrders"><fmt:message key="main.allOrders"/></a></c:if> --%>
		</div>
	
		<div class="tours">
			<h4>My Tours</h4>
			<table class="tour_table" width="100%" cellpadding="0" cellspacing="0">
				<tr>
					<th>id</th>
					<th>cost</th>
					<th>transport</th>
					<th>date_from</th>
					<th>date_to</th>
					<th>country</th>
					<th>hotel</th>
					<th>type_of_trip</th>
				</tr>
				<c:forEach  var="tour" items="${tourList}">
				<c:if test="${not empty tour}">
				<tr>
					<td><c:out value="${tour.id}"/></td>
					<td><c:out value="${tour.cost}"/></td>
					<td><c:out value="${tour.transport}"/></td>
					<td><c:out value="${tour.date_from}"/></td>
					<td><c:out value="${tour.date_to}"/></td>
					<td><c:out value="${tour.country}"/></td>
					<td><c:out value="${tour.hotel}"/></td>
					<td><c:out value="${tour.type_of_trip}"/></td>
				</tr>
				</c:if>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>