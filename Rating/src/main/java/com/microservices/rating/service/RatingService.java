package com.microservices.rating.service;

import com.microservices.rating.entity.Rating;

import java.util.List;

public interface RatingService {

     //create
    Rating create(Rating rating);

    //get all rating
    List<Rating> getRating();

    //get all by userId
    List<Rating> getRatingByUserId(String userId);

    //get all by hotelId
    List<Rating> getRatingByHotelId(String hotelId);
}
