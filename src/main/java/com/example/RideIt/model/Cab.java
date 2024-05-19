package com.example.RideIt.model;


import com.example.RideIt.Enum.CarType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String company;

    @Column(unique = true, nullable = false)
    String cabNo;

    String carModel;

    boolean available;

    @Enumerated(EnumType.STRING)
    CarType carType;

    int numberOfSeats;

    double farePerKm;

    @OneToOne
    @JoinColumn
    Driver driver;
}
