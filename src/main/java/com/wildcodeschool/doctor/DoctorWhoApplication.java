package com.wildcodeschool.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.wildcodeschool.doctor.controller.DoctorController;

@SpringBootApplication
@ComponentScan(basePackageClasses=DoctorController.class)
public class DoctorWhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorWhoApplication.class, args);
	}

}
