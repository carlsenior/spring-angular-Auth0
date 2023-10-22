package com.example.auth0.pojo.reports;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesData {
    private String date;
    private double productSales;
    private double serviceSales;
    private double totalSales;
}
