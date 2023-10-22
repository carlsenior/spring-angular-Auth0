package com.example.auth0.controller;

import com.example.auth0.test.dto.Message;
import com.example.auth0.pojo.Bookings;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.QueryParam;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/bookings", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "${auth0.frontend}", maxAge = 3600)
@Slf4j
public class BookingsController {
    @GetMapping("/retrieveBookings")
    public Message getBookings() {
        return new Message("Successfully retrieved booking");
    }

    @GetMapping("/retrieveSingleUserBookings")
    public Message getSingleUserBookings(@QueryParam("userId") Integer userId) {
        return new Message("Successfully retrieved booking");
    }

    @PostMapping("/saveBooking")
    public Message saveNewBooking() throws UnirestException, IOException {
        return new Message("Successfully saved booking");
    }

    @PutMapping("/modifyBooking")
    public Message modifyBooking() throws UnirestException, IOException {
        return new Message("Successfully modified booking");
    }
    @PatchMapping("/updateBooking")
    public Message updateBooking() throws UnirestException, IOException {
        return new Message("Successfully updated booking");
    }


    @DeleteMapping(value = "/deleteBooking/{employeeId}")
    public Message deleteBookings(@PathVariable("employeeId") int employeeId) {
        return new Message("Successfully deleted booking");
    }

    @GetMapping(value = "/admin/messages")
    public Message readAdminmessages() {
        return new Message("Hello Admin!");
    }
}