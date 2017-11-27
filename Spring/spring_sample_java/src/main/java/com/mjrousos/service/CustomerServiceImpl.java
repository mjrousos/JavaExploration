package com.mjrousos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mjrousos.model.Customer;
import com.mjrousos.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Using ctor injection");
		this.customerRepository = customerRepository;
	}
	
	// @Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Using setter injection");
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.mjrousos.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
