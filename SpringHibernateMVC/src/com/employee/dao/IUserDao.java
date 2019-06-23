package com.employee.dao;

import com.employee.beans.UserBO;
import com.employee.form.UserForm;

public interface IUserDao {
	public UserBO getUserByName(String name);
	public void createUser(UserForm userForm);
}
