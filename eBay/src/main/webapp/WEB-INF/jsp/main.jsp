<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to FilmMarket</h1>
	<a href="reg.html">Register</a>
	<table>
		<td>
			<h3>Enter</h3>
			<form:form commandName="enter">
			 <p>Name: <form:input path="name"/></p>
			 <p>Password: <form:input path="pWord"/></p>			
			 <p><input type="submit" value = "Enter"/></p>
			</form:form>
		</td>
	</table>
</body>
</html>