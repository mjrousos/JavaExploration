package com.mjrousos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.mjrousos.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	@Value("SomethingHardCoded")
	private String dbPassword;
	
//	Used for setting properties from applicationContext.xml
//	public void setDbUsername(String dbUsername) {
//		this.dbUsername = dbUsername;
//	}
//
//	public void setDbPassword(String dbPassword) {
//		this.dbPassword = dbPassword;
//	}

	/* (non-Javadoc)
	 * @see com.mjrousos.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername + ":" + dbPassword);
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstname("Mike");
		customer.setLastname("Rousos");
		
		customers.add(customer);
		
		return customers;
	}

}
