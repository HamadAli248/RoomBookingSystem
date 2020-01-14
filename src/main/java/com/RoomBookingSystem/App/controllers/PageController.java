package com.RoomBookingSystem.App.controllers;

import com.RoomBookingSystem.App.Booking;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {
    private String name = "Matthew!!!";


    @GetMapping("/")
    public String giveOptions(Model model){

        // Passes string (name) in, where defined in home.html
        model.addAttribute("user", name);

        return "home";

    }

    // executes on page load
    @GetMapping("/room1")
    public String roomOne(Model model){

        model.addAttribute("booking", new Booking());
        return "bookRoom1";

    }

    // executes on submit
    @PostMapping("/room1")
    public String room1Submit(@ModelAttribute("booking") Booking booking) {



        //redirects to thank you screen on submit
        return "thankYou";
    }

}
