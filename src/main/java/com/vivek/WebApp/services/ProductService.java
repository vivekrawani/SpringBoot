package com.vivek.WebApp.services;

import com.vivek.WebApp.models.Product;
import com.vivek.WebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    //    List<Product> products = new ArrayList<>(Arrays.asList(new Product(1,"HP Mouse", 900),
//            new Product(2, "CMF Earbuds", 2500),
//            new Product(3, "Titan Watch", 2400)
//    ));
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
//        return products;
        return repo.findAll();
    }

    public Product getProductById(int id) {
//        return products.stream().filter(p-> p.getId() == id)
//                .findFirst()
//                .get();
        return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product product) {
//        products.add(product);
        repo.save(product);
    }

    public void updateProduct(Product product) {
//        for (Product p : products) {
//            if (p.getId() == product.getId()) {
//                products.set(products.indexOf(p), product);
//                break;
//            }
//        }
        repo.save(product);
    }

    public void deleteProduct(int id) {
//        for (Product p : products) {
//            if (p.getId() == id) {
//                products.remove(p);
//                break;
//            }
//        }
        repo.deleteById(id);
    }
}
