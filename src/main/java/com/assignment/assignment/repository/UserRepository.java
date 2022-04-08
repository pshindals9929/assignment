package com.assignment.assignment.repository;


import com.assignment.assignment.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {


}
