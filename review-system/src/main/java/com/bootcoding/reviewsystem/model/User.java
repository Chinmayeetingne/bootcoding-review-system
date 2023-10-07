package com.bootcoding.reviewsystem.model;

import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table(name="review_user")
public class User {

    private String username;
    private String EmailId;
    private long phone;
}
