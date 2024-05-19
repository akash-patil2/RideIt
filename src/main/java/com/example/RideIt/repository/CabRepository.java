package com.example.RideIt.repository;


import com.example.RideIt.model.Cab;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CabRepository extends JpaRepository<Cab, Integer> {

         @Query(value = "select * from cab where available = true order by rand() limit 1", nativeQuery = true)
        Cab getRandomAvailableCab();

}
