package com.example.RideIt.service;


import com.example.RideIt.dto.request.CustomerRequest;
import com.example.RideIt.model.Customer;
import com.example.RideIt.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public String addCustomer(CustomerRequest customerRequest) {

        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setAge(customerRequest.getAge());
        customer.setEmailId(customerRequest.getEmailId());
        customer.setAddress(customerRequest.getAddress());
        customer.setGender(customerRequest.getGender());

        Customer savedCustomer = customerRepository.save(customer);
        return "Customer saved successfully!";
    }
}
