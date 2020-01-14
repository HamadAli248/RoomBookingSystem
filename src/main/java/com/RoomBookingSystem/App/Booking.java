package com.RoomBookingSystem.App;

import java.sql.Time;
import java.util.Date;

public class Booking {
    private String _name;
    private int _room;
    private Date _startDate;
    private Time _startTime;
    private Date _endDate;
    private Time _endTime;

    public Booking(String name, int room, Date startDate, Time startTime, Date endDate, Time endTime){
        this._name = name;
        this._room = room;
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

    public int get_room() {
        return _room;
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
    public void set_name(String name) {
        this._name = name;
    }

    public void set_room(int room) {
        this._room = room;
    }

    public void set_startDate(Date startDate) {
        this._startDate = startDate;
    }

    public void set_startTime(Time startTime) {
        this._startTime = startTime;
    }

    public void set_endDate(Date endDate) {
        this._endDate = endDate;
    }

    public void set_endTime(Time endTime) {
        this._endTime = endTime;
    }

    @Override
    public String toString() {
        return "Name: " + this._name + "From: " + this._startDate + " " + this._startTime + " until: " + this._endDate + " " + this._endTime;
    }
}
