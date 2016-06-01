<%@ page language="java" contentType="text/html; charset=Utf-8"
  pageEncoding="Utf-8"%>
<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tour Agency</title>
<!-- scripts -->
<!--  css -->
<link rel="stylesheet" href="css/style2.css" type="text/css"
  media="screen">
</head>
<body>
  
  <div class="container_wrapper">
    <!-- header -->
    <%@include file="partials/header.jspf" %>
    <!-- navigation -->
    <%@include file="partials/nav.jspf" %>

    <div class="wrapper">
      <div class="header_nav">
        <a href="login.jsp" name="login">Login</a>
        <c:if test="${not empty user and user.role eq 'user'}">
          <a href="controller?command=viewMyTours&userId=${user.id }">View
            My Tours</a>
        </c:if>
        <c:if test="${not empty user and user.role eq 'admin'}">
          <a href="controller?command=viewAllUsers">View Users</a>
        </c:if>
        <c:if test="${not empty user and user.role eq 'admin'}">
          <a href="controller?command=addUser">Add user</a>
        </c:if>
        <c:if test="${not empty user and user.role eq 'admin'}">
          <a href="controller?command=addTour">Add tour</a>
        </c:if>
      </div>
    </div>

  </div>
  <!-- /page container with header and main part -->
  <!-- footer -->
  <%@include file="partials/footer.jspf"%>



</body>
</html>