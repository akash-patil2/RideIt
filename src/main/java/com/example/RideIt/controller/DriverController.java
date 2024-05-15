package com.example.RideIt.controller;


import com.example.RideIt.dto.request.DriverRequest;
import com.example.RideIt.service.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/driver")
public class DriverController {

//    @Autowired
//    DriverService driverService; // field injection

    // Constructor Injection

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }


    @PostMapping
    public ResponseEntity <String> addDriver(@RequestBody DriverRequest driverRequest){

        String response = driverService.addDriver(driverRequest);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
