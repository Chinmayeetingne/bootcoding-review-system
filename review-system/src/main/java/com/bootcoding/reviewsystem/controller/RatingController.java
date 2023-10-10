package com.bootcoding.reviewsystem.controller;

import com.bootcoding.reviewsystem.model.Rating;
import com.bootcoding.reviewsystem.model.User;
import com.bootcoding.reviewsystem.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {

    @Autowired
    RatingService ratingService;

    @GetMapping("/rating")
    public String ratingMeasure(){
        return "I got 5 star rating";
    }

//    @PostMapping("/userRating")
//    public String giveRating(@RequestBody Rating rating){
//        return rating.giveRating(rating);
//    }
}
