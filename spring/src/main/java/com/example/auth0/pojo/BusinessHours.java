package com.example.auth0.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessHours {
   String day;
   Boolean open_status;
   String start_time;
   String end_time;
}
