    package com.example.auth0.pojo.reports;

    import lombok.Data;

    import java.util.List;

    @Data
    public class TotalSales {
        private Float totalSaleValue;
        private Double leastSale;
        private Double mostSale;
        private Double averageSale;
        private Double averageClientSale;
        private double productSalesPercentageChange;
        private double serviceSalesPercentageChange;
        private double totalSalesPercentageChange;
        private List<TopSalesReport> saleData;
    }
