package com.example.auth0.pojo.reports;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesComparisonMetrics {
    private double productSalesPercentageChange;
    private double serviceSalesPercentageChange;
    private double totalSalesPercentageChange;
}
