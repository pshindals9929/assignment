package com.assignment.assignment.service;

import com.assignment.assignment.Model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product createProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Integer productId);

    Product getProductById(Integer id) throws Exception;

    Product activateProduct(Integer productId) throws Exception;

    Product inActivateProduct(Integer productId) throws Exception;

    List<Product> getAllProductsForCustomer();
}

