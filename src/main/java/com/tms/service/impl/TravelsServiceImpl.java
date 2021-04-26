package com.tms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tms.dao.ITravelsDao;
import com.tms.entity.Travels;
import com.tms.service.ITravelsService;

@Service("TravelsServiceImpl")
public class TravelsServiceImpl implements ITravelsService {

	private @Autowired ITravelsDao travelsDao;

	@Override
	public Travels addTravels(Travels travels) {
		return travelsDao.save(travels);
	}

	@Override
	public Travels updateTravels(Travels travels) {
		Travels fetchedTravel = travelsDao.findById(travels.getTravelsId()).get();
		fetchedTravel.setTravelsName(travels.getTravelsName());
		fetchedTravel.setAgentName(travels.getAgentName());
		fetchedTravel.setAddress(travels.getAddress());
		fetchedTravel.setContact(travels.getContact());
		return travelsDao.save(fetchedTravel);
	}

	@Override
	public void removeTravels(int travelId) {
		travelsDao.deleteById(travelId);
	}

	@Override
	public Travels searchTravels(int travelId) {
		return travelsDao.findById(travelId).get();
	}

	@Override
	public List<Travels> viewTravels() {
		return travelsDao.findAll();
	}

}
