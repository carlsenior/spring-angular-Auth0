package com.example.auth0.pojo;

import lombok.Data;

@Data
public class SmsMessage {
    String phoneNumber;
    String smsMessage;
}
