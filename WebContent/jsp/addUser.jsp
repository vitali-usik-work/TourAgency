<%@ page language="java" contentType="text/html; charset=Utf-8"
  pageEncoding="Utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add new user</title>
<link rel="stylesheet" href="css/style2.css" type="text/css"
  media="screen">
<script type="text/javascript" src='js/jquery-1.8.3.js'></script>
<script type="text/javascript" src='js/jquery.validate.min.js'></script>
<script type="text/javascript" src='js/myscripts.js'></script>
<script type='text/javascript'>
  function validate() {
    //Считаем значения из полей name и email в переменные x и y
    var x = document.forms['userForm']['surname'].value;
    var y = document.forms['userForm']['name'].value;
    //Если поле name пустое выведем сообщение и предотвратим отправку формы
    if (x.length == 0) {
      document.getElementById('namef').innerHTML = '*данное поле обязательно для заполнения';
      return false;
    }
    //Если поле email пустое выведем сообщение и предотвратим отправку формы
    if (y.length == 0) {
      document.getElementById('emailf').innerHTML = '*данное поле обязательно для заполнения';
      return false;
    }
  }
</script>
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
        <%@include file="partials/new_user.jspf"%>
      </div>
    </div>
  </div>
  <!-- /page container with header and main part -->
  <!-- footer -->
  <%@include file="partials/footer.jspf"%>
</body>
</html>