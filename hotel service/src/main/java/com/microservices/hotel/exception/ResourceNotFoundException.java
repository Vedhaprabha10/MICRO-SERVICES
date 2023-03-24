package com.microservices.hotel.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String re) {
        super("Resource not found");
    }
}
