package com.employee.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.beans.UserBO;
import com.employee.dao.IUserDao;
import com.employee.form.UserForm;
import com.employee.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDao userDao;
	
	public UserBO getUserByName(String name) {
		UserBO userBO;
		userBO=userDao.getUserByName(name);
		return userBO;
	}

	public void createUser(UserForm userForm) {
		userDao.createUser(userForm);		
	}

}
