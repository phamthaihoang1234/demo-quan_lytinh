package com.example.demo.repository;

import com.example.demo.model.Customer;
import com.example.demo.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends PagingAndSortingRepository <Customer,Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
