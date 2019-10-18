package com.customer.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.api.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
	   
	
	
	public Customer findByfirstName(String firstName);

}
