package com.mjrousos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.mjrousos.model.Customer;

@Repository(ConfigurableBeanFactory.SCOPE_SINGLETON)
// @Scope("singleton")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	/* (non-Javadoc)
	 * @see com.mjrousos.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println("User name: " + this.dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstname("Mike");
		customer.setLastname("Rousos");
		
		customers.add(customer);
		
		return customers;
	}

}
