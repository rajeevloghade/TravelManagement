package com.tms.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookingId_pk")
	int bookingId;
	String bookingType;
	String description;
	String bookingTitle;
	Date bookingDate;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookingId_fk", referencedColumnName = "bookingId")
	List<Package> travelPackages;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(String bookingType, String description, String bookingTitle, Date bookingDate,
			List<Package> travelPackages) {
		super();
		this.bookingType = bookingType;
		this.description = description;
		this.bookingTitle = bookingTitle;
		this.bookingDate = bookingDate;
		this.travelPackages = travelPackages;
	}

	public Booking(int bookingId, String bookingType, String description, String bookingTitle, Date bookingDate,
			List<Package> travelPackages) {
		super();
		this.bookingId = bookingId;
		this.bookingType = bookingType;
		this.description = description;
		this.bookingTitle = bookingTitle;
		this.bookingDate = bookingDate;
		this.travelPackages = travelPackages;
	}

	public List<Package> getTravelPackages() {
		return travelPackages;
	}

	public void setTravelPackages(List<Package> travelPackages) {
		this.travelPackages = travelPackages;
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

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingType=" + bookingType + ", description=" + description
				+ ", bookingTitle=" + bookingTitle + ", bookingDate=" + bookingDate + ", travelPackages="
				+ travelPackages + "]";
	}

}
