package com.example.auth0.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class StaffRotaForBusinessAppointments {
    int id;
    int employeeId;
    String startShiftTime;
    String endShiftTime;
    String outOfOfficeFrom;
    String outOfOfficeTo;
    Date timeAwayFrom;
    Date timeAwayTo;
    @JsonFormat(pattern="yyyy-MM-dd")
    LocalDate workDate;
    int dayId;
    String description;
    String miscEventStartTime;
    String miscEventEndTime;
    private boolean outsideBooking;
}

