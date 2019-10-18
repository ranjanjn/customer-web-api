package com.customer.api.domain;

public class CustomerModel {
	
	private Mealdishes mealdishes;
	private Customer customer;
	
	public CustomerModel() {
		
	}

	public CustomerModel(Mealdishes mealdishes, Customer customer) {
		super();
		this.mealdishes = mealdishes;
		this.customer = customer;
	}

	public Mealdishes getMealdishes() {
		return mealdishes;
	}

	public void setMealdishes(Mealdishes mealdishes) {
		this.mealdishes = mealdishes;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	

  

}
