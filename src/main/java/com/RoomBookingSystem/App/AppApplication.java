package com.RoomBookingSystem.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;
import java.text.SimpleDateFormat;


@SpringBootApplication
public class AppApplication {


	public static void main(String[] args) throws Exception {
		SpringApplication.run(AppApplication.class, args);
		Data arr = new Data();





		Booking b = new Booking("Matt", 1, "2009-12-31", "09:00", "2009-12-31", "09:30");

		System.out.println(b.get_name());


	}


}
