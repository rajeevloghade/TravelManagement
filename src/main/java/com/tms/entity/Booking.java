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
	@Column(name = "bookingid_pk")
	int bookingId;
	@Column(name = "bookingtype")
	String bookingType;
	@Column(name = "description")
	String description;
	@Column(name = "bookingtitle")
	String bookingTitle;
	@Column(name = "bookingdate")
	Date bookingDate;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookingid_fk", referencedColumnName = "bookingid_pk")
	List<PackagePojo> packagePojos;

	public Booking() {
		super();
	}

	public Booking(String bookingType, String description, String bookingTitle, Date bookingDate,
			List<PackagePojo> packagePojos) {
		super();
		this.bookingType = bookingType;
		this.description = description;
		this.bookingTitle = bookingTitle;
		this.bookingDate = bookingDate;
		this.packagePojos = packagePojos;
	}

	public Booking(int bookingId, String bookingType, String description, String bookingTitle, Date bookingDate,
			List<PackagePojo> packagePojos) {
		super();
		this.bookingId = bookingId;
		this.bookingType = bookingType;
		this.description = description;
		this.bookingTitle = bookingTitle;
		this.bookingDate = bookingDate;
		this.packagePojos = packagePojos;
	}

	public List<PackagePojo> getTravelPackages() {
		return packagePojos;
	}

	public void setTravelPackages(List<PackagePojo> packagePojos) {
		this.packagePojos = packagePojos;
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
				+ ", bookingTitle=" + bookingTitle + ", bookingDate=" + bookingDate + ", packagePojos=" + packagePojos
				+ "]";
	}

}
