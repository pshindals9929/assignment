package com.assignment.assignment.service;

import com.assignment.assignment.Model.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getAllUsers();

    UserEntity createUser(UserEntity user);
}
