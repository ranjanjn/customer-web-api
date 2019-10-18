package com.customer.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.customer.api.domain.Mealdishes;

@FeignClient(name="meals-dishes-service")
public interface MealsServiceClient {
	
	
	
	@GetMapping("/findByquantity/{quantity}")
	public Mealdishes findByquantity(@PathVariable String quantity) ;
	
}