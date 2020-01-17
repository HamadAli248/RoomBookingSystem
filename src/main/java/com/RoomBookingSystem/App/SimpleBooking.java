package com.RoomBookingSystem.App;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleBooking {
    private String name;
    private java.util.Date startTime;
    private String startTimeString;
    private java.util.Date startDate;
    private String startDateString;


    public SimpleBooking(){};

    public SimpleBooking(String name, String time, String date) throws ParseException {

        this.startTimeString = time;
        java.util.Date sTime = new SimpleDateFormat("HH:mm").parse(startTimeString);

        this.startDateString = date;
        java.util.Date sDate = new SimpleDateFormat("yyyy-MM-dd").parse(startDateString);

        this.name = name;
        this.startTime = sTime;
        this.startDate = sDate;
    }

    public String getStartTimeString() {
        return startTimeString;
    }

    public void setStartTimeString(String startTimeString) {
        this.startTimeString = startTimeString;
    }

    public String getStartDateString() {
        return startDateString;
    }

    public void setStartDateString(String startDateString) {
        this.startDateString = startDateString;
    }

    public java.util.Date getStartTime() {
        return startTime;
    }

    public void setStartTime(String timeString) throws ParseException {
        this.startTime = new SimpleDateFormat("HH:mm").parse(timeString);
    }

    public java.util.Date getStartDate() {
        return startDate;
    }

    public void setStartDate(String dateString) throws ParseException {
        this.startDate = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
