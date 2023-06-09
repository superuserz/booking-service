package com.nagp.booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

	@GetMapping(value = "/status")
	public String getStatus() {
		return "Status : UP";
	}

}
