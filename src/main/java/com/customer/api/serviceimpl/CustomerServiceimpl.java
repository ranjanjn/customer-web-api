package com.customer.api.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.api.domain.Customer;
import com.customer.api.repository.CustomerRepository;
import com.customer.api.service.CustomerService;

@Service
public class CustomerServiceimpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void createCustomer(Customer customer) {
		customerRepository.save(customer);
	
		
	}

	@Override
	public void findCustomerById(String customerId) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public List<Customer> findAllCustomers() {
		List<Customer>customerList=new ArrayList<>();
		customerList=customerRepository.findAll();
		
		return customerList;
	}

	@Override
	public Customer findByfirstName(String firstName) {
		Customer customer = new Customer();
		customer=customerRepository.findByfirstName(firstName);
		return customer;
	}

}
