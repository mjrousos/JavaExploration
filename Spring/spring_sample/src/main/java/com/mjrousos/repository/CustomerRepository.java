package com.mjrousos.repository;

import java.util.List;

import com.mjrousos.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}