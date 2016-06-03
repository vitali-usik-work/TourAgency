<%@ page language="java" contentType="text/html; charset=Utf-8"
  pageEncoding="Utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
    <%@include file="partials/header.jspf"%>
    <!-- navigation -->
    <%@include file="partials/nav.jspf"%>
    <div class="content_wrapper">
      <!-- sidebar -->
      <%@include file="partials/sidebar.jspf"%>
      <!-- content -->
      <div class="content">
        <div class="tours">
          <h4>Users list</h4>
          <table class="tour_table" width="100%" cellpadding="0" cellspacing="0">
            <tr>
              <th>id</th>
              <th>surname</th>
              <th>name</th>
              <th>role</th>
              <th>sum_of_trip</th>
              <th>discount</th>
              <th>Actions</th>
            </tr>
            <c:forEach var="user" items="${userList}">
              <c:if test="${not empty user}">
                <tr>
                  <td><c:out value="${user.id}" /></td>
                  <td><c:out value="${user.surname}" /></td>
                  <td><c:out value="${user.name}" /></td>
                  <td><c:out value="${user.role}" /></td>
                  <td><c:out value="${user.sum_of_trip}" /></td>
                  <td><c:out value="${user.discount}" /> %</td>
                  <td>
                    <a href="controller?command=viewMyTours&userId=${user.id }">View user's torus</a>&nbsp;/&nbsp; 
                    <a href="controller?command=deleteUser&userId=${user.id }">Delete user</a>
                  </td>
                </tr>
              </c:if>
            </c:forEach>
          </table>
        </div>
      </div>
    </div>
  </div>
  <!-- /page container with header and main part -->
  <!-- footer -->
  <%@include file="partials/footer.jspf"%>
  </div>
</body>
</html>