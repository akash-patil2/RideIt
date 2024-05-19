package com.example.RideIt.dto.response;


import com.example.RideIt.Enum.TripStatus;
import com.example.RideIt.model.Customer;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class TripBookingResponse {

    String bookingId;

    String pickup;

    String destination;

    double tripDistanceInKm;

    double totalFare;

    TripStatus tripStatus;

    Date bookedAt;

    CustomerResponse customerResponse;

    DriverResponse driverResponse;

}
