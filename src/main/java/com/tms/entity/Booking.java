package com.tms.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int bookingId;
	 String bookingType;
	 String description;
	 String bookingTitle;
	 Date bookingDate;
	 
	 public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	public Booking(String bookingType, String description, String bookingTitle, Date bookingDate) {
		super();
		this.bookingType = bookingType;
		this.description = description;
		this.bookingTitle = bookingTitle;
		this.bookingDate = bookingDate;
	}
	
	


	public Booking(int bookingId, String bookingType, String description, String bookingTitle, Date bookingDate) {
		super();
		this.bookingId = bookingId;
		this.bookingType = bookingType;
		this.description = description;
		this.bookingTitle = bookingTitle;
		this.bookingDate = bookingDate;
	}


	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBookingTitle() {
		return bookingTitle;
	}
	public void setBookingTitle(String bookingTitle) {
		this.bookingTitle = bookingTitle;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	
	

}
