package com.employee.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.employee.form.EmployeeForm;

@Component
public class EmployeeValidator implements Validator{

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object obj, Errors errors) {
		System.out.println("Employee Validator");
		EmployeeForm employeeForm=(EmployeeForm)obj;
		if(employeeForm.getEmployeeName()==null||employeeForm.getEmployeeName().trim().isEmpty()){
			errors.rejectValue("employeeName","employeeForm.employeeName.empty");
			return;
		}
	}

}
