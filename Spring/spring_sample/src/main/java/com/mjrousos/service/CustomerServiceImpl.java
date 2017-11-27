package com.mjrousos.service;

import java.util.List;

import com.mjrousos.model.Customer;
import com.mjrousos.repository.CustomerRepository;
import com.mjrousos.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.mjrousos.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
