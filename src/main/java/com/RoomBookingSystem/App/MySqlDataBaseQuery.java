package com.RoomBookingSystem.App;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqlDataBaseQuery {



        private List<Booking> jsonString = new ArrayList<>();
        StringToDate toDate = new StringToDate();

        public List<Booking> getAPI () {
            return jsonString;
        }

        public MySqlDataBaseQuery() throws Exception {

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

                while (rs.next()) {


                    jsonString.add(new Booking(rs.getString("booker_name"), rs.getInt("room_number"), rs.getDate("start_date").toString(), rs.getTime("start_time").toString(), rs.getDate("end_date").toString(), rs.getTime("end_time").toString()));


                    connect.close();
                }

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();

            }


        }
}


