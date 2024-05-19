package com.example.RideIt.exception;


public class CabNotAvailableException extends RuntimeException{

    public CabNotAvailableException(String message){
        super(message);
    }
}
