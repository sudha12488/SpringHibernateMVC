<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<head>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
<jsp:include page="home.jsp"></jsp:include>
<form:form method="get" action="createEmployee" commandName="employeeForm">  
<table>  
	<tr>  
    	<td><form:label path="employeeName">EmployeeName</form:label>
       	<td><form:input path="employeeName" /></td>
       	<td><form:errors path="employeeName" cssClass="error" /></td>
    </tr>  
    <tr>  
     	<td><form:label path="salary" name="salary">Salary</form:label>
       	<td><form:input path="salary" /></td>
    </tr> 
    <tr>  
     	<td><form:label path="designation" name="designation">Designation</form:label> 
        <td><form:input path="designation" /></td>
    </tr> 
    <tr>  
     	<td><form:label path="mobileNo" name="mobileNo">Mobile</form:label> 
        <td><form:input path="mobileNo" /></td>
    </tr>
    <tr>
    	<td><form:label path="email">Email</form:label></td>
        <td><form:input path="email" /> </td>
        <td><form:errors path="email" cssClass="error" /></td>
    </tr>
    <tr>  
     	<td><form:label path="gender">Gender</form:label> 
        <td><form:radiobutton path="gender" value="Male" label="Male"/></td>
        <td><form:radiobutton path="gender" value="Female" label="Female"/></td>
    </tr>
    <tr>
    	<td>Country</td>
    	<td>
    		<select>
    			<c:forEach var="country" items="${employeeForm.country}">
    				<option value="country.countryName">${country.countryName}</option>
    			</c:forEach>
   			 </select>
   		 </td>
    </tr>
    <tr>  
     	<td> </td>  
       	<td><input type="submit" value="Create" /></td>  
    </tr>  
</table>  
       </form:form>
</body>  
