<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h2>Employee Management</h2>
<script src="http://code.jquery.com/jquery-1.6.2.min.js"></script>
<script type="text/javascript">
 function openPage(pageURL)
 {
	 window.location.href = pageURL;
 }
</script>
</head>
<body>
	<input type="button" value="CreateEmployee" name="CreateEmployee"
   	 	onclick="openPage('loadEmployee')"/>
   	<input type="button" value="UpdateEmployee" name="UpdateEmployee"
   		onclick="openPage('loadSearch')"/>
   	<input type="button" value="DeleteEmployee" name="DeleteEmployee"
   		onclick="openPage('loadSearch')"/>	
	<input type="button" value="SearchEmployee" name="SearchEmployee"
   		onclick="openPage('loadSearch')"/>
</body>
</html>