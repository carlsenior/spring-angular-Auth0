package com.example.auth0.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class StaffRota {
    int id;
    int employeeId;
    String startShiftTime;
    String endShiftTime;
    String startShiftTime12Hour;
    String endShiftTime12Hour;
    String outOfOfficeFrom;
    String outOfOfficeTo;
    String outOfOfficeFrom12Hour;
    String outOfOfficeTo12Hour;
    Date timeAwayFrom;
    Date timeAwayTo;
    @JsonFormat(pattern="yyyy-MM-dd")
    LocalDate workDate;
    int dayId;
    String description;
    String miscEventStartTime;
    String miscEventEndTime;
    private Boolean outsideBooking;
}

