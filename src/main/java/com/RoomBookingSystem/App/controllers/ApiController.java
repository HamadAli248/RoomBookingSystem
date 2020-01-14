package com.RoomBookingSystem.App.controllers;
import com.RoomBookingSystem.App.Booking;
import com.RoomBookingSystem.App.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;


@RestController
public class ApiController {

//    ArrayList<People> hello = new ArrayList<People>();


    @GetMapping("/api")

    public List<Booking> apiReturn() throws SQLException {
//
        List<Booking> hello = new Data().getAPI();


////        System.out.println(hello.toString());
        return hello;

    }

}
