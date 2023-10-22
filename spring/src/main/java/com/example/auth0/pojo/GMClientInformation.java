package com.example.auth0.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class GMClientInformation {
    int id;
    Date bookingDate;
    String bookingTime;
    String businessOwnerComment;
    boolean status;

}
