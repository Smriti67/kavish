package com.cg.billing.daoservices;

import java.util.List;

import com.cg.billing.beans.Customer;

public interface CustomerDAO {

	public Customer save(Customer customer);
	public Customer find(int customerID); 
	public List<Customer> findAll();
	public boolean remove(int customerID);
}
