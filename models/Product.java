package com.ecommerce.project.models;

import java.util.HashSet;
import java.util.Set;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")
public class Product {
    @Id
    private String productId;

    private String name;
    private String description;
    private Integer price;
    private Integer Nprice;
    private Integer countInStock;
    private String catagory;
    private String imageUrl;

}