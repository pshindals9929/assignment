package com.assignment.assignment.service.impl;

import com.assignment.assignment.Model.Product;
import com.assignment.assignment.repository.ProductRepo;
import com.assignment.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public void deleteProduct(Integer productId) {
        productRepo.deleteById(productId);
    }

    @Override
    public Product getProductById(Integer id) throws Exception {
        Optional<Product> product =productRepo.findById(id);
        if(product.isPresent()){
            return product.get();
        }else {
            throw new Exception("Product not found");
        }
    }

    @Override
    public Product activateProduct(Integer productId) throws Exception {
        Optional<Product> product =productRepo.findById(productId);
        if(product.isPresent()){
        Product productEntity  = product.get();
        productEntity.setVisible(true);
            productRepo.save(productEntity);


            return productEntity;
        }else {
            throw new Exception("Product not found");
        }
    }


    @Override
    public Product inActivateProduct(Integer productId) throws Exception {
        Optional<Product> product =productRepo.findById(productId);
        if(product.isPresent()){
            Product productEntity  = product.get();
            productEntity.setVisible(false);
            productRepo.save(productEntity);


            return productEntity;
        }else {
            throw new Exception("Product not found");
        }
    }

    @Override
    public List<Product> getAllProductsForCustomer() {
        return productRepo.findAllProductsAndIsVisibleTrue();
    }


}
