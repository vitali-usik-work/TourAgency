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
          <h4>Confirm Tour</h4>
          <form action="controller" method="post">
            <input type="hidden" name="command" value="confirmBook" />
            <input type="hidden" name="tourId" value="${tourId}" /> 
            <input type="hidden" name="free_places" value="${free_places}" />
            <input type="hidden" name="userId" value="${user.id}" /> 
            <div class="form_field">
              <div class="form_name" style="width: 500px;">
                <p>Select the number of persons :</p>
              </div>
              <div class="form_input clr">
                <select name="amount" size="1">
                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
                </select>
              </div>
            </div>
            <div class="form_field">
              <input type="submit" value="confirm">
            </div>
          </form>
        </div>

      </div>
    </div>
  </div>
  <!-- /page container with header and main part -->
  <!-- footer -->
  <%@include file="partials/footer.jspf"%>

</body>
</html>