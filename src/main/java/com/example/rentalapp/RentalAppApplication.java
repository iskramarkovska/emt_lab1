package com.example.rentalapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.rentalapp")
public class RentalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentalAppApplication.class, args);
	}

}
