package com.employee.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.beans.CountryBO;
import com.employee.dao.IAddressDao;
import com.employee.service.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService {

	@Autowired
	IAddressDao addressDao;
	public List<CountryBO> getCountries() {
		return addressDao.getCountries();
	}

}
