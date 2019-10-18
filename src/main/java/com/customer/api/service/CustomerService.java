package com.customer.api.service;



import java.util.List;

import com.customer.api.domain.Customer;

public interface CustomerService {
	
	public void createCustomer(Customer customer);
	
	public void findCustomerById(String customerId);
	
	public List<Customer>findAllCustomers();
	
	public Customer findByfirstName(String firstName);
		
	

}
