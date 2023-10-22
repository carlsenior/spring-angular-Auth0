package com.example.auth0.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PendingBooking {

    private int userId;
    private int staffId;
    private int isPending;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int serviceId;

}
