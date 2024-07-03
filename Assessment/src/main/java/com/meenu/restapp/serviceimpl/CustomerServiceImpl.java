package com.meenu.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.meenu.restapp.model.Customer;
import com.meenu.restapp.repository.CustomerRepo;
import com.meenu.restapp.service.CustomerService;



@Service
public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepo crepo;
	

	public CustomerServiceImpl(CustomerRepo crepo) {
		super();
		this.crepo = crepo;
	}

	@Override
	public void addCustomer(Customer cus) {
		
		crepo.save(cus);
		
	}

	@Override
	public Customer getCustomer(int id) {
		
		Optional<Customer> ModelOptional = crepo.findById(id);
	    return (Customer) ModelOptional.orElse(null);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return crepo.findAll();
	}

	@Override
	public void updateCustomer(Customer cus) {
	
		crepo.save(cus);
		
	}

	@Override
	public void deleteCustomer(int id) {
		
		crepo.deleteById(id);
		
	}
	

}
