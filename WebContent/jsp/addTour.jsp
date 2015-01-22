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
	<script type='text/javascript'>
		function validate() {
			//Считаем значения из полей name и email в переменные x и y
			var x = document.forms['tourForm']['cost'].value;
			var y = document.forms['tourForm']['date_from'].value;
			var z = document.forms['tourForm']['date_to'].value;
			var u = document.forms['tourForm']['country'].value;
			var t = document.forms['tourForm']['free_places'].value;
			//Если поле name пустое выведем сообщение и предотвратим отправку формы
			if (x.length == 0) {
				document.getElementById('costf').innerHTML = '*данное поле обязательно для заполнения';
				return false;
			}
			//Если поле email пустое выведем сообщение и предотвратим отправку формы
			if (y.length == 0) {
				document.getElementById('date_fromf').innerHTML = '*данное поле обязательно для заполнения';
				return false;
			}
			if (z.length == 0) {
				document.getElementById('date_tof').innerHTML = '*данное поле обязательно для заполнения';
				return false;
			}
			if (u.length == 0) {
				document.getElementById('countryf').innerHTML = '*данное поле обязательно для заполнения';
				return false;
			}
			if (t.length == 0) {
				document.getElementById('free_placesf').innerHTML = '*данное поле обязательно для заполнения';
				return false;
			}
		}
	</script>
</head>
<body>

<div class="wrapper">
	<div class="header">
		<h1>Login</h1>
		<c:if test="${not empty user}">
			<p>Hello,<c:out value=" ${user.name}!"/><br />
			<c:out value=" ${user.role}"/><br />
			<a href="controller?command=exit">Exit</a></p>
		</c:if>
	</div>
	<div class="header_nav">
		<a href="login.jsp">Login</a>
		<a href="controller?command=home">Main</a>
	</div>
	<div class="users">
		<h4>Add new tour</h4>
		<form name="tourForm" method="post" id="tourform" action="controller" onsubmit='return validate()'>
			<input type="hidden" name="command" value="addNewTour"/>
			Cost: <input type="text" name="cost" value=""><span style='color:red' id='costf'></span><br/><br/>
			Transport:
			<select name="transport" size="1">
	   			<option value="plane">plane</option>
	  			<option value="bus">bus</option>
	   		</select><br/><br/>
			Date from: <input type="date" name="date_from" value=""><span style='color:red' id='date_fromf'></span><br/><br/>
			Date to: <input type="date" name="date_to" value=""><span style='color:red' id='date_tof'></span><br/><br/>
			Country: <input type="text" name="country" value=""><span style='color:red' id='countryf'></span><br/><br/>
			Hotel:
			<select name="hotel" size="1">
	   			<option value="1">1</option>
	  			<option value="2">2</option>
	  			<option value="3">3</option>
	  			<option value="4">4</option>
	  			<option value="5">5</option>
	   		</select><br/><br/>
			Type of trip:
			<select name="type_of_trip" size="1">
	   			<option value="mountains">mountains</option>
	  			<option value="sea">sea</option>
	  			<option value="excursion">excursion</option>
	  			<option value="shopping">shopping</option>
	   		</select><br/><br/>
			Free places: <input type="number" name="free_places" value=""><span style='color:red' id='free_placesf'></span><br/><br/>
			<input type="submit" value="Enter">
		</form>
	</div>
		<script>

		document.getElementsByTagName('input')[1].onkeypress = function(e) {
		
		  e = e || event;
		
		  if (e.ctrlKey || e.altKey || e.metaKey) return;
		
		  var chr = getChar(e);
		
		  // с null надо осторожно в неравенствах, т.к. например null >= '0' => true!
		  // на всякий случай лучше вынести проверку chr == null отдельно
		  if (chr == null) return;
		
		  if (chr < '0' || chr > '9') {
		    return false;
		  }
		
		}
		
		function getChar(event) {
		  if (event.which == null) {
		    if (event.keyCode < 32) return null;
		    return String.fromCharCode(event.keyCode) // IE
		  }
		
		  if (event.which!=0 && event.charCode!=0) {
		    if (event.which < 32) return null;
		    return String.fromCharCode(event.which)   // остальные
		  }
		
		  return null; // специальная клавиша
		}

	</script>
	<script>

		document.getElementsByTagName('input')[5].onkeypress = function(e) {
		
		  e = e || event;
		
		  if (e.ctrlKey || e.altKey || e.metaKey) return;
		
		  var chr = getChar(e);
		
		  // с null надо осторожно в неравенствах, т.к. например null >= '0' => true!
		  // на всякий случай лучше вынести проверку chr == null отдельно
		  if (chr == null) return;
		
		  if (chr < '0' || chr > '9') {
		    return false;
		  }
		
		}
		
		function getChar(event) {
		  if (event.which == null) {
		    if (event.keyCode < 32) return null;
		    return String.fromCharCode(event.keyCode) // IE
		  }
		
		  if (event.which!=0 && event.charCode!=0) {
		    if (event.which < 32) return null;
		    return String.fromCharCode(event.which)   // остальные
		  }
		
		  return null; // специальная клавиша
		}

	</script>
	</div>
</body>
</html>