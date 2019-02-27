package com.cg.billing.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerID;
	private String firstName, lastName, emailID, dateOfBirth;
	@ElementCollection
	private List<Address> address;
	private Map<Long, PostpaidAccount> postpaidAccounts = new HashMap<>();
	
	public Customer() {}
	
	public Customer(String firstName, String lastName, String emailID, String dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.dateOfBirth = dateOfBirth;
	}

	public Customer(String firstName, String lastName, String emailID, String dateOfBirth, List<Address> address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public Customer(String firstName, String lastName, String emailID, String dateOfBirth, List<Address> address,
			Map<Long, PostpaidAccount> postpaidAccounts) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.postpaidAccounts = postpaidAccounts;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
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

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Map<Long, PostpaidAccount> getPostpaidAccounts() {
		return postpaidAccounts;
	}

	public void setPostpaidAccounts(Map<Long, PostpaidAccount> postpaidAccounts) {
		this.postpaidAccounts = postpaidAccounts;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailID=" + emailID + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", postpaidAccounts=" + postpaidAccounts + "]";
	}
	
}