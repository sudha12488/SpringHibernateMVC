package com.employee.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_address")
public class AddressBO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ADDRESS_ID", nullable=false ,length=10)
	private int address_id;
	
	@Column(name="house_no")
	private String houseNo;
	
	@Column(name="street_name")
	private String streeetName;
	
	@Column(name="city")
	private String city;
	
	@Column(name="Country")
	private String country;
	
	@Column(name="postal_code")
	private int postalCode;

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreeetName() {
		return streeetName;
	}

	public void setStreeetName(String streeetName) {
		this.streeetName = streeetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
}
