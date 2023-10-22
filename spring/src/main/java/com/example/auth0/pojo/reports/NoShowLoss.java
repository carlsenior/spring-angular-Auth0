package com.example.auth0.pojo.reports;

import lombok.Data;

import java.util.List;

@Data
public class NoShowLoss {
    Double lossTotal;
    List<LossBreakdown> lossData;

}
