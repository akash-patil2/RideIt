package com.example.RideIt.transformer;


import com.example.RideIt.dto.request.CabRequest;
import com.example.RideIt.dto.response.CabResponse;
import com.example.RideIt.model.Cab;

public class CabTransformer {

    public static Cab cabRequestToCab(CabRequest cabRequest){

        return Cab.builder()
                .cabNo(cabRequest.getCabNo())
                .carModel(cabRequest.getCarModel())
                .farePerKm(cabRequest.getFarePerKm())
                .numberOfSeats(cabRequest.getNumberOfSeats())
                .carType(cabRequest.getCarType())
                .available(true)
                .build();
    }


    public static CabResponse cabToCabResponse(Cab cab){
        return CabResponse.builder()
                .cabNo(cab.getCabNo())
                .carModel(cab.getCarModel())
                .farePerKm(cab.getFarePerKm())
                .build();
    }

}
