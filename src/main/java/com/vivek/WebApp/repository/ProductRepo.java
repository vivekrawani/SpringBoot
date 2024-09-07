package com.vivek.WebApp.repository;

import com.vivek.WebApp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
                                                // data  primarykey
}
