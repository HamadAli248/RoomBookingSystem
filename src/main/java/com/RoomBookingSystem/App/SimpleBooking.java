package com.RoomBookingSystem.App;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleBooking {
    private String name;
    private java.util.Date startTime;
    private String startTimeString;


    public SimpleBooking(){};

    public SimpleBooking(String name, String time) throws ParseException {
        this.startTimeString = time;
        java.util.Date date = new SimpleDateFormat("HH:mm").parse(startTimeString);
        this.name = name;
        this.startTime = date;
    }

    public String getStartTimeString() {
        return startTimeString;
    }

    public void setStartTimeString(String startTimeString) {
        this.startTimeString = startTimeString;
    }

    public java.util.Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date time) {
        this.startTime = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
