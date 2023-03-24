package com.microservices.hotel.controller;

import com.microservices.hotel.entity.Hotel;
import com.microservices.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //create hotels
    @PostMapping
    public ResponseEntity<Hotel> createHotels(@RequestBody Hotel hotel){
        ;
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }

    //get all
    @GetMapping
    public ResponseEntity<List<Hotel>> createHotels(){
        return ResponseEntity.status(HttpStatus.FOUND).body(hotelService.getAll());
    }

    //get by id
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> createHotels(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.FOUND).body(hotelService.findById(hotelId));
    }
}
