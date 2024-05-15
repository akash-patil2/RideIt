package com.example.RideIt.dto.request;


import com.example.RideIt.model.Cab;
import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DriverRequest {

    String name;

    String panNumber;

    int age;

    String mobNo;

    CabRequest cab;

}
