package com.RoomBookingSystem.App;


import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DatabaseQuery {

    public void inputFromFrontEnd() throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

     //   Booking booking = new Booking("Hamad",1,dateFormat.parse("12-jan-2020"), timeFormat.parse("12:30"), dateFormat.parse("13-jan-2020"), timeFormat.parse("12:45"));
//
//        System.out.println(booking.get_name());
//
//        String name = booking.get_name();
//        int room = booking.get_room();
//        Date startDate = booking.get_startDate();
//        Time startTime = booking.get_startTime();
//        Date endDate = booking.get_endDate();
//        Time time = booking.get_endTime();
    }





    public void sendingData(){

        String query = " insert into  roomBookingSystem(start_time,start_date,end_time,end_date,booker_name,start_date,room_number)" +
                "values(?,?,?,?,?,?)";











    }

}
