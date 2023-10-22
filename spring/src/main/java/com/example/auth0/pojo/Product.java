package com.example.auth0.pojo;

import lombok.Data;

@Data
public class Product {
    int id;
    String name;
    String description;
    int brandId;
    double price;
    int quantity;
    int inventoryId;
    Boolean isAvailable;
    String image;
    int reorderQuantity;
    int unitVolume;
    String unitMeasurement;
    boolean isHot;
}
