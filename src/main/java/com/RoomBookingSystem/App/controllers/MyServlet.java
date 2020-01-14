package com.RoomBookingSystem.App.controllers;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {


        String name = request.getParameter("bookerName");

        System.out.println("Name: " + name);
        System.out.println("Room: " + Integer.parseInt(request.getParameter("room")));
        System.out.println("S. Date: " + request.getParameter("startDate"));
        System.out.println("S. Time: " + request.getParameter("startTime"));
        System.out.println("E. Date: " + request.getParameter("endDate"));
        System.out.println("E. Time: " + request.getParameter("endTime"));



//        new Booking(request.getParameter("bookerName"), Integer.parseInt(request.getParameter("room")), request.getParameter("startDate") );

    }
}

