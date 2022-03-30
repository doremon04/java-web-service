package cus.entity;

import java.util.Date;

public class Customer {
	private String cusId;
	private String cusName;
	private Boolean gender;
	private Date birthday;
	private String address;
	private String email;
	private String telephone;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String cusId, String cusName, Boolean gender, Date birthday, String address, String email,
			String telephone) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.email = email;
		this.telephone = telephone;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
