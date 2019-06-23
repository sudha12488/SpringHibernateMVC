package com.employee.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.beans.CountryBO;
import com.employee.dao.IAddressDao;

@Repository
@Transactional
public class AddressDaoImpl implements IAddressDao{
	
	@Autowired
	private SessionFactory sessionFactory=null;
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	@SuppressWarnings("unchecked")
	public List<CountryBO> getCountries() {
		List<CountryBO> countryList=null;
		try{
			Session session=sessionFactory.openSession();
			countryList=(List<CountryBO>)session.createQuery("from CountryBO").list();
		}catch(Exception e){
			System.out.println("Exception in AddressDao "+e.getMessage());
		}
		return countryList;
	}

}
