package com.example.RideIt.repository;


import com.example.RideIt.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "select * from customer where gender = :g and age >= :age", nativeQuery = true)
    List<Customer> getByGenderAndAgeGreaterThan(String g, int age);
}
