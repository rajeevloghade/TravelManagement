package com.tms.service;

import java.util.List;

import com.tms.entity.Travels;

public interface ITravelsService {

	Travels addTravels(Travels travels);

	Travels updateTravels(Travels travels);

	Travels removeTravels(int travelId);

	Travels searchTravels(int travelId);

	List<Travels> viewTravels();

}
