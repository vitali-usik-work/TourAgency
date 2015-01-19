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
			
		</div>
	
		<div class="users">
			<h4>Users</h4>
			<table class="tour_table" width="100%" cellpadding="0" cellspacing="0">
				<tr>
					<th>id</th>
					<th>surname</th>
					<th>name</th>
					<th>role</th>
					<th>sum_of_trip</th>
					<th>discount</th>
					<th>Delete user (not work)</th>
				</tr>
				<c:forEach  var="user" items="${userList}">
				<c:if test="${not empty user}">
				<tr>
					<td><c:out value="${user.id}"/></td>
					<td><c:out value="${user.surname}"/></td>
					<td><c:out value="${user.name}"/></td>
					<td><c:out value="${user.role}"/></td>
					<td><c:out value="${user.sum_of_trip}"/></td>
					<td><c:out value="${user.discount}"/> %</td>
					<td><a href="controller?command=book&tourId=${tour.id}&free_places=${tour.free_places}">Delete (not work)</a></td>
				</tr>
				</c:if>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>