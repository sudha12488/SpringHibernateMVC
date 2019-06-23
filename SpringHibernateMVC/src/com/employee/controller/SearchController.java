package com.employee.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employee.beans.EmployeeBO;
import com.employee.form.EmployeeForm;
import com.employee.service.ISearchService;

@Controller
public class SearchController {
	@Autowired
	ISearchService searchService;
	
	@RequestMapping("loadSearch")
	public ModelAndView search(){
		return new ModelAndView("search","searchForm",new EmployeeForm());
	}
	@RequestMapping(value="/search",method=RequestMethod.GET )
	public ModelAndView searchEmployeeByName(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
		System.out.println("Search Employee");
		String employeeName =httpServletRequest.getParameter("employeeName");
		EmployeeForm employeeForm=searchService.searchEmployee(employeeName);
		if(employeeForm==null){
			String message="Employee "+employeeName+" Not Found";
			return new ModelAndView("error","message",message);
		}else{
			return new ModelAndView("viewEmployee","employeeForm",employeeForm);
		}
	}
}
