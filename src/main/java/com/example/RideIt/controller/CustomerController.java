package com.example.RideIt.controller;


import com.example.RideIt.dto.request.CustomerRequest;
import com.example.RideIt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity<String> addCustomer(@RequestBody CustomerRequest customerRequest){
        String response = customerService.addCustomer(customerRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}