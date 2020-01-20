package com.RoomBookingSystem.App.controllers;

import com.RoomBookingSystem.App.Booking;
import com.RoomBookingSystem.App.MySqlDataBaseQuery;
import com.RoomBookingSystem.App.PostgresqlDataConnection;
import com.RoomBookingSystem.App.SimpleBooking;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class PageController {

    public SimpleBooking currentBooking;
    int room;
    Date now = new Date();
    Date timeCheck = new Date();

    @GetMapping("/")
    public String giveOptions(Model model) {

        // Passes string (name) in, where defined in home.html
//        model.addAttribute("user", name);

        return "home";
    }

    @GetMapping("/room1")
    public String bookingForm(Model model) {


        model.addAttribute("simpleBooking", new SimpleBooking());

//        return "bookingForm1";
        return "bookingFormOne";
    }

    @PostMapping("/room1")
    public String room1Submit(@ModelAttribute SimpleBooking simpleBooking) throws Exception {

        room = 1;
        System.out.println("simpleBooking name: " + simpleBooking.getName());
        System.out.println("simpleBooking Time: " + simpleBooking.getStartTimeString());
        System.out.println("simpleBooking Date: " + simpleBooking.getStartDateString());

        System.out.println("ROOM: " + simpleBooking.getRoom());

        currentBooking = new SimpleBooking(simpleBooking.getName(), simpleBooking.getStartTimeString(), simpleBooking.getStartDateString(), simpleBooking.getEndTimeString(), simpleBooking.getEndDateString(), room);


        System.out.println("============= New Booking Object ============");
        System.out.println("Name: " + currentBooking.getName());
        System.out.println("Time: " + currentBooking.getStartTime());
        System.out.println("Date: " + currentBooking.getStartDate());
        System.out.println("End Date: " + currentBooking.getEndDate());
        System.out.println("ROOM: " + currentBooking.getRoom());

        //gets today's date and sets time to 0
        now.setTime(0000);

        // compares dates entered to check if start is before end and dates are today, or later
        if(currentBooking.getStartDate().compareTo(currentBooking.getEndDate())>0 || currentBooking.getStartDate().compareTo(now)<0){
            simpleBooking.setErrorRead("Please enter valid dates");
            System.out.println(simpleBooking.getErrorRead());
            return "bookingFormOne";
        }

        // sets date booked and time now to check if date is in future
        timeCheck.setDate(currentBooking.getStartTime().getDate());
        timeCheck.setMonth(currentBooking.getStartTime().getMonth());
        timeCheck.setYear(currentBooking.getStartTime().getYear());
        System.out.println("*****Date: " + timeCheck);

        System.out.println("================ COMPARISON: " + currentBooking.getStartTime().compareTo(currentBooking.getEndTime()));

        if(currentBooking.getStartTime().compareTo(currentBooking.getEndTime())>0 || (currentBooking.getStartTime().compareTo(timeCheck)<0 && currentBooking.getStartDate().compareTo(now)<=0)){
            simpleBooking.setErrorRead("Please enter valid times");
            System.out.println(simpleBooking.getErrorRead());
            return "bookingFormOne";
        }

        //DB Add
        //new PostgresqlDataConnection(currentBooking);
        new MySqlDataBaseQuery(currentBooking);

        simpleBooking.setErrorRead("");
        return "simpleThankYou";
    }

//
//    @PostMapping("/room1")
//
//    public String room1Submit(@ModelAttribute Booking booking) throws Exception {
//
//        System.out.println("booking start date: " + booking.get_startDate());
//
//
//        Booking currentBooking = new Booking(booking.get_name(), booking.get_room(), "2009-10-01", "08:00", "2019-03-20", "08:00");
////        Booking currentBooking = new Booking(booking.get_name(), booking.get_room(), booking.get_startDate().toString(), booking.get_startTime().toString(), booking.get_endDate().toString(), booking.get_endTime().toString());
//
//        System.out.println("============= New Booking Object ============");
//        System.out.println("name: " + currentBooking.get_name());
//        System.out.println("room: " + currentBooking.get_room());
//        System.out.println("S. Date: " + currentBooking.get_startDate());
//
//
//        return "thankYou";
//    }

    @GetMapping("/room2")
    public String room2Form(Model model) {
        model.addAttribute("simpleBooking", new SimpleBooking());

//        return "bookingForm1";
        return "bookingFormTwo";
    }

    @PostMapping("/room2")
    public String room2Submit(@ModelAttribute SimpleBooking simpleBooking) throws Exception {

        room = 2;
        System.out.println("simpleBooking name: " + simpleBooking.getName());
        System.out.println("simpleBooking Time: " + simpleBooking.getStartTimeString());
        System.out.println("simpleBooking Date: " + simpleBooking.getStartDateString());

        System.out.println("ROOM: " + simpleBooking.getRoom());

        currentBooking = new SimpleBooking(simpleBooking.getName(), simpleBooking.getStartTimeString(), simpleBooking.getStartDateString(), simpleBooking.getEndTimeString(), simpleBooking.getEndDateString(), room);

        System.out.println("============= New Booking Object ============");
        System.out.println("Name: " + currentBooking.getName());
        System.out.println("Time: " + currentBooking.getStartTime());
        System.out.println("Date: " + currentBooking.getStartDate());
        System.out.println("ROOM: " + currentBooking.getRoom());

        //gets today's date and sets time to 0
        now.setTime(0000);

        // compares dates entered to check if start is before end and dates are today, or later
        if(currentBooking.getStartDate().compareTo(currentBooking.getEndDate())>0 || currentBooking.getStartDate().compareTo(now)<0){
            simpleBooking.setErrorRead("Please enter valid dates");
            System.out.println(simpleBooking.getErrorRead());
            return "bookingFormTwo";
        }

        // sets date booked and time now to check if date is in future
        timeCheck.setDate(currentBooking.getStartTime().getDate());
        timeCheck.setMonth(currentBooking.getStartTime().getMonth());
        timeCheck.setYear(currentBooking.getStartTime().getYear());
        System.out.println("*****Date: " + timeCheck);

        if(currentBooking.getStartTime().compareTo(currentBooking.getEndTime())>0 || (currentBooking.getStartTime().compareTo(timeCheck)<0 && currentBooking.getStartDate().compareTo(now)<=0)){
            simpleBooking.setErrorRead("Please enter valid times");
            System.out.println(simpleBooking.getErrorRead());
            return "bookingFormTwo";
        }

        //DB Add
        //new PostgresqlDataConnection(currentBooking);
        new MySqlDataBaseQuery(currentBooking);

        return "simpleThankYou";
    }

    @GetMapping("/room3")
    public String room3Form(Model model) {
        model.addAttribute("simpleBooking", new SimpleBooking());

//        return "bookingForm1";
        return "bookingFormThree";
    }

    @PostMapping("/room3")
    public String room3Submit(@ModelAttribute SimpleBooking simpleBooking) throws Exception {

        room = 3;
        System.out.println("simpleBooking name: " + simpleBooking.getName());
        System.out.println("simpleBooking Time: " + simpleBooking.getStartTimeString());
        System.out.println("simpleBooking Date: " + simpleBooking.getStartDateString());

        System.out.println("ROOM: " + simpleBooking.getRoom());

        currentBooking = new SimpleBooking(simpleBooking.getName(), simpleBooking.getStartTimeString(), simpleBooking.getStartDateString(), simpleBooking.getEndTimeString(), simpleBooking.getEndDateString(), room);

        System.out.println("============= New Booking Object ============");
        System.out.println("Name: " + currentBooking.getName());
        System.out.println("Time: " + currentBooking.getStartTime());
        System.out.println("Date: " + currentBooking.getStartDate());
        System.out.println("ROOM: " + currentBooking.getRoom());

        //gets today's date and sets time to 0
        now.setTime(0000);

        // compares dates entered to check if start is before end and dates are today, or later
        if(currentBooking.getStartDate().compareTo(currentBooking.getEndDate())>0 || currentBooking.getStartDate().compareTo(now)<0){
            simpleBooking.setErrorRead("Please enter valid dates");
            System.out.println(simpleBooking.getErrorRead());
            return "bookingFormThree";
        }

        // sets date booked and time now to check if date is in future
        timeCheck.setDate(currentBooking.getStartTime().getDate());
        timeCheck.setMonth(currentBooking.getStartTime().getMonth());
        timeCheck.setYear(currentBooking.getStartTime().getYear());
        System.out.println("*****Date: " + timeCheck);

        if(currentBooking.getStartTime().compareTo(currentBooking.getEndTime())>0 || (currentBooking.getStartTime().compareTo(timeCheck)<0 && currentBooking.getStartDate().compareTo(now)<=0)){
            simpleBooking.setErrorRead("Please enter valid times");
            System.out.println(simpleBooking.getErrorRead());
            return "bookingFormThree";
        }

        // if(db query = error){ return "this room is already booked"}

       //DB Add
        //new PostgresqlDataConnection(currentBooking);
        new MySqlDataBaseQuery(currentBooking);

        return "simpleThankYou";
    }


}


