package com.example.RideIt.service;


import com.example.RideIt.dto.request.CustomerRequest;
import com.example.RideIt.dto.response.CustomerResponse;
import com.example.RideIt.model.Customer;
import com.example.RideIt.repository.CustomerRepository;
import com.example.RideIt.transformer.CustomerTransformer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

//    @Autowired
//    CustomerRepository customerRepository;

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public CustomerResponse addCustomer(CustomerRequest customerRequest) {



        Customer customer = CustomerTransformer.customerRequestToCustomer(customerRequest);

        Customer savedCustomer = customerRepository.save(customer);

       // entity -> ResponseDTO

       return CustomerTransformer.customerToCustomerResponse(savedCustomer);
    }

    public List<CustomerResponse> getCustomerByGenderAndAgeGreaterThan(String gender, int age) {

        List<Customer> customers = customerRepository.getByGenderAndAgeGreaterThan(gender, age);

        List<CustomerResponse> customerResponses = new ArrayList<>();
        for(Customer customer: customers){
            customerResponses.add(CustomerTransformer.customerToCustomerResponse(customer));
        }

        return customerResponses;
    }
}
