package com.noltek.services.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Getter
@Setter
public class Product {
    @Id
    private String id;
    @Indexed
    private String name;
    @Indexed
    private double price;
    @Indexed
    private byte[] image;
}
