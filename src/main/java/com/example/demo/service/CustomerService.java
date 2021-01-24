package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.model.Province;

import java.util.Optional;


public interface CustomerService {
     Iterable<Customer> findAll();
     Optional<Customer> findById(Long id);
     void save(Customer customer);
     void remove(Long id);

    Iterable<Customer> findAllByProvince(Optional<Province> province);
}
