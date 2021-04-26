package com.tms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tms.dao.IRouteDao;
import com.tms.entity.Route;
import com.tms.service.IRouteService;

@Service("RouteServiceImpl")
public class RouteServiceImpl implements IRouteService{
	
	private @Autowired IRouteDao routeDao;
	
	@Override
	public Route addRoute(Route route) {
		// TODO Auto-generated method stub
		return routeDao.save(route);
	}

	@Override
	public Route updateRoute(Route route) {
		Route fetchedRoute = routeDao.findById(route.getRouteId()).get();
		fetchedRoute.setRouteFrom(route.getRouteFrom());
		fetchedRoute.setRouteTo(route.getRouteTo());
		fetchedRoute.setDepartureTime(route.getDepartureTime());
		fetchedRoute.setArrivalTime(route.getArrivalTime());
		fetchedRoute.setDoj(route.getDoj());
		fetchedRoute.setPickupPoint(route.getPickupPoint());
		fetchedRoute.setFare(route.getFare());
		return routeDao.save(fetchedRoute);
	}

	@Override
	public void removeRoute(int routeId) {
		// TODO Auto-generated method stub
		routeDao.deleteById(routeId);
	}

	@Override
	public Route searchRoute(int routeId) {
		// TODO Auto-generated method stub
		return routeDao.findById(routeId).get();
	}

	@Override
	public List<Route> viewRouteList() {
		// TODO Auto-generated method stub
		return routeDao.findAll();
	}

}
