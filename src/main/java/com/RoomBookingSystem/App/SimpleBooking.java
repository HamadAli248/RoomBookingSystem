package com.RoomBookingSystem.App;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleBooking {
    private String name;
    private java.util.Date startTime;
    private String startTimeString;
    private java.util.Date startDate;
    private String startDateString;
    private java.util.Date endTime;
    private String endTimeString;
    private java.util.Date endDate;
    private String endDateString;
    private int room;
    private String errorRead;

    public SimpleBooking(){};

    public SimpleBooking(String name, String sTime, String sDate, String eTime, String eDate, int room) throws ParseException {

        this.startTimeString = sTime;
        java.util.Date startTime = new SimpleDateFormat("HH:mm").parse(startTimeString);


        this.startDateString = sDate;
        java.util.Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse(startDateString);

        this.startTimeString = eTime;
        java.util.Date endTime = new SimpleDateFormat("HH:mm").parse(startTimeString);

        this.startDateString = eDate;
        java.util.Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(startDateString);

        this.name = name;
        this.startTime = startTime;
        this.startDate = startDate;
        this.endTime = endTime;
        this.endDate = endDate;
        this.room = room;

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

    public String getEndTimeString() {
        return endTimeString;
    }

    public void setEndTimeString(String endTimeString) {
        this.endTimeString = endTimeString;
    }

    public String getEndDateString() {
        return endDateString;
    }

    public void setEndDateString(String endDateString) {
        this.endDateString = endDateString;
    }

    public java.util.Date getEndTime() {
        return endTime;
    }

    public void setEndTime(String timeString) throws ParseException {
        this.endTime = new SimpleDateFormat("HH:mm").parse(timeString);
    }

    public java.util.Date getEndDate() {
        return endDate;
    }

    public void setEndDate(String dateString) throws ParseException {
        this.endDate = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
    }

    public int getRoom() { return this.room; }


    public void setRoom( String numString) {
        this.room = Integer.parseInt(numString);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setErrorRead(String errorRead) {
        this.errorRead = errorRead;
    }

    public String getErrorRead() {
        return errorRead;
    }
}
