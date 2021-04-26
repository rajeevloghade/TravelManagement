package com.tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.entity.Route;

public interface IRouteDao extends JpaRepository<Route, Integer> {

}
