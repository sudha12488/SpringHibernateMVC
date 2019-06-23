package com.employee.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.beans.EmployeeBO;
import com.employee.dao.IEmployeeDao;
import com.employee.form.EmployeeForm;

@Repository
@Transactional
public class EmployeeDaoImpl implements IEmployeeDao{
	Logger logger=Logger.getLogger(EmployeeDaoImpl.class.getName());
	@Autowired
	private SessionFactory sessionFactory=null;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	public void createEmployee(EmployeeForm employeeForm){
		Session session=sessionFactory.openSession();
		EmployeeBO employeeBO=getEmployeeDetails(employeeForm);
		session.beginTransaction();
		session.save(employeeBO);
		session.getTransaction().commit();
		session.close();
	}
	public void update(EmployeeForm employeeForm){
		Session session=sessionFactory.openSession();
		EmployeeBO employeeBO=getEmployeeDetails(employeeForm);
		session.beginTransaction();
		session.update(employeeBO);
		session.getTransaction().commit();
		session.close();
	}
	public void delete(int id){
		logger.info("Delete method started");
		Session session=sessionFactory.openSession();
		EmployeeBO emp=(EmployeeBO) session.get(EmployeeBO.class, id);
		if(emp!=null){
			session.beginTransaction();
			session.delete(emp);
			session.getTransaction().commit();
			session.close();
		}
	}
	public EmployeeBO getEmpById(int id){
		Session session=sessionFactory.openSession();
		return (EmployeeBO) session.get(EmployeeBO.class, id);
	}
	@SuppressWarnings("unchecked")
	public List<EmployeeBO> getEmployees(){
		Session session=sessionFactory.openSession();
		return session.createQuery("from EmployeeBO").list();
	}
	
	@SuppressWarnings("unused")
	private EmployeeBO getEmployeeDetails(EmployeeForm employeeForm){
		EmployeeBO employeeBO=new EmployeeBO();
		employeeBO.setEmpName(employeeForm.getEmployeeName());
		employeeBO.setSalary(employeeForm.getSalary());
		employeeBO.setDesignation(employeeForm.getDesignation());
		employeeBO.setEmail(employeeForm.getEmail());
		employeeBO.setGender(employeeForm.getGender());
		employeeBO.setMobileNo(employeeForm.getMobileNo());
		//employeeBO.setJoiningDate(employeeForm.getJoiningDate().);
		return employeeBO;
	}
}
