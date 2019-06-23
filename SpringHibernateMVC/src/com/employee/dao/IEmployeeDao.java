package com.employee.dao;

import java.util.List;

import com.employee.beans.EmployeeBO;
import com.employee.form.EmployeeForm;

public interface IEmployeeDao {
	public void createEmployee(EmployeeForm employeeeForm);
	public void update(EmployeeForm employeeForm);
	public void delete(int id);
	public EmployeeBO getEmpById(int id);
	public List<EmployeeBO> getEmployees();

}
