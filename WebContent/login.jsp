<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="Utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login</title>
	<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
	<script type="text/javascript" src='js/jquery-1.8.3.js'></script>
	<script type="text/javascript" src='js/jquery.validate.min.js'></script>
	<script type="text/javascript" src='js/myscripts.js'></script>
</head>
<body>

<div class="wrapper">
		<div class="header">
			<h1>Login</h1>
		</div>
<div class="users">
	<h4>Hello, guest! Please, login for use our resource!</h4>
	<form name="loginForm" method="post" id="loginform" action="controller">
		<input type="hidden" name="command" value="login"/>
		Name:<br/>
		<input type="text" name="name" value=""><br/>
		Surname:<br/>
		<input type="text" name="surname" value=""><br/>
		<input type="submit" value="Enter">
	</form>
</div>
</div>
</body>
</html>