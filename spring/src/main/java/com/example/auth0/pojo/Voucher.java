package com.example.auth0.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Voucher {
    @JsonProperty("voucherId")
    int voucher_id;
    @JsonProperty("uniqueVoucherCode")
    long voucher_code;
    @JsonProperty("initialBalance")
    BigDecimal initial_balance;
    @JsonProperty("remainingBalance")
    BigDecimal remaining_balance;
    @JsonProperty("clientEmail")
    String client_email;
    @JsonProperty("clientFirstName")
    String client_first_name;
    @JsonProperty("clientSurname")
    String client_surname;
    @JsonProperty("stripeId")
    String stripe_id;
    @JsonProperty("description")
    String description;
    @JsonProperty("emailTo")
    String email_to;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("expire")
    Date expire;
    @JsonProperty("isUsed")
    Boolean is_used;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("dateCreated")
    Date date_created;
}
