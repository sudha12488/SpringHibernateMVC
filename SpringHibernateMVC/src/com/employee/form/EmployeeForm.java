package com.employee.form;

import java.util.List;

import com.employee.beans.CountryBO;

public class EmployeeForm {
	private String employeeName; 
	private float salary;
	private String designation;
	private long mobileNo;
	private String email;
	private String gender;
	private List<CountryBO> country;
	//private Date joiningDate;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<CountryBO> getCountry() {
		return country;
	}
	public void setCountry(List<CountryBO> country) {
		this.country = country;
	}
	
	/*public Date getJoiningDate() {
	 * 
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}*/

}
