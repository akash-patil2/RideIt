package com.example.RideIt.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class TripBookingRequest {

    String pickup;

    String destination;

    double tripDistanceInKm;

    String customerEmailId;
}
