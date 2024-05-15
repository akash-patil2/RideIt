package com.example.RideIt.service;


import com.example.RideIt.dto.request.CabRequest;
import com.example.RideIt.dto.request.DriverRequest;
import com.example.RideIt.model.Cab;
import com.example.RideIt.model.Driver;
import com.example.RideIt.repository.DriverRepository;
import com.example.RideIt.transformer.CabTransformer;
import com.example.RideIt.transformer.DriverTransformer;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

//    @Autowired
//    DriverRepository driverRepository;

    // Constructor Injection

    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }


    public String addDriver(DriverRequest driverRequest) {
        CabRequest cabRequest = driverRequest.getCab();

        // driverRequest -> driver
        // cabRequest -> cab

        Driver driver = DriverTransformer.driverRequestToDriver(driverRequest);

        Cab cab = CabTransformer.cabRequestToCab(cabRequest);

        // setting up the relationship attributes
        driver.setCab(cab);
        cab.setDriver(driver);

        driverRepository.save(driver); // this should save driver & cab both cause of the Cascading
        return "Driver and Cab saved successfully";

    }
}
