package com.bootcoding.reviewsystem.service;


import com.bootcoding.reviewsystem.model.User;
import com.bootcoding.reviewsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public String createUser(User user) {
      print(user);
      userRepository.save(user);
      return "SUCCESSFULLY USER CREATED";
    }
    public void print(User user){
        System.out.println(user.getUsername());
        System.out.println(user.getEmailId());
        System.out.println(user.getPhone());
    }
}
