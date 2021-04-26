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
import com.tms.entity.Travels;
import com.tms.service.ITravelsService;

@Controller("TravelsControllerImpl")
@RequestMapping("travels")
public class TravelsControllerImpl implements ITravelsController {
	private @Autowired ITravelsService travelsService;

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

}
