package com.employee.services.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.beans.EmployeeBO;
import com.employee.dao.IEmployeeDao;
import com.employee.form.EmployeeForm;
import com.employee.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	Logger logger=Logger.getLogger(EmployeeServiceImpl.class.getName());
	@Autowired
	private IEmployeeDao employeeDao;	
	public void createEmployee(EmployeeForm employeeForm){
		employeeDao.createEmployee(employeeForm);
	}
	public void update(EmployeeForm employeeForm){
		employeeDao.update(employeeForm);
	}
	public void delete(int id){
		logger.info("Delete method started");
		employeeDao.delete(id);
	}
	public EmployeeBO getEmpById(int id){
		return employeeDao.getEmpById(id);
	}
	@SuppressWarnings("unchecked")
	public List<EmployeeBO> getEmployees(){
		return employeeDao.getEmployees();
	}


}
