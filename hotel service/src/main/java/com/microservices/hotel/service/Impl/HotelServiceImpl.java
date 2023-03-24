package com.microservices.hotel.service.Impl;

import com.microservices.hotel.entity.Hotel;
import com.microservices.hotel.exception.ResourceNotFoundException;
import com.microservices.hotel.repositories.HotelRepository;
import com.microservices.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        String randamId = UUID.randomUUID().toString();
        hotel.setHotelId(randamId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel findById(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("User given id is not found in server "+hotelId));
    }
}
