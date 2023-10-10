package com.bootcoding.reviewsystem.service;

import com.bootcoding.reviewsystem.model.Rating;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
    public String giveRating(Rating rating) {
        print(rating);
        return "RATING SUCCESSFUL";
    }

    public void print(Rating rating){
        System.out.println(rating.getRatingValue());
        System.out.println(rating.getUserName());
        System.out.println(rating.getItemId());

    }
}

