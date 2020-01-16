package com.RoomBookingSystem.App;

import com.RoomBookingSystem.App.*;
import java.util.Date;

public class Booking {
    private String _name;
    private int _room;
    private Date _startDate;
    private Date _startTime;
    private Date _endDate;
    private Date _endTime;

    StringToDate ToDate = new StringToDate();

    public Booking(String name, int room, String startDate, String startTime, String endDate, String endTime) throws Exception {

        this._name = name;
        this._room = room;
        this._startDate = ToDate.ToDate(startDate);
        this._startTime = ToDate.ToTime(startTime);
        this._endDate = ToDate.ToDate(endDate);
        this._endTime = ToDate.ToTime(endTime);
    }


    public Booking() {

    }





    // GETTERS

    public String get_name() {
        return _name;
    }

    public int get_room() {
        return _room;
    }

    public Date get_startDate() {
        return _startDate;
    }

    public Date get_startTime() {
        return _startTime;
    }

    public Date get_endDate() {
        return _endDate;
    }

    public Date get_endTime() {
        return _endTime;
    }

    // SETTERS
    public void set_name(String name) {
        this._name = name;
    }

    public void set_room(int room) {
        this._room = room;
    }

    public void set_startDate(String startDate) throws Exception {
        this._startDate = ToDate.ToDate(startDate);
    }

    public void set_startTime(String startTime) throws Exception {
        this._startTime = ToDate.ToTime(startTime);
    }

    public void set_endDate(String endDate) throws Exception {
        this._endDate = ToDate.ToDate(endDate);
    }

    public void set_endTime(String endTime) throws Exception {
        this._endTime = ToDate.ToTime(endTime);
    }

    @Override
    public String toString() {
        return "Name: " + this._name + "From: " + this._startDate + " " + this._startTime + " until: " + this._endDate + " " + this._endTime;
    }
}
