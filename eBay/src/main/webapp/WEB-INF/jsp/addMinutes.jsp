<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Minutes Page</title>
</head>
<body>
<h1>Add Minutes Exercised</h1>
<form:form commandName="exercise">
			Minutes Exercise For Today:
			<p>Name:<form:input path="minutes"/></p>
			<input type="submit" value="Enter Exercise"/>
	
</form:form>
</body>
</html>