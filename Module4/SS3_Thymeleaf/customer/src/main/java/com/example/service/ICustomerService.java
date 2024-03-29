package com.example.service;

import com.example.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findall();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);

}
