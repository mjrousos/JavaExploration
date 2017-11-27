package com.mjrousos.repository;

import java.util.ArrayList;
import java.util.List;

import com.mjrousos.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.mjrousos.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstname("Mike");
		customer.setLastname("Rousos");
		
		customers.add(customer);
		
		return customers;
	}

}
