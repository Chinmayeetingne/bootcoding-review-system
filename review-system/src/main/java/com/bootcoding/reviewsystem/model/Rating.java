package com.bootcoding.reviewsystem.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table(name="Rating")
public class Rating {
    @Id
    @GeneratedValue
    private int ratingValue;
    private String userName;
    private int itemId;



}
