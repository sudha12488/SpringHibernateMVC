package com.employee.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employee.beans.UserBO;
import com.employee.form.UserForm;
import com.employee.service.IUserService;
import com.employee.validation.UserValidator;

@Controller
public class LoginController {
	@Autowired
	IUserService userService;
	@Autowired
	UserValidator userValidator;
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response){
		UserBO userBO;
		System.out.println("Hello World");
		String name=request.getParameter("uname");
		userBO=userService.getUserByName(name);
		if(userBO!=null && userBO.getUserName().equals(name)){
			String message="Welcome "+name;
			return new ModelAndView("home","message",message);
		}else{
			return new ModelAndView("registration","userForm",new UserForm());
		}
	}
	@ModelAttribute
	public void addingCommonObjets(Model model){
		model.addAttribute("headerMesage", "Employee RegistationForm");
	}
	
	@RequestMapping(value="/registration" ,method=RequestMethod.GET)
	public ModelAndView registration(@ModelAttribute("userForm") UserForm userForm,BindingResult bindingResult){
		System.out.println("Register"+userForm.getUserName());
		userValidator.validate(userForm, bindingResult);
		
		if(bindingResult.hasErrors()){
			System.out.println("BindingResult errors");
			ModelAndView model=new ModelAndView("registration");
			return model;
			//return "registration";
		}
		//System.out.println("Sudha "+userForm.getFirstName());
		userService.createUser(userForm);
		ModelAndView model=new ModelAndView("home");
		return model;
	}
	
	
}
