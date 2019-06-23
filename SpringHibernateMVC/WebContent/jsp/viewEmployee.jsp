<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<body>
<jsp:include page="home.jsp"></jsp:include>
<table>
	<tr>
		<td><form:label path="employeeForm.employeeName" >EmployeeName</form:label>
		<td><form:input path="employeeForm.employeeName" value="${employeeForm.employeeName}" disabled="true"/></td>
		
		<td><form:label path="employeeForm.salary">Salary</form:label>
		<td><form:input path="employeeForm.salary" value="${employeeForm.salary}" disabled="true"/></td>
	</tr>
	<tr>
		<td><form:label path="employeeForm.designation">Designation</form:label>
		<td><form:input path="employeeForm.designation" value="${employeeForm.designation}" disabled="true"/></td>
		<td><form:label path="employeeForm.mobileNo">MobileNo</form:label>
		<td><form:input path="employeeForm.mobileNo" value="${employeeForm.mobileNo}" disabled="true"/></td>
	</tr>
	<tr>
		<td><form:label path="employeeForm.email">Email</form:label>
		<td><form:input path="employeeForm.email" value="${employeeForm.email}" disabled="true"/></td>
		<td><form:label path="employeeForm.gender">Gender</form:label>
		<td><form:input path="employeeForm.gender" value="${employeeForm.gender}" disabled="true"/></td>
	</tr>
</table>
<a href="updateEmployee">Click here to Edit Employee Details</a>
</body>
