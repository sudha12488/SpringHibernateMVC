package com.employee.service;

import com.employee.beans.UserBO;
import com.employee.form.UserForm;

public interface IUserService {
	public UserBO getUserByName(String name);
	public void createUser(UserForm userForm);
}
