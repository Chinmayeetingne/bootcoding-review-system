package com.bootcoding.reviewsystem.controller;

import com.bootcoding.reviewsystem.model.User;
import com.bootcoding.reviewsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/health/check")
    public String healthCheckup(){
        return "I am alive!";
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

}
