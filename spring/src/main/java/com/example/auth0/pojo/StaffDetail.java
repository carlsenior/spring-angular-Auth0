package com.example.auth0.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class StaffDetail {

    int employee_id;
    String firstName;
    String lastName;
    String number;
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate dateOfBirth;
    String gender;
    String address;
    String emergencyContactName;
    String emergencyContactNumber;
    List<Integer> performedServices;
    int role;
    int monthlySales;
    Double commission;
    String reviews;
    String performance;
    String email;
    String employeeBio;
    List<StaffRota> staffDetailFormatted;
    String employeeImg;
    int pin;
}


