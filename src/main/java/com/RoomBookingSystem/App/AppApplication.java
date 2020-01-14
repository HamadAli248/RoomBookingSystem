package com.RoomBookingSystem.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;


@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(AppApplication.class, args);
		Data arr = new Data();


	}


}
