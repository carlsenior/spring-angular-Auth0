package com.example.auth0.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ClientNote {
    @JsonProperty("id")
    int id;
    @JsonProperty("clientId")
    int client_id;
    @JsonProperty("date")
    @JsonFormat(pattern="yyyy-MM-dd")
    LocalDate date;
    @JsonProperty("time")
    String time;
    @JsonProperty("comment")
    String comment;
    @JsonProperty("status")
    boolean status;
}
