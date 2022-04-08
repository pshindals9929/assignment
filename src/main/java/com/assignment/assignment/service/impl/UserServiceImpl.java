package com.assignment.assignment.service.impl;

import com.assignment.assignment.Model.UserEntity;
import com.assignment.assignment.repository.UserRepository;
import com.assignment.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }
}
