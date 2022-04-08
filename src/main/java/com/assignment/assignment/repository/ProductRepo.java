package com.assignment.assignment.repository;

import com.assignment.assignment.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {


    @Query("SELECT DISTINCT p FROM PRODUCT p  WHERE p.isVisible = true")
    List<Product> findAllProductsAndIsVisibleTrue();
}
