package com.example.auth0.pojo;

import lombok.Data;

@Data
public class StaffRole {
    int id;
    String pageName;
    boolean businessOwner;
    boolean manager;
    boolean seniorStaff;
    boolean staff;
}
