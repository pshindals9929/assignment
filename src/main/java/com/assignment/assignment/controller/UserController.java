package com.assignment.assignment.controller;

import com.assignment.assignment.Model.UserEntity;
import com.assignment.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user){
        return userService.createUser(user);

    }
}
