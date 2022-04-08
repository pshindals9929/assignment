package com.assignment.assignment.controller;

import com.assignment.assignment.Model.Product;
import com.assignment.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping(value = "/")
    public Product getAllProducts(@RequestHeader Integer id) throws Exception {
        return productService.getProductById(id);
    }

    @PostMapping(value = "/create")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);

    }

    @PutMapping(value = "/")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);

    }

    @DeleteMapping(value = "/")
    public void deleteProduct(@RequestHeader Integer productId){
        productService.deleteProduct( productId);

    }


    @PutMapping("/activate")
    public Product activateProduct(@RequestHeader Integer productId) throws Exception {
       return  productService.activateProduct(productId);

    }

    @PutMapping("/inActivate")
    public Product inActivateProduct(@RequestHeader Integer productId) throws Exception {
        return  productService.inActivateProduct(productId);
    }


    @GetMapping(value = "/customer")
    public List<Product> getAllProductsForCustomer(){
        return productService.getAllProductsForCustomer();
    }

}
