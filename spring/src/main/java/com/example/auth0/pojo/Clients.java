package com.example.auth0.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Clients {
    int UserGMID;
    String givenName;
    String familyName;
    String email;
    String phoneLandline;
    String phoneMobile;
    Boolean isApp;
    String address;
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate dateOfBirth;
    String gender;
    Double outstandingBalance;
}
