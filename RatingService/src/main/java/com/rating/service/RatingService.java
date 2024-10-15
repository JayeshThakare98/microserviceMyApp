package com.rating.service;

import java.util.List;

import com.rating.entity.Rating;

public interface RatingService {

    //create
    Rating create(Rating rating);


    //get all ratings
    List<Rating> getRatings();

    //get all by UserId
    List<Rating> getRatingByUserId(Integer userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(Integer hotelId);




}