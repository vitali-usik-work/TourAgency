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
			<c:if test="${not empty user and user.role eq 'user'}"><a href="controller?command=viewMyTours&userId=${user.id }">View My Tours</a></c:if>
			<c:if test="${not empty user and user.role eq 'admin'}"><a href="controller?command=viewAllUsers">View Users</a></c:if>
			<c:if test="${not empty user and user.role eq 'admin'}"><a href="controller?command=addUser">Add user</a></c:if>
			<c:if test="${not empty user and user.role eq 'admin'}"><a href="controller?command=addTour">Add tour</a></c:if>
		</div>
	
		<div class="tours">
			<h4>Tours</h4>
			<c:if test="${not empty user and user.role eq 'admin'}"><h5><a href="controller?command=addTour">Add tour</a></h5></c:if>
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
					<th>free_places</th>
					<c:if test="${not empty user and user.role eq 'user'}">
						<th>Book</th>
					</c:if>
					<c:if test="${not empty user and user.role eq 'admin'}">
						<th>Actions</th>
					</c:if>
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
					<td><c:out value="${tour.free_places}"/></td>
					<c:if test="${not empty user and user.role eq 'user'}">
						<td><a href="controller?command=book&tourId=${tour.id}&free_places=${tour.free_places}">Book</a></td>
					</c:if>
					<c:if test="${not empty user and user.role eq 'admin'}">
						<td>
							<a href="controller?command=deleteTour&tourId=${tour.id }">Delete</a>
						</td>
					</c:if>
				</tr>
				</c:if>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>