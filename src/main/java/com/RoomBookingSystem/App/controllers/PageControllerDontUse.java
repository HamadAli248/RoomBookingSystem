//package com.RoomBookingSystem.App.controllers;
//
//import com.RoomBookingSystem.App.Booking;
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.Time;
//import java.util.Date;
//
//
//@Controller
//public class PageControllerDontUse {
////    private String name = "Matthew!!!";
//
//
//    @GetMapping("/")
//    public String giveOptions(Model model){
//
//        // Passes string (name) in, where defined in home.html
////        model.addAttribute("user", name);
//
//        return "home";
//
//    }
//
//    @GetMapping("/room1")
//    public String getBooking(Model model) {
//        model.addAttribute("booking", new Booking());
//        return "bookingForm";
//    }
////
//////  executes on submit
////    @PostMapping("/room1")
////    public String room1Submit() {
//////    public String room1Submit(@ModelAttribute("booking") Booking booking) {
////
////        //System.out.println(booking.get_name());
////        //redirects to thank you screen on submit
////        return "thankYou";
////    }
////
////
////    @WebServlet("/room1")
////    public class MyServlet extends HttpServlet {
////
////        public void doGet(HttpServletRequest request,
////                       HttpServletResponse response) throws ServletException, IOException {
////
////
////        String name = request.getParameter("bookerName");
////
////        System.out.println("Name: " + request.getParameter("name"));
////        System.out.println("Room: " + Integer.parseInt(request.getParameter("room")));
////        System.out.println("S. Date: " + request.getParameter("startDate"));
////        System.out.println("S. Time: " + request.getParameter("startTime"));
////        System.out.println("E. Date: " + request.getParameter("endDate"));
////        System.out.println("E. Time: " + request.getParameter("endTime"));
////
////
////
//////        new Booking(request.getParameter("bookerName"), Integer.parseInt(request.getParameter("room")), request.getParameter("startDate") );
////
////    }
////}
////////     executes on page load
////    @PostMapping("/room1")
//////    @GetMapping("/room1")
////    public String submitBooking(@RequestParam(name="name") String name,
////                            @RequestParam( name = "room") int room,
////                            @RequestParam( name="startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
////                            @RequestParam( name="startTime") @DateTimeFormat(pattern = "HH:MM") Time startTime,
////                            @RequestParam( name="endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate,
////                            @RequestParam( name="endTime") @DateTimeFormat(pattern = "HH:MM") Time endTime,
////                            Model model){
////
////        model.addAttribute("name", name);
////        model.addAttribute("room", room);
////        model.addAttribute("startDate", startDate);
////        model.addAttribute("startTime", startTime);
////        model.addAttribute("endDate", endDate);
////        model.addAttribute("endTime", endTime);
////
//////        return "bookRoom1";
////        return "thankYou";
////
////    }
//
////    @RequestMapping(value = "/room1", method= RequestMethod.GET)
////    public String read(Model model) {
////        model.addAttribute("booking", new Booking());
////        return "bookRoom1";
////    }
////
////    @RequestMapping(value = "/room1", method= RequestMethod.POST)
////    public String room1(Booking booking){
////
////        return "thankYou";
////    }
//
//
//
//}
