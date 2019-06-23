package com.employee.dao;

import java.util.List;

import com.employee.beans.CountryBO;

public interface IAddressDao {
	public List<CountryBO> getCountries();
}
