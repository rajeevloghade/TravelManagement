package com.tms.controller;

import java.util.List;

import com.tms.entity.Booking;
import com.tms.entity.Travels;

public interface ITravelsController {

	Travels addTravels(Travels travels);

	Travels updateTravels(Travels travels);

	void removeTravels(int travelId);

	Travels searchTravels(int travelId);

	List<Travels> viewTravels();
	
	Booking makeBooking(Booking booking);

	void cancelBooking(int bookingId);

	Booking viewBooking(int bookingId);

	List<Booking> viewAllBooking();
 
}
