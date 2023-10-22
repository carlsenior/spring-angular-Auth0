package com.example.auth0.pojo;

import lombok.Data;

@Data
public class CustomerServices {

    int id;
    String serviceName;
    String serviceDescription;
    double servicePrice;
    int serviceDuration;
    int categoryId;
    String categoryName;
    int colourId;
    Boolean active;
}
