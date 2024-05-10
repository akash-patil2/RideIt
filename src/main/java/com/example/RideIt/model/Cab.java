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


public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String company;

    String carModel;

    @Enumerated(EnumType.STRING)
    CarType carType;

    int numberofSeats;

    double farePerKm;

    @OneToOne
    @JoinColumn
    Driver driver;
}
