package com.meenu.restapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meenu.restapp.model.Customer;

@Service
public interface CustomerService {
	public void addCustomer(Customer cus);
	public Customer getCustomer(int id);
	public List<Customer> getAllCustomers();
	public void updateCustomer(Customer cus);
	public void deleteCustomer(int id);

}
