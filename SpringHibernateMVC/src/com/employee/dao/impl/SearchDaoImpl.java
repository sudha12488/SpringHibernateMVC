package com.employee.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.beans.EmployeeBO;
import com.employee.dao.ISearchDao;
import com.employee.form.EmployeeForm;

@Repository
@Transactional
public class SearchDaoImpl implements ISearchDao{
	@Autowired
	SessionFactory sessionFactory=null;
	public EmployeeForm searchEmployee(String employeeName) {
		Session session=null;
		EmployeeBO employeeBO=null;
		EmployeeForm employeeForm=null;
		try{
			session=sessionFactory.openSession();
			employeeBO=(EmployeeBO)(session.createCriteria(EmployeeBO.class).
					add(Restrictions.ilike("empName", employeeName, MatchMode.EXACT)).uniqueResult());	
			employeeForm=getEmployeeDetails(employeeBO);
		}catch(Exception e){
			System.out.println("Exception in Search"+e.getMessage());
		}
		return employeeForm;
	}

	@SuppressWarnings("unused")
	private EmployeeForm getEmployeeDetails(EmployeeBO employeeBO){
		EmployeeForm employeeForm=new EmployeeForm();
		employeeForm.setEmployeeName(employeeBO.getEmpName());
		employeeForm.setSalary(employeeBO.getSalary());
		employeeForm.setDesignation(employeeBO.getDesignation());
		employeeForm.setEmail(employeeBO.getEmail());
		employeeForm.setGender(employeeBO.getGender());
		employeeForm.setMobileNo(employeeBO.getMobileNo());
		return employeeForm;
	}

}
