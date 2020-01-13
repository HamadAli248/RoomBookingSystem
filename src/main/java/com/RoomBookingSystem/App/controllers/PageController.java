package com.RoomBookingSystem.App.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    private String name = "Matthew!!!";


    @GetMapping("/")
    public String giveOptions(Model model){

        // Passes string (name) in, where defined in home.html
        model.addAttribute("user", name);

        return "home";

    }

}
