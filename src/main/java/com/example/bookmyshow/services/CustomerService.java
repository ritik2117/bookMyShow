package com.example.bookmyshow.services;

import com.example.bookmyshow.models.Customer;
import com.example.bookmyshow.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class CustomerService {
    CustomerRepository customerRepository;
    public Customer signup(String name, String email, String password) {
        System.out.println("Service layer called for creating customer.");

//        BCryptPasswordEncoder()
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setBookings(new ArrayList<>());
//        Call the repository layer and try to save that to DB.
        customerRepository.save(customer);
        return customer;
    }
}
