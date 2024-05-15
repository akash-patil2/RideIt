package com.example.RideIt.dto.request;


import com.example.RideIt.Enum.CarType;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CabRequest {

    String company;

    String carModel;

    String cabNo;

    CarType carType;

    int numberOfSeats;

    double farePerKm;
}
