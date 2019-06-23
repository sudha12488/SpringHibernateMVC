package com.employee.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.employee.form.UserForm;

@Component
public class UserValidator implements Validator{

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object obj, Errors errors) {
		UserForm userForm=(UserForm)obj;
		if(userForm.getUserName()==null || userForm.getUserName().trim().isEmpty()){
			errors.rejectValue("userName","userForm.userName.empty");
			System.out.println("errors in validate");
			return;
		}
		/*if(userForm.getUserName()!=null && !userForm.getUserName().trim().isEmpty() && userForm.getUserName().length()!=5){
			errors.rejectValue("userName","userForm.userName.length");
			System.out.println("errors in validate");
			return;
		}*/
		if(userForm.getPassword()==null || userForm.getPassword().trim().isEmpty()){
			//errors.rejectValue("password",null,"Password is empty");
			errors.rejectValue("password","userForm.password.empty");
		}
		if(userForm.getConfirmPassword()==null || userForm.getConfirmPassword().trim().isEmpty()){
			//errors.rejectValue("password",null,"Password is empty");
			errors.rejectValue("confirmPassword","userForm.confirmPassword.empty");
		}
		
	}

}
