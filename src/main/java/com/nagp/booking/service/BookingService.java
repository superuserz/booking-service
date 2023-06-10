package com.nagp.booking.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagp.booking.entity.Booking;
import com.nagp.booking.enums.BookingStatusEnum;
import com.nagp.booking.enums.PaymentModeEnum;
import com.nagp.booking.exception.BookingException;
import com.nagp.booking.repository.BookingRepository;
import com.nagp.booking.request.AddBookingRequest;
import com.nagp.booking.response.BaseResponse;

@Service
public class BookingService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookingService.class);

	@Autowired
	private BookingRepository repository;

	public Booking getBookingById(int id) throws BookingException {
		Optional<Booking> booking = repository.findById(id);
		if (booking.isPresent()) {
			return booking.get();
		} else {
			throw new BookingException("service.booking.001", "Booking ID : " + id + " Not Found");
		}
	}

	public BaseResponse<Booking> createBooking(final AddBookingRequest request) {

		Booking booking = new Booking();
		booking.setServiceId(request.getServiceId());
		booking.setUserId(request.getUserId());
		booking.setBookingStatus(BookingStatusEnum.NEW);
		booking.setServiceAmount(request.getServiceAmount());
		booking.setPaymentMode(PaymentModeEnum.parse(request.getPaymentMode()));
		booking = repository.save(booking);

		return new BaseResponse<>(booking);
	}
}
