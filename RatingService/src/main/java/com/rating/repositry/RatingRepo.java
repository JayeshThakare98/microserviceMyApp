package com.rating.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.entity.Rating;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepo extends JpaRepository<Rating,Integer>
{
    //custom finder methods
    List<Rating> findByUserId(Integer userId);
    List<Rating> findByHotelId(Integer hotelId);

}