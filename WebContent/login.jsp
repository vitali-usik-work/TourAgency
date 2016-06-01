<%@ page language="java" contentType="text/html; charset=Utf-8" pageEncoding="Utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/style2.css" type="text/css" media="screen">
<script type="text/javascript" src='js/jquery-1.8.3.js'></script>
<script type="text/javascript" src='js/jquery.validate.min.js'></script>
<script type="text/javascript" src='js/myscripts.js'></script>
</head>
<body>

  <div class="container_wrapper">
    <!-- header -->
    <%@include file="jsp/partials/header.jspf"%>
    <!-- navigation -->
    <%@include file="jsp/partials/nav.jspf"%>

    <div class="content_wrapper">
      <!-- sidebar -->
      <%@include file="jsp/partials/sidebar.jspf"%>
      <!-- content -->
      <div class="content">
        <div class="login_wrapper">
          <h4>Hello, guest! Please, login for use our resource!</h4>
          <form name="loginForm" method="post" id="loginform" action="controller">
            <input type="hidden" name="command" value="login" />
            
            <div class="form_field">
              <div class="form_name">
                <p>Name:</p>
              </div>
              <div class="form_input clr">
                <input type="text" name="name" value="" placeholder="Please enter your name">
              </div>
            </div>
            
            <div class="form_field">
              <div class="form_name">
                <p>Surname:</p>
              </div>
              <div class="form_input clr">
                <input type="text" name="surname" value="" placeholder="Please enter your surname">
              </div>
            </div>
            
            <div class="form_field">
              <input type="submit" value="Enter" name="submit">
            </div>
            
          </form>
        </div>
      </div>
    </div>

  </div>
  <!-- /page container with header and main part -->
  <!-- footer -->
  <%@include file="jsp/partials/footer.jspf"%>
  
</body>
</html>