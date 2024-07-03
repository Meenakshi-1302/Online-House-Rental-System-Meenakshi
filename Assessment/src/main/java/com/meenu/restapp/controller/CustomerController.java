package com.meenu.restapp.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meenu.restapp.model.Customer;
import com.meenu.restapp.serviceimpl.CustomerServiceImpl;

@RestController
@RequestMapping("/Customer")
@CrossOrigin("*")
public class CustomerController {
	
	CustomerServiceImpl cservice;
	
	
	public CustomerController(CustomerServiceImpl cservice) {
		super();
		this.cservice = cservice;
	}
	static final String SUCCESS = "Success";
	static final String FAILURE = "failure";
	
	@PostMapping
	public String insertCustomer(@RequestBody Customer cus) {
		String msg ="";
		try {
			cservice.addCustomer(cus);
			msg=SUCCESS;
		}
		catch(Exception e) {
			
			msg=FAILURE;
		}
		return msg;
	}
	@GetMapping("{id}")
	public Customer getCustomerById(@PathVariable("id") int id) {
		return cservice.getCustomer(id);
		
	}
	@GetMapping("/all")
	public List<Customer> getCustomers(){
		return cservice.getAllCustomers();
		
	}
	
	@PutMapping
	public String updateCustomer(@RequestBody Customer cus) {
		String msg="";
		try {
			cservice.updateCustomer(cus);
			msg=SUCCESS;
		}
		catch(Exception e) {
			
			msg=FAILURE;
		}
		return msg;
	}
	@DeleteMapping("{id}")
	public String deleteCustomer(@PathVariable("id") int id) {
		String msg="";
		try {
			cservice.deleteCustomer(id);
			msg=SUCCESS;
		}
		catch(Exception e) {
			
			msg=FAILURE;
		}
		return msg;
		
	}
	

}
