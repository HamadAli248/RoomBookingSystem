package com.RoomBookingSystem.App.controllers;

import com.RoomBookingSystem.App.Booking;
import com.RoomBookingSystem.App.SimpleBooking;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class PageController {

    @GetMapping("/")
    public String giveOptions(Model model) {

        // Passes string (name) in, where defined in home.html
//        model.addAttribute("user", name);

        return "home";
    }

    @GetMapping("/room1")
    public String bookingForm(Model model) {
        model.addAttribute("booking", new Booking());

//        return "bookingForm1";
        return "bookingFormOne";
    }

    @PostMapping("/room1")

    public String room1Submit(@ModelAttribute Booking booking) throws Exception {

        System.out.println("booking start date: " + booking.get_startDate());


        Booking currentBooking = new Booking(booking.get_name(), booking.get_room(), "2009-10-01", "08:00", "2019-03-20", "08:00");
//        Booking currentBooking = new Booking(booking.get_name(), booking.get_room(), booking.get_startDate().toString(), booking.get_startTime().toString(), booking.get_endDate().toString(), booking.get_endTime().toString());

        System.out.println("============= New Booking Object ============");
        System.out.println("name: " + currentBooking.get_name());
        System.out.println("room: " + currentBooking.get_room());
        System.out.println("S. Date: " + currentBooking.get_startDate());


        return "thankYou";
    }

    @GetMapping("/room2")
    public String simpleForm(Model model) {
        model.addAttribute("simpleBooking", new SimpleBooking());

//        return "bookingForm1";
        return "bookingFormTwo";
    }

    @PostMapping("/room2")

    public String simpleSubmit(@ModelAttribute SimpleBooking simpleBooking) throws Exception {


        System.out.println("simpleBooking name: " + simpleBooking.getName());
        System.out.println("simpleBooking room: " + simpleBooking.getStartTime());



        SimpleBooking currentBooking = new SimpleBooking(simpleBooking.getName(), simpleBooking.getStartTimeString());
//        Booking currentBooking = new Booking(booking.get_name(), booking.get_room(), booking.get_startDate().toString(), booking.get_startTime().toString(), booking.get_endDate().toString(), booking.get_endTime().toString());

        System.out.println("============= New Booking Object ============");
        System.out.println("name: " + currentBooking.getName());
        System.out.println("room: " + currentBooking.getStartTime());

        return "simpleThankYou";
    }



}


