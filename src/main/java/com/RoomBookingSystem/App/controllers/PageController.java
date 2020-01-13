package com.RoomBookingSystem.App.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @GetMapping("/home")
    public String giveOptions(
            @RequestParam(value = "name", required = false,
                    defaultValue = "Everyone"  ) String name, Model model) {
        model.addAttribute("user", name);
        return "hello";
    }

}
