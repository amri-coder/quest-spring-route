package com.wildcodeschool.doctor.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Doctor Not Found")
public class DoctorNotFoundException extends Exception {
	  private static final long serialVersionUID = 1L;
	
	
}
