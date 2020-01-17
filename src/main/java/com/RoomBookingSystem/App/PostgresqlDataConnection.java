package com.RoomBookingSystem.App;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostgresqlDataConnection {

        private List<Booking> jsonString = new ArrayList<>();
        StringToDate toDate = new StringToDate();

        public List<Booking> getAPI () {
            return jsonString;
        }

        public PostgresqlDataConnection() throws Exception {
            Booking booking = new Booking();

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

                String query = " insert into  roomBookingSystem(start_time,start_date,end_time,end_date,booker_name,room_number)" +
                "values(?,?,?,?,?)";
                PreparedStatement preparedStatement = connect.prepareStatement(query);
                preparedStatement.setDate(2, (Date) booking.get_startTime());
                preparedStatement.setDate(2, (Date) booking.get_startDate());
                preparedStatement.setDate(2, (Date) booking.get_endTime());
                preparedStatement.setDate(2, (Date) booking.get_endDate());
                preparedStatement.setString(1,booking.get_name());
                preparedStatement.setInt(1,booking.get_room());


            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }