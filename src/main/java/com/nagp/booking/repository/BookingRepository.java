package com.nagp.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagp.booking.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
