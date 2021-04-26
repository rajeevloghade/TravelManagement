package com.tms.service;

import java.util.List;

import com.tms.entity.Route;

public interface IRouteService {
	Route addRoute(Route route);

	Route updateRoute(Route route);

	void removeRoute(int rid);

	Route searchRoute(int rid);

	public List<Route> viewRouteList();
}
