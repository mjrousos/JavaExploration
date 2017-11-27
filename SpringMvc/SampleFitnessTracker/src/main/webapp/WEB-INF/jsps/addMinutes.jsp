<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  <!-- Note that the prefix can be anything -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Minutes</title>
<script type="text/javascript" src="jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(document).ready(
		function(){
			$.getJSON('<spring:url value="activities.json" />', { ajax: 'true' }, function(data) {
				var html = '<option value="">--Please select activity--</option>';
				var len = data.length;
				for (var i = 0; i < len; i++) {
					html += '<option value="' + data[i].desc + '">' + data[i].desc + '</option>';					
				}
				
				$('#activities').html(html);
			})
		});
</script>
</head>
<body>
	<h1>Add Minutes Exercised</h1>
	Language: <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
	<form:form modelAttribute="exercise">
		<table>
			<tr>
				<td><spring:message code="minutes.text" /></td>
				<td><form:input path="minutes"/></td>
				<td>
					<form:select path="activity" id="activities"></form:select>
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<input type="submit" value="Enter Exercise" />
				</td>
			</tr>			
		</table>
	</form:form>
	<!-- $ (and { and }) can retrieve session state -->
	<h1>Goal for today is ${goal.minutes}</h1>
	<!-- Found via the mvc:resources handler -->
	<img src="assets/images/Alliance.jpg" />
</body>
</html>