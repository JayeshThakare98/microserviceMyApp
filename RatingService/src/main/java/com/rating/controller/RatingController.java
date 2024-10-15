package com.rating.controller;

import com.rating.entity.Rating;
import com.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping("/creatrating")
    public ResponseEntity<Rating> genrationOfRatint(@RequestBody Rating rating){
        Rating rating1 = ratingService.create(rating);
//        return  new ResponseEntity<>(rating1, HttpStatus.CREATED);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);

    }
    @GetMapping("/getAllRating")
    public ResponseEntity<List<Rating>> fetchAllRating(){
        List<Rating> ratingList = ratingService.getRatings();
        return new ResponseEntity<>(ratingList,HttpStatus.FOUND);
    }
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable Integer userId) {
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable Integer hotelId) {
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }

}
