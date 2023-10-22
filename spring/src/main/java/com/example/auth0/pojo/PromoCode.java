package com.example.auth0.pojo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PromoCode {
    int promotionId;
    boolean activePromo;
    String promotionName;
    String promotionCode;
    Double discountApplied;
    int maxCodeUsers;
    LocalDate startDate;
    LocalDate endDate;
    boolean voucherUsed;
    int codesUsed;
}
