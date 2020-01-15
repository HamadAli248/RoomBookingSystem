package com.RoomBookingSystem.App;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Data {

    private List<Booking> jsonString = new ArrayList<>();


    public Data() {


        Connection connect = null;

        try {
            // directs to driver (added in the dependencies)
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager
                    //info from workbench - port/schemaName, user, password
                    .getConnection("jdbc:mysql://localhost:3306/JavaProjectDatabase",
                            "root", "password");

            System.out.println("DB Opened Successfully");

            // sets up statement through which the db can be queried
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from bookings");


            while (rs.next()){

                jsonString.add(new Booking(rs.getString("booker_name"), rs.getInt("room_number"), rs.getDate("start_date").toString(),rs.getTime("start_time").toString(), rs.getDate("end_date").toString(),rs.getTime("end_time").toString()  ));

//                jsonString.add(Boolean e)

//                //concat each column into a ln and sys out
//                System.out.print(rs.getInt("id")+"\t");
//                System.out.print(rs.getString("booker_name")+"\t");
//                System.out.print(rs.getDate("start_date")+"\t");
//                System.out.print(rs.getTime("start_time")+"\t");
//                System.out.print(rs.getDate("end_date")+"\t");
//                System.out.print(rs.getTime("end_time")+"\t");

            }
//


            connect.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public List<Booking> getAPI(){
        return jsonString;
    }
}
