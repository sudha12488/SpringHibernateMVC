package com.employee.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_COUNTRY")
public class CountryBO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="country_id", nullable=false ,length=10)
	private int countryId;
	
	@Column(name="country_name")
	private String countryName;

	public int getCountryId() {
		return countryId;
	}

	public void setCountry_id(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
}
