package com.example.RideIt.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    String panNumber;

    int age;

    @Column(unique = true, nullable = false)
    String mobNo;

    double rating;

    @OneToOne(mappedBy = "driver", cascade = CascadeType.ALL)
    Cab cab;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    List<TripBooking> bookings = new ArrayList<>();

}
