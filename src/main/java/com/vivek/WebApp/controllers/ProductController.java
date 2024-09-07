package com.vivek.WebApp.controllers;

import com.vivek.WebApp.models.Product;
import com.vivek.WebApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/product")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/product/{id}")
    public Product getProducts(@PathVariable int id){
        return service.getProductById(id); //orElse(new Product());
    }
    @PostMapping("/product")
    public String addProduct(@RequestBody Product product){
        service.addProduct(product);
        System.out.println(product);
        return "Product added";
    }
    @PutMapping ("/product")
    public String updateProduct(@RequestBody Product product){
        service.updateProduct(product);
        return "Product updated";
    }
    @DeleteMapping("/product/{id}")
    public String delete(@PathVariable int id){
        service.deleteProduct(id);
        return "Product removed";
    }


}
