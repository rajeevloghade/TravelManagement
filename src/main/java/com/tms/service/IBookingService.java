package com.tms.service;

import java.util.List;

import com.tms.entity.Booking;


public interface IBookingService {
	
	Booking makeBooking(Booking booking);

	void cancelBooking(int bookingId);

	Booking viewBooking(int bookingId);

	List<Booking> viewAllBooking();

}

