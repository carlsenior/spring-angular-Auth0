package com.example.auth0.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PaymentsReportGrid {
    int id;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    LocalDateTime date;
    double amount;
    String description;
    String name;
}
