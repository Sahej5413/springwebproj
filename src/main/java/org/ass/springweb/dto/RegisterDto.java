package org.ass.springweb.dto;

import java.io.Serializable;

public class RegisterDto implements Serializable {
	private String name;
	private String email;
	private String contactNumber;
	private String password;
	private String pinCode;
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPincode() {
		return pinCode;
	}

	public void setPincode(String pincode) {
		this.pinCode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "RegisterDto [name=" + name + ", email=" + email + ", contactNumber=" + contactNumber + ", password="
				+ password + ", pincode=" + pinCode + ", country=" + country + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getContactNumber()=" + getContactNumber() + ", getPassword()="
				+ getPassword() + ", getPincode()=" + getPincode() + ", getCountry()=" + getCountry() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
