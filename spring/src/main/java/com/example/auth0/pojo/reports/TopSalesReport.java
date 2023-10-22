package com.example.auth0.pojo.reports;

import lombok.Data;

@Data
public class TopSalesReport {
    Integer id;
    String date;
    String name;
    Integer quantity;
    Float value;
    String transactionName;
}
