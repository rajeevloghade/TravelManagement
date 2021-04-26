package com.tms.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tms.controller.ITravelsController;
import com.tms.entity.Booking;
import com.tms.entity.Route;
import com.tms.entity.Travels;
import com.tms.service.IBookingService;
import com.tms.service.IRouteService;
import com.tms.service.ITravelsService;

@Controller("TravelsControllerImpl")
@RequestMapping("travels")
public class TravelsControllerImpl implements ITravelsController {
	private @Autowired ITravelsService travelsService;
	private @Autowired IBookingService bookingService;
	private @Autowired IRouteService routeService;

	@PostMapping("addTravels")
	@Override
	public Travels addTravels(@RequestBody Travels travels) {
		return travelsService.addTravels(travels);

	}

	@PutMapping("updateTravels")
	@Override
	public Travels updateTravels(@RequestBody Travels travels) {
		return travelsService.updateTravels(travels);

	}

	@DeleteMapping("removeTravels/{travelId}")
	@Override
	public void removeTravels(@RequestParam int travelId) {
		travelsService.removeTravels(travelId);
	}

	@GetMapping("searchTravels/{travelId}")
	@Override
	public Travels searchTravels(@RequestParam int travelId) {
		return travelsService.searchTravels(travelId);
	}

	@GetMapping("viewTravels")
	@Override
	public List<Travels> viewTravels() {
		return travelsService.viewTravels();
	}

	@PostMapping("makeBooking")
	@Override
	public Booking makeBooking(@RequestBody Booking booking) {
		// TODO Auto-generated method stub
		return bookingService.makeBooking(booking);
	}

	@DeleteMapping("cancelBooking/{bookingId}")
	@Override
	public void cancelBooking(@RequestParam int bookingId) {
		// TODO Auto-generated method stub
		bookingService.cancelBooking(bookingId);

	}

	@GetMapping("viewBooking/{bookingId}")
	@Override
	public Booking viewBooking(@RequestParam int bookingId) {
		// TODO Auto-generated method stub
		return bookingService.viewBooking(bookingId);
	}

	@GetMapping("viewallbooking")
	@Override
	public List<Booking> viewAllBooking() {
		return bookingService.viewAllBooking();
	}

	@PostMapping("addRoute")
	@Override
	public Route addRoute(@RequestBody Route route) {
		return routeService.addRoute(route);
	}

	@PutMapping("updateRoute")
	@Override
	public Route updateRoute(@RequestBody Route route) {
		return routeService.updateRoute(route);
	}

	@DeleteMapping("removeRoute/{routeId}")
	@Override
	public void removeRoute(@RequestParam int routeId) {
		routeService.removeRoute(routeId);
	}

	@GetMapping("searchRoute/{routeId}")
	@Override
	public Route searchRoute(@RequestParam int routeId) {
		return routeService.searchRoute(routeId);
	}

	@GetMapping("viewRoute")
	@Override
	public List<Route> viewRouteList() {
		return routeService.viewRouteList();
	}

}
