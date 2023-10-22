package com.example.auth0.pojo;

import lombok.Data;

@Data
public class ClientFeedback {
    int id;
    Integer client_id;
    Integer employeeId;
    Integer rating;
    String reviewText;
    String insertDate;
}
