package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employee.beans.CountryBO;
import com.employee.beans.EmployeeBO;
import com.employee.form.EmployeeForm;
import com.employee.service.IAddressService;
import com.employee.service.IEmployeeService;
import com.employee.validation.EmployeeValidator;

@Controller
public class EmployeeController {
    @Autowired(required=true)
	IEmployeeService employeeService;
    @Autowired
    EmployeeValidator employeeValidator;
    @Autowired
    IAddressService addressService;
    
    @RequestMapping("/loadEmployee")
	public ModelAndView loadEmployee(){
    	System.out.println("Load Employee");
    	List<CountryBO> countryList=addressService.getCountries();
    	System.out.println("countryList "+countryList);
    	EmployeeForm employeeForm=new EmployeeForm();
    	employeeForm.setCountry(countryList);
		return new ModelAndView("createEmployee","employeeForm",employeeForm);
    }
	@RequestMapping(value="/createEmployee",method = RequestMethod.GET)
	public ModelAndView createEmployee(@ModelAttribute("employeeForm") EmployeeForm employeeForm,BindingResult result){
		System.out.println("Create Employee");
		employeeValidator.validate(employeeForm, result);
		ModelAndView model=new ModelAndView();
		if(result.hasErrors()){
			System.out.println("BindingResult errors");
			model.addObject("createEmployee");
			return model;
		}else{
			employeeService.createEmployee(employeeForm);
			String message="Employee Created Successfully";
			return new ModelAndView("success","message",message);
			
		}
	}
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){
		List<EmployeeBO> list=employeeService.getEmployees();
		return new ModelAndView("viewemp","list",list);
	}
	@RequestMapping(value="/editEmployee/{id}")
	public ModelAndView edit(@PathVariable int id){
		System.out.println("update employee");
		EmployeeBO emp=employeeService.getEmpById(id);
		return new ModelAndView("updateEmployee","command",emp);
	}
	@RequestMapping(value="/updateEmployee",method = RequestMethod.GET)
	public ModelAndView editsave(@ModelAttribute("employeeForm") EmployeeForm employeeForm){
		System.out.println("UpdateEmployee1");
		employeeService.update(employeeForm);
		return new ModelAndView("redirect:/viewemp");
	}
	@RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		employeeService.delete(id);
		return new ModelAndView("redirect:/viewemp");
	}
}