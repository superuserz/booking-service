package com.nagp.booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

	@GetMapping(value = "/")
	public String getStatus() {

		return "Application is Up & Running.";

	}
}
