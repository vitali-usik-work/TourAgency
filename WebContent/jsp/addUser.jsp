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
	<div class="header_nav">
		<a href="login.jsp">Login</a>
		<a href="controller?command=home">Main</a>
	</div>
	<div class="users">
		<h4>Add new user</h4>
		<form name="userForm" method="post" id="userform" action="controller">
			<input type="hidden" name="command" value="addNewUser"/>
			Surname:<br/>
			<input type="text" name="surname" value=""><br/>
			Name:<br/>
			<input type="text" name="name" value="">
			Role:<br/>
			<select name="role" size="1">
	   			<option value="user">user</option>
	  			<option value="admin">admin</option>
	   		</select>
			<br/><br/>
			<input type="submit" value="Enter">
		</form>
	</div>
</div>
</body>
</html>