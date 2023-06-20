package com.edutyback.edutybackend.controller;

import com.edutyback.edutybackend.model.User;
import com.edutyback.edutybackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5174")
public class UserController {
    @Autowired
    private UserRepository UserRepository;

    @PostMapping("/edutyuser")
    User newUser(@RequestBody User newUser){
        return UserRepository.save(newUser);
    }

    @GetMapping("/edutyuser")
    List<User> getAllUsers(){
        return UserRepository.findAll();
    }
}
