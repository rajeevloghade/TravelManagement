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
@Table(name = "Route")
public class Route {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "routeId_pk")
	private int routeId;
	private String routeTo;
	private String routeFrom;
	private Date departureTime;
	private Date arrivalTime;
	private Date doj;
	private String pickupPoint;
	private double fare;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "routeId_fk", referencedColumnName = "routeId")
	List<Travels> travels;

	public Route() {
		super();
	}

	public Route(String routeTo, String routeFrom, Date departureTime, Date arrivalTime, Date doj, String pickupPoint,
			double fare, List<Travels> travels) {
		super();
		this.routeTo = routeTo;
		this.routeFrom = routeFrom;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.doj = doj;
		this.pickupPoint = pickupPoint;
		this.fare = fare;
		this.travels = travels;
	}

	public Route(int routeId, String routeTo, String routeFrom, Date departureTime, Date arrivalTime, Date doj,
			String pickupPoint, double fare, List<Travels> travels) {
		super();
		this.routeId = routeId;
		this.routeTo = routeTo;
		this.routeFrom = routeFrom;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.doj = doj;
		this.pickupPoint = pickupPoint;
		this.fare = fare;
		this.travels = travels;
	}

	public List<Travels> getTravels() {
		return travels;
	}

	public void setTravels(List<Travels> travels) {
		this.travels = travels;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getRouteTo() {
		return routeTo;
	}

	public void setRouteTo(String routeTo) {
		this.routeTo = routeTo;
	}

	public String getRouteFrom() {
		return routeFrom;
	}

	public void setRouteFrom(String routeFrom) {
		this.routeFrom = routeFrom;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getPickupPoint() {
		return pickupPoint;
	}

	public void setPickupPoint(String pickupPoint) {
		this.pickupPoint = pickupPoint;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", routeTo=" + routeTo + ", routeFrom=" + routeFrom + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", doj=" + doj + ", pickupPoint=" + pickupPoint
				+ ", fare=" + fare + ", travels=" + travels + "]";
	}

}