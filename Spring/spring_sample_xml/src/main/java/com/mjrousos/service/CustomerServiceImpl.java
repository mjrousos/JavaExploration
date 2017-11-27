package com.mjrousos.service;

import java.util.List;

import com.mjrousos.model.Customer;
import com.mjrousos.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
