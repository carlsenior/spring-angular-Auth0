package com.example.auth0.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nullable;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Nullable
public class StaffAvailability {
    String name;
    int id;
    @JsonFormat(pattern="yyyy-MM-dd")
    List<LocalDate> workDays;
    List<WorkHours> availability;
    String startHour;
    String endHour;
}