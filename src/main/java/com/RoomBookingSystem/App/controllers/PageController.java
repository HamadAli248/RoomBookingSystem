package com.RoomBookingSystem.App.controllers;

import com.RoomBookingSystem.App.Booking;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PageController {
    private String name = "Matthew!!!";


    @GetMapping("/")
    public String giveOptions(Model model){

        // Passes string (name) in, where defined in home.html
        model.addAttribute("user", name);

        return "home";

    }

//     executes on page load
    @GetMapping("/room1")
    public String roomOne(Model model){

        model.addAttribute("booking", new Booking());
        return "bookRoom1";

    }

//    @RequestMapping(value = "/room1", method= RequestMethod.GET)
//    public String read(Model model) {
//        model.addAttribute("booking", new Booking());
//        return "bookRoom1";
//    }
//
//    @RequestMapping(value = "/room1", method= RequestMethod.POST)
//    public String room1(Booking booking){
//
//        return "thankYou";
//    }

//     executes on submit
    @PostMapping("/room1")
    public String room1Submit(@ModelAttribute("booking") Booking booking) {
        booking.set_name("*{name)");
        //System.out.println(booking.get_name());
        //redirects to thank you screen on submit
        return "thankYou";
    }

}
