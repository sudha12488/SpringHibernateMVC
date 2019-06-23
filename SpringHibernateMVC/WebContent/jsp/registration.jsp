<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <%@ page import="com.employee.form.UserForm" %>
 <%@page import="org.springframework.validation.ObjectError"%> --%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<style type="text/css">
.error {
	color: red;
}
</style>

</head>
<body>
<h2>User Registration</h2>

<form:form action="registration" method="get" modelAttribute="userForm">
	<table>
   		<tr>
        	<td>
        		<form:label path="userName">UserName</form:label>
          		<form:input path="userName" /> 
          		<form:errors path="userName" cssClass="error" />
         	</td>
        </tr>
        <tr>
         	<td>
        		<form:label path="password">Password</form:label>
          		<form:password path="password" /> 
          		<form:errors path="password" cssClass="error" />
         	</td>
        </tr>
        <tr>
         	<td>
        		<form:label path="confirmPassword">ConfirmPassword</form:label>
          		<form:password path="confirmPassword" /> 
          		<form:errors path="confirmPassword" cssClass="error" />
         	</td>
        </tr>
        <tr>
        <td><button type="submit">Submit</button></td>
      </tr>
    </table>
  </form:form> 
</body>
</html>