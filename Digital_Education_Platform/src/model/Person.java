/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import helper.Helper;
import java.util.Date;

/**
 *
 * @author drag
 */
public class Person {
	private String uuid;
	private String firstName;
	private String lastName;
	private String email;
	private String addressLine1;
	private String addressLine2;
	private String phone;
	private String createdOn;

	public Person(String firstName, String lastName, String email, String addressLine1, String addressLine2, String phone) {
		this.uuid = Helper.generateUUID();
		this.createdOn = Helper.generateTimeStamp();

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.phone = phone;
	}

	

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Person{"
		    + "firstName='" + firstName + '\''
		    + ", lastName='" + lastName + '\''
		    + ", email='" + email + '\''
		    + ", addressLine1='" + addressLine1 + '\''
		    + ", addressLine2='" + addressLine2 + '\''
		    + ", phone='" + phone + '\''
		    + ", createdOn='" + createdOn + '\''
		    + '}';
	}


	
}
