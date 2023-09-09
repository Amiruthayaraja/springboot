package com.ecommerce.project.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "carts")
public class Cart {
    @Id
    private String objectId;

    @DBRef
    private User user;

    @DBRef
    private Product product;

    private String count;

}
