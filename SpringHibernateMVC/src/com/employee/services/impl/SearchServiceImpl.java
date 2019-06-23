package com.employee.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.ISearchDao;
import com.employee.form.EmployeeForm;
import com.employee.service.ISearchService;

@Service
public class SearchServiceImpl implements ISearchService{
	@Autowired
	ISearchDao searchDao;
	public EmployeeForm searchEmployee(String employeeName) {
		return searchDao.searchEmployee(employeeName);
	}

}
