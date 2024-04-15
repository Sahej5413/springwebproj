package org.ass.springweb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "register_details")
public class Register implements Serializable {
	@Id
	@GenericGenerator(name = "reg_auto", strategy = "increment")
	@GeneratedValue(generator = "reg_auto")
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;

	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", email=" + email + ", contactNumber=" + contactNumber
				+ ", password=" + password + ", pinCode=" + pinCode + ", country=" + country + "]";
	}

	@Column(name = "contact")
	private String contactNumber;
	@Column(name = "password")
	private String password;
	@Column(name = "pincode")
	private String pinCode;
	@Column(name = "country")
	private String country;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
