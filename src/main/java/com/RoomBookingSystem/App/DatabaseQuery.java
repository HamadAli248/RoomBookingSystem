package com.RoomBookingSystem.App;
import com.RoomBookingSystem.App.*;


import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DatabaseQuery {

    public void inputFromFrontEnd() throws Exception {

        Booking booking = new Booking("Hamad",1,"12-02-2020","12:30", "13-02-2020", "12:45");

    }





    public void sendingData(){

        String query = " insert into  roomBookingSystem(start_time,start_date,end_time,end_date,booker_name,start_date,room_number)" +
                "values(?,?,?,?,?,?)";




    }

}
