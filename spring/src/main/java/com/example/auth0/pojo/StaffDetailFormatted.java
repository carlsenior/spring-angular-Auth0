package com.example.auth0.pojo;

import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
public class StaffDetailFormatted {
        int employeeId;
        Time startShiftTime;
        Time endShiftTime;
        String startShiftTime12Hour;
        String endShiftTime12Hour;
        Time outOfOfficeFrom;
        Time outOfOfficeTo;
        String outOfOfficeFrom12Hour;
        String outOfOfficeTo12Hour;
        Date timeAwayFrom;
        Date timeAwayTo;
        int dayId;
}
