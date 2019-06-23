package com.employee.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.beans.UserBO;
import com.employee.dao.IUserDao;
import com.employee.form.UserForm;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao {
	@Autowired
	SessionFactory sessionFactory;
	public UserBO getUserByName(String name) {
		UserBO userBO=null;
		try{
		
		Session session=null;
		session=sessionFactory.openSession();
		
		userBO=(UserBO)(session.createCriteria(UserBO.class).
				add(Restrictions.ilike("userName", name, MatchMode.EXACT)).uniqueResult());	
		}catch(Exception e){
			System.out.println("UserDao "+e.getMessage());
		}
		return userBO;
	}
	public void createUser(UserForm userForm) {
		//System.out.println("Name "+userForm.getFirstName());
		if(userForm.getUserName()!=null){
		UserBO userBO=getUserFormDetails(userForm);
		Session session=null;
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(userBO);
		session.getTransaction().commit();
		session.close();
		}
	}
	
	private UserBO getUserFormDetails(UserForm userForm){
		UserBO userBO=new UserBO();
		userBO.setUserName(userForm.getUserName());
		userBO.setPassword(userForm.getPassword());
		userBO.setConfirmPassword(userForm.getConfirmPassword());
		return userBO;
	}

}
