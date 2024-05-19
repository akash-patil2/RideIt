package com.example.RideIt.repository;


import com.example.RideIt.model.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripBookingRepository extends JpaRepository<TripBooking, Integer> {

}
