<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="Utf-8"%>
<!DOCTYPE html>
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
		<h4>Add new tour</h4>
		<form name="tourForm" method="post" id="tourform" action="controller">
			<input type="hidden" name="command" value="addNewTour"/>
			Cost:<br/>
			<input type="text" name="cost" value=""><br/>
			Transport:<br/><br/>
			<select name="transport" size="1">
	   			<option value="plane">plane</option>
	  			<option value="bus">bus</option>
	   		</select>
			Date from:<br/>
			<input type="date" name="date_from" value=""><br/>
			Date to:<br/>
			<input type="date" name="date_to" value=""><br/>
			Country:<br/>
			<input type="text" name="country" value=""><br/>
			Hotel:<br/>
			<select name="hotel" size="1">
	   			<option value="1">1</option>
	  			<option value="2">2</option>
	  			<option value="3">3</option>
	  			<option value="4">4</option>
	  			<option value="5">5</option>
	   		</select>
			Type of trip:<br/><br/>
			<select name="type_of_trip" size="1">
	   			<option value="mountains">mountains</option>
	  			<option value="sea">sea</option>
	  			<option value="excursion">excursion</option>
	  			<option value="shopping">shopping</option>
	   		</select>
			Free places:<br/>
			<input type="number" name="free_places" value=""><br/>
			<br/><br/>
			<input type="submit" value="Enter">
		</form>
	</div>
</div>
</body>
</html>