package com.nagp.booking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.booking.entity.Booking;
import com.nagp.booking.exception.BookingException;
import com.nagp.booking.request.AddBookingRequest;
import com.nagp.booking.response.BaseResponse;
import com.nagp.booking.service.BookingService;

@RestController
@RequestMapping(value = "/booking")
public class BookingController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookingController.class);

	@Autowired
	private BookingService service;

	@GetMapping(value = "/{id}")
	public BaseResponse<Booking> getBooking(@PathVariable int id) throws BookingException {
		LOGGER.info("Getting Booking ID : " + id);
		return new BaseResponse<>(service.getBookingById(id));
	}

	@PostMapping("/new")
	public BaseResponse<Booking> createBooking(@RequestBody final AddBookingRequest request) throws BookingException {
		LOGGER.info("Created new Booking : " + request.toString());
		return service.createBooking(request);
	}
}