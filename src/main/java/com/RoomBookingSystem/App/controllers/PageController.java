package com.RoomBookingSystem.App.controllers;

import com.RoomBookingSystem.App.Booking;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class PageController {

    @GetMapping("/room1")
    public String bookingForm(Model model) {
        model.addAttribute("booking", new Booking());

//        return "bookingForm";
        return "bookingFormOne";
    }

    @PostMapping("/room1")
    public String bookingSubmit(@ModelAttribute Booking booking) throws Exception {

//        Booking currentBooking = new Booking("Matt", 1, "2009/12/31", "09:00", "2009/12/31", "09:30");

        Booking currentBooking = new Booking(booking.get_name(), booking.get_room(), booking.get_startDate().toString(), booking.get_startTime().toString(), booking.get_endDate().toString(), booking.get_endTime().toString());
        System.out.println("greeting2 name: " + currentBooking.get_name());
        System.out.println("greeting2 room: " + currentBooking.get_room());
        return "thankYou";
    }

}


