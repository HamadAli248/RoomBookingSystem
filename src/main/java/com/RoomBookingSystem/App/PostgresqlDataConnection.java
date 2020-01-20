package com.RoomBookingSystem.App;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PostgresqlDataConnection {



        private List<Booking> jsonString = new ArrayList<>();
        StringToDate toDate = new StringToDate();

        public List<Booking> getAPI () {
            return jsonString;
        }

        public PostgresqlDataConnection(){
            Connection connect = null;
            try {
                Class.forName("org.postgresql.Driver");

                connect = DriverManager
                        .getConnection("jdbc:postgresql://localhost:5432/roomBookingSystem",
                                "hamad", "password");
                System.out.println("DataBase opened Successfully");
                } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                }

            }

        public PostgresqlDataConnection(SimpleBooking currBook) throws Exception {
//            Booking booking = new Booking();

        Connection connect = null;
        try {
            Class.forName("org.postgresql.Driver");

            connect = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/roomBookingSystem",
                            "hamad", "password");
            System.out.println("DataBase opened Successfully");



            /// getting statement to get things back from the database

//                Statement stmt = connect.createStatement();
//                ResultSet rs = stmt.executeQuery("select * from bookings WHERE ");
//                while (rs.next()) {
//                    jsonString.add(new Booking(rs.getString("booker_name"), rs.getInt("room_number"), rs.getDate("start_date").toString(), rs.getTime("start_time").toString(), rs.getDate("end_date").toString(), rs.getTime("end_time").toString()));
//                    connect.close();
//                }

//            System.out.println("================================" + new java.sql.Date(currBook.getStartDate().getTime())+ "======================================");
//            System.out.println("================================" + new java.sql.Time(currBook.getStartTime().getTime()) + "======================================");
//            System.out.println("================================" + new java.sql.Time(currBook.getEndTime().getTime())+ "======================================");



                String query = " insert into  room_booking(start_time,start_date,end_time,end_date,booker_name,room_number)" +
                "values(?,?,?,?,?,?)";
                PreparedStatement preparedStatement = connect.prepareStatement(query);
                preparedStatement.setTime(1, new java.sql.Time(currBook.getStartTime().getTime()));
                preparedStatement.setDate(2,new java.sql.Date(currBook.getStartDate().getTime()));
                preparedStatement.setTime(3,new java.sql.Time(currBook.getEndTime().getTime()));
                preparedStatement.setDate(4, new java.sql.Date(currBook.getEndDate().getTime()));
                preparedStatement.setString(5,currBook.getName());
                preparedStatement.setInt(6,currBook.getRoom());
                preparedStatement.execute();
                System.out.println("==================================================Your Booking has been entered in the database========================================");


            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }