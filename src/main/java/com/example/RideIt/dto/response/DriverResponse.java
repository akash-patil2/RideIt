package com.example.RideIt.dto.response;


import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class DriverResponse {

    String name;

    String mobNo;

    double rating;

    CabResponse cabResponse;
}
