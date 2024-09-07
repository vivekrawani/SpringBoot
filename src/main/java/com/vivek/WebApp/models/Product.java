package com.vivek.WebApp.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private BigInteger id;
    @Column(nullable = false)
    private String name;
    private String info;
    private String brand;
    private BigDecimal price;
    private String category;
//    @GeneratedValue(strategy = GenerationType.AUTO)

    private Date releaseDate;
    private boolean isInStock;
    private int stock;
    @PrePersist
    public void prePersist(){
        if(this.releaseDate == null){
            this.releaseDate = new Date();
        }
    }
}
