package com.vivek.WebApp.controllers;

import com.vivek.WebApp.models.Product;
import com.vivek.WebApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/product")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/product/{id}")
    public Product getProducts(@PathVariable int id){
        return service.getProductById(id);
    }
    @PostMapping("/product")
    public String addProduct(@RequestBody Product product){
        service.addProduct(product);
        return "Product added";
    }

}
