package com.employee.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="EMP_USER")
public class UserBO {
	
	@Id
	/*@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="sequence")
	@SequenceGenerator(name="sequence",sequenceName="REPCAT_LOG_SEQUENCE")*/
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID", nullable=false ,length=10)
	private int id;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="CONFIRM_PASSWORD")
	private String confirmPassword;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
}
