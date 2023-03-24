package com.microservices.hotel.service;

import com.microservices.hotel.entity.Hotel;
import com.microservices.hotel.repositories.HotelRepository;

import java.util.List;

public interface HotelService {

    //create
    Hotel create (Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get by id
    Hotel findById(String hotelId);
}
