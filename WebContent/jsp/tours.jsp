<%@ page language="java" contentType="text/html; charset=Utf-8"
  pageEncoding="Utf-8"%>
<!DOCTYPE html>
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
    <div class="content_wrapper">
      <!-- sidebar -->
      <%@include file="partials/sidebar.jspf"%>
      <!-- content -->
      <div class="content">
        <!-- tour_list -->
        <%@include file="partials/tour_list.jspf"%>
      </div>
    </div>
  </div>
  <!-- /page container with header and main part -->
  <!-- footer -->
  <%@include file="partials/footer.jspf"%>
</body>
</html>