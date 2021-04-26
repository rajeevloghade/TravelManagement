package com.tms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tms.dao.IBookingDao;
import com.tms.entity.Booking;
import com.tms.service.IBookingService;

@Service("BookingServiceImpl")
public class BookingServiceImpl implements IBookingService {
	
	private @Autowired IBookingDao bookingDao;
	
	@Override
	public Booking makeBooking(Booking booking) {
		return bookingDao.save(booking);
	
	}

	@Override
	public void cancelBooking(int bookingId) {
		// TODO Auto-generated method stub
		bookingDao.deleteById(bookingId);
		
	}

	@Override
	public Booking viewBooking(int bookingId) {
		// TODO Auto-generated method stub
		return bookingDao.findById(bookingId).get();
	}

	@Override
	public List<Booking> viewAllBooking() {
		// TODO Auto-generated method stub
		return bookingDao.findAll();
	}

}
