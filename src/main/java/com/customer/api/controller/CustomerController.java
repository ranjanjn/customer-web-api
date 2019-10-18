package com.customer.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.api.domain.Customer;
import com.customer.api.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/create")
	public void createCustomer(@RequestBody Customer customer){
		customerService.createCustomer(customer);
		
	}
	
	@GetMapping("/findByfirstName/{firstName}")
	public Customer findByfirstName(@PathVariable String firstName) {
		return customerService.findByfirstName(firstName);
		
	}
	
	@GetMapping("/findAll")
	public List<Customer>findAllCustomers(){
		List<Customer>customerList=customerService.findAllCustomers();
		return customerList;
	}
	


	}
	

	


