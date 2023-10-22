package com.example.auth0.pojo.reports;

import lombok.Data;

@Data
public class LossBreakdown {
    String date;
    Integer noShowsTotal;
    Double noShowsCost;
}
