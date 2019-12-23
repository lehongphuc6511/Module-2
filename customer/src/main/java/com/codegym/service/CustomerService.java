package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CustomerService{

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer model);

    void remove(Long id);
}

