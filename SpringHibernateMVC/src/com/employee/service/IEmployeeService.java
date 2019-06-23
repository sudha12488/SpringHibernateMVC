package com.employee.service;

import java.util.List;

import com.employee.beans.EmployeeBO;
import com.employee.form.EmployeeForm;

public interface IEmployeeService {
	public void createEmployee(EmployeeForm employeeForm);
	public void update(EmployeeForm employeeForm);
	public void delete(int id);
	public EmployeeBO getEmpById(int id);
	public List<EmployeeBO> getEmployees();
}
