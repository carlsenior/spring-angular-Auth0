package com.example.auth0.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.OffsetDateTime;


@Data
public class Bookings {

    int clientId;
    String description;
    @JsonSerialize(using = CustomOffsetDateTimeSerializer.class) // Use the custom serializer
    OffsetDateTime endTime;
    @JsonSerialize(using = CustomOffsetDateTimeSerializer.class) // Use the custom serializer
    OffsetDateTime startTime;
    String eventType;
    int id;
    boolean isAllDay;
    String customer;
    String service;
    int employeeId;
    boolean isCancelled;
    int serviceId;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    boolean isPending;
    Boolean isApp;
    String paymentReceipt;
    String colourCode;
    String categoryId;
    String categoryName;
    boolean isNewUser;
    double outstandingBalance;
    boolean hasEmail;
}
