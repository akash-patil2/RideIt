package com.example.RideIt.transformer;


import com.example.RideIt.dto.request.DriverRequest;
import com.example.RideIt.dto.response.DriverResponse;
import com.example.RideIt.model.Driver;

public class DriverTransformer {

    public static Driver driverRequestToDriver(DriverRequest driverRequest){
        return Driver.builder()
                .name(driverRequest.getName())
                .age(driverRequest.getAge())
                .mobNo(driverRequest.getMobNo())
                .rating(0)
                .panNumber(driverRequest.getPanNumber())
                .build();
    }


    public static DriverResponse driverToDriverResponse(Driver driver) {
        return DriverResponse.builder()
                .name(driver.getName())
                .rating(driver.getRating())
                .mobNo(driver.getMobNo())
                .cabResponse(CabTransformer.cabToCabResponse(driver.getCab()))
                .build();
    }
}
