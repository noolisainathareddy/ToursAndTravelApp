package com.org.service;

import org.springframework.http.ResponseEntity;

import com.org.model.Booking;

public interface BookingService {

	public ResponseEntity<?> createBooking(Booking newBooking);

	public Booking updateBooking(Booking newBooking);

	public String deleteBooking(Integer bookingId);

	public Iterable<Booking> displayAllBooking();

	public ResponseEntity<?> findBookingById(Integer bookingId);

    /*ResponseEntity<?> findBookingBydstplace(String dstPlace);*/

	Iterable<Booking> findBookingByUserId(Integer userId);
}
