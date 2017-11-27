package com.mjrousos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjrousos.model.Customer;
import com.mjrousos.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	// @Autowired
	private CustomerRepository customerRepository;

	@Autowired
	public CustomerServiceImpl(CustomerRepository foo) {
		System.out.println("Ctor injection!");
		this.customerRepository = foo;
	}

	
	// @Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter injection!");
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
