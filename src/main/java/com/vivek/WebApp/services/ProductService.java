package com.vivek.WebApp.services;

import com.vivek.WebApp.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(1,"HP Mouse", 900),
            new Product(2, "CMF Earbuds", 2500),
            new Product(3, "Titan Watch", 2400)
    ));

    public List<Product> getProducts(){
        return products;
    }
    public Product getProductById(int id){
        return products.stream().filter(p-> p.getId() == id)
                .findFirst()
                .get();
    }
    public void addProduct(Product product){
        products.add(product);
    }
}
