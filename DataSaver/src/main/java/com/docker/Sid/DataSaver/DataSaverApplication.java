package com.docker.Sid.DataSaver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataSaverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataSaverApplication.class, args);
		System.out.println("working");
	}
}
