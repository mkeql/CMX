package com.au.cmx.api.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/customer/{id}")  
	public String customer(@PathVariable String id) {
		return "CUSTOMER ID :" + id;
	}
	
}
