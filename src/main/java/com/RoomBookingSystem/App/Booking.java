package com.RoomBookingSystem.App;

import java.sql.Time;
import java.util.Date;

public class Booking {
    private String _name;
    private Date _startDate;
    private Time _startTime;
    private Date _endDate;
    private Time _endTime;

    public Booking(String name, Date startDate, Time startTime, Date endDate, Time endTime){
        this._name = name;
        this._startDate = startDate;
        this._startTime = startTime;
        this._endDate = endDate;
        this._endTime = endTime;
    }

    public Booking(){};

    // GETTERS

    public String get_name() {
        return _name;
    }

    public Date get_startDate() {
        return _startDate;
    }

    public Time get_startTime() {
        return _startTime;
    }

    public Date get_endDate() {
        return _endDate;
    }

    public Time get_endTime() {
        return _endTime;
    }

    // SETTERS
    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_startDate(Date _startDate) {
        this._startDate = _startDate;
    }

    public void set_startTime(Time _startTime) {
        this._startTime = _startTime;
    }

    public void set_endDate(Date _endDate) {
        this._endDate = _endDate;
    }

    public void set_endTime(Time _endTime) {
        this._endTime = _endTime;
    }
}